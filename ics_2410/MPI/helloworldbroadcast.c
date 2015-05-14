// Broadcast the words hello world to the rest of the 
//of the processors

#include <stdio.h>
#include <mpi.h>

int main (int argc, char *argv[])
{
	int i,root, my_rank,my_size,number=1000;
	MPI_Status status;

	MPI_Init(&argc,&argv);
	MPI_Comm_size(MPI_COMM_WORLD, &my_size);
	MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);

	if (my_rank == 0)
	{
	my_rank = root;
	MPI_Bcast(&number,1,MPI_INT,0,MPI_COMM_WORLD);
	for (i=1;i<my_size;i++)
		{
		printf("Broadcasting %d to processor %d\n", number,i);
		}
	}
	else
 	{
	/*MPI_Recv(&number,1,MPI_INT,0,0,MPI_COMM_WORLD,&status);
	for (i=1;i<my_size;i++)
		{
		printf("processor %d recieving.. %d from %d\n", i,number,root);
		}
	*/
	printf("processor %d recieving.. %d from %d\n", my_rank,number,root);
	}
	
	
	MPI_Finalize();
return 0;
}
