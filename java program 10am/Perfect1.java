class Perfect1
{
	public static void main(String[] args) 
	{
		int n=28;  
		int sum=0;
		//int temp=n;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
				i++;
		}		
			
       if(sum==n)
		{
		   System.out.println("perfect number");
		  
	   } 
	
	   else
		{
		  System.out.println("not a perfect number");
	   }

		

			}
	
		
}
