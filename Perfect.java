//import java.uti.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter higher value");
			//int n=s.nextInt();
		//System.out.println("enter lower value");
		int n=1;
		while(n<=1000)
		{
			int sum=0;
			int i=1;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
				i++;
			}
			if(sum==n)
			{
				System.out.println(n+" is perfect number");
			}
			n++;
		}
	   /*else
		{
		   System.out.println(n+" is not a perfect number");
	   }*/



			}
		
		
}
