// write a program to check  perfect number using method

class M4
{
	public static int perfect(int n)
	{
		int sum=0;
		//int n=6;
		int i=1;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int n=6;
		
			int res=perfect(n);
		
			if(res==n)
		
		System.out.println(n +"perfect number");
		
	}
}
