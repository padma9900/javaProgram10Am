class Countdigit 
{
	public static void main(String[] args) 
	{
		int i=747487;
		int count=0;
		while(i>0)
		{
			//int digit=i%10;
			//count++;
			i=i/10;
			count++;
		}
		System.out.println(count);
	}
}
