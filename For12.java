class For12
{
	public static void main(String[] args) 
	{
		int n=346789;
		int sum=0;
		for( ;n>0; )
		
	
		
		{
			int digit=n%10;
			
			if(n%2!=0)
				sum=sum+digit;
				n=n/10;
		}
		
		System.out.println(sum);
			
			
		
		
	}
}
