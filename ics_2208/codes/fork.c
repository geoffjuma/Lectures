//This program spawns or folks another process and displays

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main (int argc, int *argv[])
	{
	int pid_t, chld_pid;
	
	//printf ("The main process id is %d\n", (int)getpid());
	chld_pid = fork();
		if (chld_pid > 0)
			{
			printf ("This is the main process with id %d\n", (int) getpid());
			printf ("The child process id %d\n", chld_pid);
			}
		else 
			{
			printf ("This is the child process with id %d\n", chld_pid);
			}
	return 0;
	}
