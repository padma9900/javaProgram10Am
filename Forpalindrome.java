class Forpalindrome 
{
	public static void main(String[] args) 
	{
		int temp=101;
		int rev=0;
		
		for(int num=temp;num>0;num=num/10)
		{
			int digit=num%10;
		

			rev=rev*10+digit;
		}
		if(rev==temp)
		{
		System.out.println(temp +"is a palindrome number");
		}
		else
			{
		System.out.println(temp +"is not a palindrome number");
		}
	}
}
