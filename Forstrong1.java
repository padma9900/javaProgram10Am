import java.util.Scanner;
class	Forstrong1 
{
	public static void main(String[] arg) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter lower value");
		int lr=s.nextInt();
		System.out.println("enter upper value");
		int ur=s.nextInt();
		
		int temp=lr;
		for(;temp<=ur;temp++)
		{
		
		int sum=0;
		
		for(int num=temp;num>0;num=num/10)
		{
		
		int fact =1;
		

		for(int digit=num%10; digit>0;digit-- )
		{
			fact=fact*digit;
			
		}
		
		sum=sum+fact;
		}

		if(sum==temp)

		{

		System.out.println("strong number" +temp);
		}}
	}
}
