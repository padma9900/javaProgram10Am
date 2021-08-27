// saved filename Main
//wap to (using name directly we can acccess static member)

class Main0 
{
	static int a=10;   //accessing value
	static void m1()
	{
     System.out.println("demo class");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(a);  //by using directly name //a=10;
		Main.m1();              // here main. is optional bcoz directly calling by name if i write main r not it ll giv o/p
		System.out.println("main ends");
	}
}

//wap to(acess the static member in other class by using . operator) classname.identifier=main1.a

class Main1
{
	static int a=10;
	static void m1()
	{
      System.out.println("demo class");
	}

}


class Main2
{

public static void main(String[] args) 
	{
		System.out.println("main starts");
		Main1.m1();
		System.out.println(Main1.a);
		System.out.println("main starts");
	}
}

// wap to (accessing non static member inside a same class  create an obeject)



class Main3
{
    int a=10;
	 void m1()
	{
      System.out.println("demo class");
	}
	public static void main(String[] args) 
	{
		      System.out.println("main starts"); 
			  Main3 m3=new Main3();
			  m3.m1();
			        System.out.println(m3.a);
					      System.out.println("main ends");
	}




}

// wap to (accessing non static member inside a another class  create an obeject)


class Main4
{
    int a=10;
	 void m1()
	{
      System.out.println("demo class");
	}
}

class Main5
{

public static void main(String[] args) 
	{
		System.out.println("main starts");
		Main4 m4=new Main4();
		m4.m1();
		System.out.println(m4.a);
		System.out.println("main starts");
	}
}