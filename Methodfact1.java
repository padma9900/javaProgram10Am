//write a program to check factorial number using method
import java.util.Scanner;
class Methodfact1 
{
	public static int factorial()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		int result=factorial();
		System.out.println(result);
	}
}
