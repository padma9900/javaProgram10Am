class Marker 
{
	String clr,brand,type;
		int price;

		void write()
	{
System.out.println("marker pen writes");
	}
	public static void main(String[] args) 
	{
		Marker m=new Marker();
			m.write();

			m.clr="blue";
		m.brand="camlin";
		m.price=30;

		Marker m1=new Marker();
			m1.clr="black";
		m1.brand="cello";
		m1.price=20;
		m1.write();

	
       Marker m2=new Marker();
			m2.clr="red";
		m2.brand="doms";
		m2.price=40;
		m2.write();

    // System.out.println("");
		System.out.println(m.clr+"  "+m.brand+"  "+m.price);
		m.write();
		System.out.println(m1.clr+"  "+m1.brand+"  "+m1.price);
		m1.write();
		System.out.println(m2.clr+"  "+m2.brand+"  "+m2.price);
		m2.write();
	}
}
