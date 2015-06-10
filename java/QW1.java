public class QW1
{
	private int a;
	private int b;

	public QW1(int i, int j)
	{
		a =i;
		b = j;
	}
	public QW1(int i)
	{
		a = i;
		b = i;
	}
	public void show()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		final int ARRAY_SIZE = 10;
		int a[] = new int[ARRAY_SIZE];
		int b[] = {0,1,2,3,4,5,6,7,8,9};
		for (int i =0; i<=b.length;i++)
		{
			System.out.print(b[i]);
			QW1 myObject = new QW1(20,10);
			myObject.show();
		}
	}
}