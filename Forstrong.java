class	Forstrong 
{
	public static void main(String[] arg) 
	{
		int temp=145;
		
		int sum=0;
		
		for(int num=temp;num>0;num=num/10)
		{
		
		int fact =1;
		

		for(int digit=num%10; digit>0;digit-- )
		{
			fact=fact*digit;
			
		}
		sum=sum+fact;
		}
		if(sum==temp)
		{

		System.out.println("strong number" +sum);
		}
	}
}
