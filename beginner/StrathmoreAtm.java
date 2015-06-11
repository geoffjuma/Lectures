import java.io.*;
import java.util.Scanner;
public class StrathmoreAtm
{
	public static Scanner myscanner = new Scanner(System.in);
	private static double balance;
	private final static int pin =1234; 

	StrathmoreAtm()
	{
		this.balance = balance;

	}
	public double depositMoney(double amount)
	{
		return balance +=amount;
	}
	public double withdrawMoney(double amount)
	{
		return balance -=amount;
	}
	public double getBalance()
	{
			return balance;
	}
	public static int getPin()
	{
		//get the pin from the user

		System.out.print("Please enter the PIN:");
		//Scanner myscanner = new Scanner(System.in);
		int mypin = myscanner.nextInt();
		return mypin;
	}
	public static void incorrectPin()
	{
		int counter = 2;
		System.out.println("INCORRECT PIN!!! You ONLY have "+counter--+" more attempts!!");
				if (getPin()==pin)
				{
					getOptions();
				}
				else
				{
					System.out.println("INCORRECT PIN!!! You ONLY have "+counter--+" more attempts!!");
					if (getPin()==pin)
					{
						getOptions();
					}
				}
	}

	public static void getOptions()
	{
		StrathmoreAtm myAtm = new StrathmoreAtm();
		System.out.println(	"[a] To READ your current balance:");
		System.out.println(	"[b] To DEPOSIT money into the account");
		System.out.println(	"[c] To WITHDRAW money from the account");
		System.out.println( "[e] To ESCAPE ");
		System.out.print("PLEASE CHOOSE OPTIONS [a|b|c|e]: ");

				char options = myscanner.next().charAt(0);
				switch (options)
				{
					case 'a':
					balance = myAtm.getBalance();
					System.out.printf("You have %,.2f ! \n",myAtm.balance);
					break;
					case 'b':
					try
					{
						System.out.print("Please enter the amount to be desposited: ");
						double amount = myscanner.nextDouble();
						myAtm.balance = myAtm.depositMoney(amount);
						System.out.printf("You have deposited %,.2f in your account! Your new balance is %,.2f \n",amount,myAtm.balance);	
					} catch (Exception e)
					{
						System.out.println("You have an error "+e);
					}
					
					break;
					case 'c':
					try
					{
						System.out.print("Please enter the amount to be withdrawn: ");
						double withdaw = myscanner.nextDouble();	
						if (myAtm.balance<withdaw)
						{
							System.out.println("Sorry!, You have insufficient funds in your account!");
							System.out.printf("Your balance is %,.2f \n ",balance);
						}
						else
						{
							myAtm.balance = myAtm.withdrawMoney(withdaw);
							System.out.printf("You have dwithdrawn %,.2f in your account! Your new balance is %,.2f \n",withdaw,myAtm.balance);
						}
					} catch (Exception e)
					{
						System.out.println("Expecting an integer or float here "+e);
					}
				
					break;
					case 'e':
					System.exit(0);
					default:
					System.out.println("Invalid input! Try again");
					if (getPin() ==pin)
					{
						getOptions();
					}
					else
					{
						incorrectPin();
					}
				}
			}
	public static void main(String[] args) 
	{
		///int counter = 2;
			if(getPin()==pin)
				{
					while (true)
					{
						getOptions();	
					}
					
				}
			else 
			{
				incorrectPin();
			}
	}
}