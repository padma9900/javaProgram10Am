// write a program tocheck strong number using method

class  M2
{
	public static int fact(int digit)
	{
		int fact=1;
		while(digit>0)
		{
			fact=fact*digit;
			digit--;
		}
		return fact;
	}

	public static void main(String[] args)
	{
		int n=145;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int digit=n%10;
		int fact=fact(digit);
		sum=sum+fact;
		n=n/10;
	}
	
		System.out.println(temp +"strong number");
	}
	
}
