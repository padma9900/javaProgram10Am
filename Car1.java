//wap for zero paramiterized constroctor  saved in Car1

class Car1 
{
	static String brand="range rover";
	int price;
	String clr;

	Car1()
	{
         System.out.println("executing....");
		 price=900000;
		 clr="red";
	}
	void drive()
	{
		System.out.println("long drive");

	}
}
	class MainRunner
	{
	public static void main(String[] args) 
	{
		Car1 c=new Car1();
		System.out.println(c.price+"  "+c.clr+"  "+Car1.brand);
		Car1 c1=new Car1();
		System.out.println(c1.price+"   "+c1.clr+"   "+Car1.brand);
		Car1 c2=new Car1();
		System.out.println(c2.price+"   "+c2.clr+"  "+Car1.brand);
	}
}
// wap for parameterized constroctor

class Car2 
{
	static String brand="jaguar";
	int price;
	String clr;

	Car2(String c,int p)
	{
		 price=p;
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
		Car2 d=new Car2("red",100000);
		System.out.println(d.price+"  "+d.clr+"  "+Car2.brand);
		Car2 d1=new Car2("blue",2000000);
		System.out.println(d1.price+"   "+d1.clr+"   "+Car2.brand);
		Car2 d2=new Car2("black",30000000);
		System.out.println(d2.price+"   "+d2.clr+"  "+Car2.brand);
	}

	// eg for zero parameterized constructor
	}
	class Pen
{
	static String brand="blast";
	int price;
	String clr;

	Pen(String c,int p)
	{
		 price=p;
		 clr=c;
	}
	void drive()
	{
		System.out.println("long drive");

	}
}
	class MainRunner2
	{
	public static void main(String[] args) 
	{
		Pen p=new Pen("red",10);
		System.out.println(p.price+"  "+p.clr+"  "+Pen.brand);
		Pen p1=new Pen("blue",20);
		System.out.println(p1.price+"   "+p1.clr+"   "+Pen.brand);
		Pen p2=new Pen("black",30);
		System.out.println(p2.price+"   "+p2.clr+"  "+Pen.brand);
	}
	}


