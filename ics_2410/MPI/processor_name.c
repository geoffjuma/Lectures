// Gets the name of the processor and prints on the screen

#include <stdio.h>
#include <mpi.h>
#include <unistd.h>

int main (int argc, char* argv[])
	{
	int my_rank, my_size,length;
	char hostname[MPI_MAX_PROCESSOR_NAME];

	MPI_Init(&argc,&argv);
	MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
	MPI_Comm_size(MPI_COMM_WORLD, &my_size);

	MPI_Get_processor_name(hostname,&length);
	printf ("I am process %d of %d from processor %s\n",my_rank,my_size,hostname);
	MPI_Finalize();
return 0;
	}
