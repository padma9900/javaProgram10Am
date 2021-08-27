class Watch
{
	String clr,brand,type;
		int price;

	void time()
	{
	System.out.println("it shows time");
	}
	public static void main(String[] args) 
	{
		Watch w=new Watch();
		w.time();

		w.clr="gold";
		w.brand="sonata";
		w.price=3000;

		Watch w1=new Watch();
		w1.time();
		w1.clr="black";
		w1.brand="titan";
		w1.price=4000;

	
       Watch w2=new Watch();
		w2.time();
		w2.clr="silver";
		w2.brand="fastrack";
		w2.price=5000;

		System.out.println(w.clr+"  "+w.brand+"  "+w.price);
		w.time();
		System.out.println(w1.clr+"  "+w1.brand+"  "+w1.price);
		w1.time();
		System.out.println(w2.clr+"  "+w2.brand+"  "+w2.price);
		w2.time();
	}
}
