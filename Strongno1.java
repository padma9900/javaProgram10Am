
//import java.util.Scanner;
class Strongno1
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the lower numbers");
		//int temp=s.nextInt();
			
		
		int temp=1;
		//int sum=0;
	while(temp<=1000)
		{
		int sum=0;
		int num=temp;
		
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
		if(sum==temp)
			{
			System.out.println(temp+ "strong number");
			}
			
		temp++;
		}
		

	}}
