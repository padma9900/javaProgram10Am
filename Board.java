// saved filename BOARD
//wap to (using name directly we can acccess static member)

class Main0 
{
	static String fan="fan rotate";   //accessing value
	static void b1()
	{
     System.out.println("switch on");
	  System.out.println("switch off");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(fan);  //by using directly name //a=10;
		Main0.b1();              // here main. is optional bcoz directly calling by name if i write main r not it ll giv o/p
		System.out.println("main ends");
	}
}

//wap to(acess the static member in other class by using . operator) classname.identifier=main1.a

class Main1
{
	static String mob="Sumsung";
	static String RAM="6GB";
	static String ROM="128GB";
	
	static int price=20000;

	static void b1()
	{
     System.out.println("texting");
     System.out.println("calling");
     System.out.println("image capturing");
	}

}


class Main2
{

public static void main(String[] args) 
	{
		System.out.println("main starts");
		Main1.b1();
		System.out.println(Main1.mob);
		System.out.println(Main1.RAM);
		System.out.println(Main1.ROM);
		System.out.println(Main1.price);
		System.out.println("main starts");
	}
}

// wap to (accessing non static member inside a same class  create an obeject)



class Main3
{
    int price=10;
	String brand="camlin";
	String clr="blue";
	 void b1()
	{
      System.out.println("marker writes");
	}
	public static void main(String[] args) 
	{
		      System.out.println("main starts"); 
			 Main3 b3=new Main3();
			  b3.b1();
			  System.out.println(b3.price);
			   System.out.println(b3.brand);
			    System.out.println(b3.clr);
				
		      System.out.println("main ends");
	}




}

// wap to (accessing non static member inside a another class  create an obeject)


class Main4
{
    int a=100;
	int b=200;
	 void b1()
	{
      System.out.println("demo class");
	}
}

class Main5
{

public static void main(String[] args) 
	{
		System.out.println("main starts");
		Main4 b4=new Main4();
		b4.b1();
		System.out.println(b4.a);
		System.out.println(b4.b);
		System.out.println(b4.a+" "+b4.b);
		System.out.println("main starts");
	}
}