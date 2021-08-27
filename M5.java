//write a program using method overloading
class M5 
{
	public static int insurance(int a,int b)
	{
		if(a<=5 && b>=55)
			return a;
	}
	public static int insurance(int a,int b,int c)
	{
		if(a<=5 && b>=55 && c>65)
			return b;
	}
	public static void main(String[] args) 
	{
		int a=insurance(5,55,65);
		System.out.println(a);
		//System.out.println(b);
	}
}
