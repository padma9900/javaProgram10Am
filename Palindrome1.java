
class Palindrome1

{
	public static void main(String[] args) 
	{
		
	int i=1;
	while(i<=1000)
		{
		int rev=0;
		int n=i;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		
		}
		if(rev==i)
		{
			System.out.println("it is a palindrome"+ rev);
		}
			i++;
		}
			//else
			//{
			//	System.out.println("not a palindrome");
			
		//	}
		
		
	}
}
