import java.util.Scanner;
class SwapStrongno1000
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the lower numbers");
		int lr=s.nextInt();
			
		System.out.println("enter the uppper numbers");
		int ur=s.nextInt();
		System.out.println();
if(lr>ur)
		{
	lr=lr+ur;
	ur=lr-ur;
	lr=lr-ur;
		}
		
	while(lr<=1000)
		{
		int sum=0;
		int num=lr;
		
	   while(num>0)
		{
		   int digit=num%10;
		   int fact=1;
		   while(digit>0)
			{
		   fact=fact*digit;
		   digit--;
		   }
		 
		   sum=sum+fact;
		   num=num/10;
		}
		if(sum==lr)
			{
			System.out.println(sum);
			}
			
		lr++;
		}
		

	}
	}
