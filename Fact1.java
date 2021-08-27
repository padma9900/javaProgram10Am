import java.util.Scanner;
class Fact1
{
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		while(n>0)
		{
			if(n%2==0)
			{
	int digit=n%10;
	
	System.out.println(digit);

			n=n/10;
			//}
			n++;
		}
		//System.out.println(digit);

	}
}
}