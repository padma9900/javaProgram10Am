import java.util.Scanner;
class SwapPerfectrange1000 //used for swap from higher range(value) to lower range (value)
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the lower range");
			int lr=s.nextInt();
		System.out.println("enter the upper range");
		    int ur=s.nextInt();
		//int n=1; no need ofn=1 bcoz we can enter any value
		if(lr>ur)
		{
			lr=lr+ur;//for swaping w/o using temparory condition
			ur=lr-ur;
			lr=lr-ur;
		
		}
		while(lr<=ur)
		{
			int n=lr;
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
				System.out.println(n+" is perfect number"  +sum);
			}
			lr++;
		}
	   /*else  we dont want not perfect number but we only want perfect no
		{
		   System.out.println(n+" is not a perfect number");
	   }*/



			}
		
		
}
