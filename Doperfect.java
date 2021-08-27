class Doperfect 
{
	public static void main(String[] args) 
	{
		int n=6;
		int sum=0;
		int i=1;
		do{

		if(n%i==0)
			
			sum=sum+i;
			i++;
		
		}while(i<=n/2);
		if(sum==n)
			{

		System.out.println(n + "perfect number");
			}
			else
				{

		System.out.println("not a perfect number");
			}

	}
}
