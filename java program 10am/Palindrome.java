import java.util.Scanner;
class Palindrome

{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check");
		int n=s.nextInt();
	
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		
		}
		if(rev==temp)
		{
			System.out.println("it is a palindrome");
		}
			else
			{
				System.out.println("not a palindrome");
			
			}
		
		
	}
}
