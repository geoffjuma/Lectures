/* DESCRIPTION:  
*   MPI Matrix Multiply - C Version
*   In this code, the master task distributes a matrix multiply
*   operation to processors-1 worker processors
******************************************************************************/
#include "mpi.h"
#include <stdio.h>
#include <stdlib.h>

#define SIZE 4
#define MASTER 0               /* taskid of first task */
#define FROM_MASTER 1          /* setting a message type */
#define FROM_WORKER 2          /* setting a message type */

int main (int argc, char *argv[])
{
int	my_size,              /* number of tasks in partition */
	my_rank,                /* a task identifier */
	numworkers,            /* number of worker tasks */
	source,                /* task id of message source */
	dest,                  /* task id of message destination */
	mtype,                 /* message type */
	rows,                  /* rows of matrix A sent to each worker */
	averow, extra, offset, /* used to determine rows sent to each worker */
	i, j, k, rc;           /* misc */
double	a[SIZE][SIZE],           /* matrix A to be multiplied */
	b[SIZE][SIZE],           /* matrix B to be multiplied */
	c[SIZE][SIZE],
	start,end;          /* result matrix C */
MPI_Status status;

MPI_Init(&argc,&argv);
start = MPI_Wtime();
MPI_Comm_rank(MPI_COMM_WORLD,&my_rank);
MPI_Comm_size(MPI_COMM_WORLD,&my_size);
if (my_size < 2 ) {
  printf("Need at least two MPI tasks. Quitting...\n");
  MPI_Abort(MPI_COMM_WORLD, rc);
  exit(1);
  }
numworkers = my_size-1;


/**************************** master task ************************************/
   if (my_rank == MASTER)
   {
      printf("mpi_mm has started with %d processors.\n",my_size);
      printf("Matrix *****A*********\n");
      for (i=0; i<SIZE; i++)
	{
         for (j=0; j<SIZE; j++)
		{
           	a[i][j]= i+j;
		printf("%6.2f   ", a[i][j]);
		}
	printf("\n");
	}	

      printf("Matrix *****B*********\n");	

      for (i=0; i<SIZE; i++)
	{
         for (j=0; j<SIZE; j++)
        	{   
	 	b[i][j]= i+j;
	 	printf("%6.2f   ", b[i][j]);
		}
	printf("\n");
	}

      /* Send matrix data to the worker tasks */
      averow = SIZE/numworkers;
      extra = SIZE%numworkers;
      offset = 0;
      mtype = FROM_MASTER;
      for (dest=1; dest<=numworkers; dest++)
      {
         rows = (dest <= extra) ? averow+1 : averow;   	
         printf("Sending %d rows to processor %d offset=%d\n",rows,dest,offset);
         MPI_Send(&offset, 1, MPI_INT, dest, mtype, MPI_COMM_WORLD);
         MPI_Send(&rows, 1, MPI_INT, dest, mtype, MPI_COMM_WORLD);
         MPI_Send(&a[offset][0], rows*SIZE, MPI_DOUBLE, dest, mtype,MPI_COMM_WORLD);
         MPI_Send(&b, SIZE*SIZE, MPI_DOUBLE, dest, mtype, MPI_COMM_WORLD);
         offset = offset + rows;
      }

      /* Receive results from worker tasks */
      mtype = FROM_WORKER;
      for (i=1; i<=numworkers; i++)
      {
         source = i;
         MPI_Recv(&offset, 1, MPI_INT, source, mtype, MPI_COMM_WORLD, &status);
         MPI_Recv(&rows, 1, MPI_INT, source, mtype, MPI_COMM_WORLD, &status);
         MPI_Recv(&c[offset][0], rows*SIZE, MPI_DOUBLE, source, mtype, MPI_COMM_WORLD, &status);
         printf("Received results from processor %d\n",source);
      }

	end = MPI_Wtime();
      /* Print results */
      printf("******************************************************\n");
      printf("Result Matrix:\n");
      for (i=0; i<SIZE; i++)
      {
         printf("\n"); 
         for (j=0; j<SIZE; j++) 
            printf("%6.2f   ", c[i][j]);
      }
      printf("\n******************************************************\n");
      printf ("The time taken is %6.2f\n", end-start);
      printf ("Done.\n");
   }


/**************************** worker task ************************************/
   if (my_rank > MASTER)
   {
      mtype = FROM_MASTER;
      MPI_Recv(&offset, 1, MPI_INT, MASTER, mtype, MPI_COMM_WORLD, &status);
      MPI_Recv(&rows, 1, MPI_INT, MASTER, mtype, MPI_COMM_WORLD, &status);
      MPI_Recv(&a, rows*SIZE, MPI_DOUBLE, MASTER, mtype, MPI_COMM_WORLD, &status);
      MPI_Recv(&b, SIZE*SIZE, MPI_DOUBLE, MASTER, mtype, MPI_COMM_WORLD, &status);

      for (k=0; k<SIZE; k++)
         for (i=0; i<rows; i++)
         {
            c[i][k] = 0.0;
            for (j=0; j<SIZE; j++)
               c[i][k] = c[i][k] + a[i][j] * b[j][k];
         }
      mtype = FROM_WORKER;
      MPI_Send(&offset, 1, MPI_INT, MASTER, mtype, MPI_COMM_WORLD);
      MPI_Send(&rows, 1, MPI_INT, MASTER, mtype, MPI_COMM_WORLD);
      MPI_Send(&c, rows*SIZE, MPI_DOUBLE, MASTER, mtype, MPI_COMM_WORLD);
   }
   MPI_Finalize();
}
