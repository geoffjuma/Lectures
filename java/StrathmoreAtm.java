import java.io.*;
import java.util.Scanner;
public class StrathmoreAtm
{
	private double balance;

	StrathmoreAtm(double balance)
	{
		this.balance = balance;

	}
	public double depositMoney(double amount)
	{
		balance +=amount;
		return balance;
	}
	public double withdrawMoney(double amount)
	{
		balance -=amount;
		return balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args) 
	{
		StrathmoreAtm myAtm = new StrathmoreAtm(20000.00);
		Scanner myscanner = new Scanner(System.in);

		System.out.println("Please enter options [a|b|c|]");
		int options = myscanner.next().charAt(0);
		switch (options)
		{
			case 'a':
				double myBal = myAtm.getBalance();
				System.out.println("The money in this account is: "+myBal);
				break;
			case 'b':
				System.out.print("Please enter the amount to be desposited: ");
				double amount = myscanner.nextDouble();
				myBal = myAtm.depositMoney(amount);
				System.out.println(amount+" has been deposited in your account! Your new balance is "+myBal);
				break;
			case 'c':
				System.out.print("Please enter the amount to be withdrawn: ");
				double withdaw = myscanner.nextDouble();
				if (myAtm.balance<withdaw)
					{
						System.out.println("Sorry you have insufficient funds in this account!!");
					}
				else
					{
						myBal = myAtm.withdrawMoney(withdaw);
						System.out.println(withdaw+ " has been withdawn from your account! Your new balance is "+myBal);
					}
				
				break;
			default:
				System.out.println("Invalid input! Try again");
		}
	
		;


	}

}