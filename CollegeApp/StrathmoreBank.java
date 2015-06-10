class Person
{
	private String name;
	private String phone;
	private String email;
//Constructor
	public Person(String name, String phone, String email)
	{
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName()
	{
		return name;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getMail()
	{
		return email;
	}

	
	
}

class Student extends Person
{
	private String admission;
	private char grade;
	public Person person;
//constructor
	public Student(Person person,String admission, char grade)
	{
		super("","","");
		this.person = person;
		this.admission = admission;
		this.grade = grade;
	}
	public char getGrades()
	{
		return grade;
	}
	public String getAdmission()
	{
		return admission;
	}
	//Student john = new Student();
}
class Account extends Person
{
	private double balance;
	public Person person;

	public Account(Person person,double balance)
	{
		super("","","");
		this.balance = balance;
		this.person = person;

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
	//Account myAccount = new Account(1000.00);
}
public class StrathmoreBank
{
	public static void main(String[] args) 
	{
		Person john = new Person("John","23456","john@strathmore.edu");
		Account myAccount = new Account(john,1000.00);
		System.out.println(myAccount.john.getName());
	}
}