class Forfibbonacci 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		//int i=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=7;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
