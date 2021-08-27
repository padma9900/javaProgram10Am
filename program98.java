class Program98 
{
	int a=20;
	static String s="rama"; //static member
	static int b=45;
	static void m1()
	{
	}
	void m2()  // non static member
	{
	}
	static int m3()
	{
		return 10;
	}

	public static void main(String[] args) 
	{
		m1(); //static member
		System.out.println("Hello World!");
		m2();  //non static member
		int res=m3();
		System.out.println(res);

	}
}
