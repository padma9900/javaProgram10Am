class M8


{
	public static int sum(int n)
	{
		int sum=0;
		int i=1;
		while(i<=10)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
			return sum;
		}


	public static void main(String[]args) 
	{
		int res=sum(10);
		System.out.println(res);
	}
}
