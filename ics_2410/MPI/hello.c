//Sends a message "hello between two processes"

#include <stdio.h>
#include <string.h>
#include <mpi.h>

int main(int argc, char* argv[])
	{
	int my_rank, my_size;
	
	MPI_Init(&argc,&argv);
	MPI_Comm_rank (MPI_COMM_WORLD,&my_rank);
	MPI_Comm_size (MPI_COMM_WORLD, &my_size);
	printf ("Hello world from process %d of %d\n",my_rank,my_size);
	MPI_Finalize();
	return 0;
	}
