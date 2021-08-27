class Forpalindrome1 
{
	public static void main(String[] args) 
	{
	
		for(int temp=11;temp<=1000;temp++)
		{
			
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
		
		}
		
	}
}
