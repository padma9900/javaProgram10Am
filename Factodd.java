import java.util.Scanner;
class Factodd
{
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		while(n>0)
		{
			
	int digit=n%10;
	if(digit%2!=0)
			{
	
	System.out.println(digit);
			}
			n=n/10;
		
			
		
	

	}
}
}