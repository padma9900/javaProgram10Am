class Mobile 
{
	String brand,RAM,ROM;
	int price;

	void Mob()
	{
System.out.println("texting");
System.out.println("calling");
System.out.println("image capturing");
	}
	public static void main(String[] args) 
	{
	Mobile b1=new Mobile();

  b1.brand="redmi";
	 b1.price=10000;
	 b1.RAM="6gb";
	b1.ROM="128gb";

Mobile b2=new Mobile();

   b2.brand="sumsung";
	 b2.price=10000;
	 b2.RAM="4gb";
	b2.ROM="64gb";

	Mobile b3=new Mobile();

   b3.brand="vivo";
	 b3.price=10000;
	 b3.RAM="8gb";
	b3.ROM="128gb";

	b1.Mob();
	System.out.println("");
		System.out.println(b1.brand+ ""+b1.price+""+b1.RAM+""+b1.ROM);
		System.out.println(b3.brand+ ""+b3.price+""+b3.RAM+""+b3.ROM);
		System.out.println(b2.brand+ ""+b2.price+""+b2.RAM+""+b2.ROM);
		

	}
}
