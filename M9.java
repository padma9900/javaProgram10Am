class M9 
{
	public static int rev(int n)
	{
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			{
			rev=rev*10+digit;
			}
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int n=1021; //int rev=0;
		int res=rev(n);
			if(res==n)
		{
		System.out.println("palindrome"+n);
		}
		else
		{
      System.out.println("palindrome"+n);
		}
	}
}
