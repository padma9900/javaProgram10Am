// saved in ac using this keyword
class Ac 
{
	static String brand="voltas";
int rating;
	int price;
	String clr;


	Ac(int rating,int price,String clr)
	{
		this.rating=rating;
		this.price=price;
		this.clr=clr;
	}

	void cooling()
	{
System.out.println("cooling");
System.out.println("filter air");
System.out.println("heating");
	}
}


class MainRunner
{

	public static void main(String[] args) 
	{
		Ac a=new Ac(3,20000,"white");
		a.cooling();

		System.out.println(a.rating+" "+a.price+"  "+a.clr+"   "+Ac.brand);

		Ac a1=new Ac(5,15000,"blue");
		System.out.println(a1.rating+" "+a1.price+"  "+a1.clr+"   "+Ac.brand);
	}
}
