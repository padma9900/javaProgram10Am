class Doperfect1 
{
	public static void main(String[] args) 
	{
		int temp=1;
		do{

		int n=temp;
		int sum=0;
		int i=1;
		do{

		if(n%i==0)
			{
			sum=sum+i;
			}
			i++;
		
		}while(i<=n/2);
		if(sum==n)
			{

		System.out.println(n +"perfect number");
			}
		temp++;
			}while(temp<=1000);
			
		
		
	}
}
