// sends and recieve the word hello between two processes

#include <stdio.h>
#include <string.h>
#include <mpi.h>

int main(int argc, char* argv[])
	{
	int my_rank, my_size,number =12 ;
	//char message[20] ;
	MPI_Status status;
//initialize and get processor parameters
	MPI_Init(&argc,&argv);
	MPI_Comm_rank(MPI_COMM_WORLD,&my_rank);
	MPI_Comm_size(MPI_COMM_WORLD,&my_size);
	//strcpy(message, "hello fucking world");
//now send the messages
	if (my_rank==0)
		{
		MPI_Send(&number,20,MPI_CHAR,1,0,MPI_COMM_WORLD);
		printf ("Process %d sending %d to processor %d\n",my_rank,number,my_rank+1);
		}
	else if (my_rank==1)
		{
		MPI_Recv(&number,20,MPI_CHAR,0,0,MPI_COMM_WORLD,&status);
		printf("process %d has recieved %d\n",my_rank,number);
		}
	MPI_Finalize();
return 0;
	}
