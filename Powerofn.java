class Powerofn 
{
	public static void main(String[] args) 
	{
		
		int base =2;
		int exp=3;
		int pow=1;
		while (exp>0)
		{
			 pow=pow*base;
			exp--;
		}
		
		System.out.println(pow);
		
	
	}
}
