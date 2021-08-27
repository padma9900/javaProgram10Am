import java.util.Scanner;
class Fact
{
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		while(n>0)
		{
	int digit=n%10;
	System.out.println(digit);

			n=n/10;
		}
		

	}
}
