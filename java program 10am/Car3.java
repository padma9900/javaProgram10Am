// wap for constructor overloading using parameterized

class Car3 
{
	static String brand="jaguar";
	int price;
	String clr;

	Car3(String c,int p)
	{
		 price=p;
		 clr=c;
	}
		Car3()
	{
			price=1000000;
			clr="black";
	}
	Car3(String c)
	{

		price=10000000;
		clr=c;

	}
	void drive()
	{
		System.out.println("long drive");

	}
}
	class MainRunner1
	{
	public static void main(String[] args) 
	{
		Car3 d=new Car3("red",100000);
		System.out.println(d.price+"  "+d.clr+"  "+Car2.brand);
		Car3 d1=new Car3();
		System.out.println(d1.price+"   "+d1.clr+"   "+Car2.brand);
		Car3 d2=new Car3("black");
		System.out.println(d2.price+"   "+d2.clr+"  "+Car2.brand);
	}
	}