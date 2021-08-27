
// saved in Refrigerator1 wap for constructor using parameterized and constroctor overloading

class Refrigerator 
{
	static String brand="LG";
	int price;
	String clr;
	String door;
	int warrenty;
	int star;
	String voltage;
	 String storage;

	void refrigerator()
	     {
			System.out.println("ice making");
			System.out.println("coolling");
			System.out.println("food storage");
		}

Refrigerator(); 
	{
  clr="purple";
  warrenty=1;
  door="single";
  voltage="100v-290v";
  storage="190ltr";
  price=16990;
  star=3;
	}

Refrigerator(); 
	{
  clr="blue";
  warrenty=2;
  door="double";
  voltage="100v-290v";
  storage="160ltr";
  price=18990;
  star=4;
	}


Refrigerator(); 
	{
  clr="navvy blue";
  warrenty=0;
  door="single";
  voltage="100v-290v";
  storage="220ltr";
  price=50000;
  star=5;
	}
}
class MainRunning
{
	public static void main(String[] args) 
	{
		Refrigerator r=new Refrigerator();
		System.out.println(r.clr+"  "+r.warrenty+"   "+r.door+"  "+r.voltage+"   "+r.storage+"  "+r.price+"  "+r.star+Refrigerator.brand);

		Refrigerator r1=new Refrigerator();
		System.out.println(r1.clr+"  "+r1.warrenty+"   "+r1.door+"  "+r1.voltage+"   "+r1.storage+"  "+r1.price+"  "+r1.star+Refrigerator.brand);

		Refrigerator r2=new Refrigerator();
		System.out.println(r2.clr+"  "+r2.warrenty+"   "+r2.door+"  "+r2.voltage+"   "+r2.storage+"  "+r2.price+"  "+r2.star+Refrigerator.brand);
	}
}
