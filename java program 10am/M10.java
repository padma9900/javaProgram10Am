class M10 
{
	public static int num(int i)
	{
		int sum=0;
		while(i>0)
		{
			int digit=i%10;
			if(digit%2==0)
			{
			sum=sum+i;
			}
			i=i/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int i=346789;
		int result=num(i);
		System.out.println(result);
	}
}
