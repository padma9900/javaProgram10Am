import java.util.Scanner;
class Strongnumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
       System.out.println("enter a number");
       int n=s.nextInt();
	   int temp=n;
	   int sum=0;
	   
	   while(n>0)
		{
		   int digit=n%10;
		   int fact=1;
		   while(digit>0)
			{
		   fact=fact*digit;
		   digit--;
		   }
		   sum=sum+fact;
		   n=n/10;
		}
		   if(sum==temp)
		{
			   System.out.println("it is a Strong number");
		}
		else
		{
		System.out.println("it is not a Strong number");
		}
		   
		   
		   
	}
}
