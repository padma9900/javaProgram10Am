import java.util.Scanner;
class P14 
{
	public static void main(String[]args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int days=366;
		if(a==days)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
	}
}
