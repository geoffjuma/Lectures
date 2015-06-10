// forking a list of process

#include <stdio.h>
#include <unistd.h>

int main (int argc, char* argv[])
	{
	int i, pid;
	printf("I am the parent process with id %d\n", (int)getppid());
	for (i = 0; i < atoi(argv[1]); i++)
	{
	pid = fork();
	if (pid < 0)
		{
		printf ("Segementation signal error");
		exit(1);
		}
	else if (pid == 0)
		{
		//pid = fork();
		printf ("I am child process number %d\t id %d\n", i+1, getpid());
		exit(0);
		}
	else 
		{
		wait(NULL);
		}
	}
	}
