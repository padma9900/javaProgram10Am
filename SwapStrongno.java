import java.util.Scanner;
class SwapStrongno1
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the lower numbers");
		int lr=s.nextInt();
			
		System.out.println("enter the upper numbers");
		int ur=s.nextInt();
while(lr<=ur)
		{
		int temp=lr;
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
		}
		

	}}