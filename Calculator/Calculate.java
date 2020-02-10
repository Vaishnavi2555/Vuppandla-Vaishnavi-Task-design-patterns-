import java.util.Scanner;
class Calculate
{
	private static Scanner s;
	public static void main(String args[])
	{
		s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int c;
		switch(n)
		{
		case 1:c=a+b;
		System.out.println("Addition="+c);
		case 2:c=a-b;
		System.out.println("Subtraction="+c);
		case 3:c=a*b;
		System.out.println("Multiplication="+c);
		case 4:c=a/b;
		System.out.println("Division="+c);
		
		}
	}
	
}
