import java.util.Scanner;
class Factsumeven
{
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0;
		while(n>0)
		{
			
	int digit=n%10;
	if(digit%2==0)
			{
		sum=sum+digit;
			}
	
	
			
			n=n/10;
		}
		System.out.println(sum);
			
		
	

	
}
}