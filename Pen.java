class Pen

{
	String clr="red";
	String brand="celllo";
	int price=50;
	void write()
	{
System.out.println("pen write");
	}

	public static void main(String[] args) 
	{
		Pen p=new Pen();
		p.write();
		System.out.println(p.clr);
		System.out.println(p.brand);
		System.out.println(p.price);
	}
}
