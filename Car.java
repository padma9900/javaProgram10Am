class Car 
{
	String brand="range rover";
	int price;
	String clr;
	Car()
	{
		System.out.println("EXCUTING.......");
		price=9000000;
		clr="Red";
	}
	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println(c.brand+" "+c.price+"  "+c.clr);
		Car c1=new Car();
		System.out.println(c1.brand+" "+c1.price+"  "+c1.clr);
	}
}
