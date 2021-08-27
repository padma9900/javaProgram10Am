class Forperfect1 
{
	public static void main(String[] args) 
	{
		int temp=1;
		for(int num=temp;temp<=1000;temp++)
		{

	
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		
		}
		
		if(sum==num)
		{
		System.out.println(num+"perfect number");
		}
		}
		
		
	}
}
