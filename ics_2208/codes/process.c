// Program to display the process id and process name in unix 

#include <stdio.h>
#include <unistd.h> 
int  main(int argc, int **argv[])
	{
	printf ("The process id is %d\n",(int) getpid());
	printf ("The parent process id is %d\n", (int) getppid());
	return 0;
	}
