class Refrigerator 
{
	String brand,clr,warrenty,door,voltage,storage;
		int star,price;

		void refrigerator()
	{
			System.out.println("ice making");
			System.out.println("coolling");
			System.out.println("food storage");
		}
	public static void main(String[] args) 
	{

		refrigerator();

  Refrigerator r=new Refrigerator(); 
	  r.brand="LG";
  r.clr="purple";
  r.warrenty="1yr";
  r.door="single";
  r.voltage="100v-290v";
  r.storage="190ltr";
  r.price=16990;
  r.star=3;

  Refrigerator r1=new Refrigerator(); 
	  r1.brand="whirpool";
  r1.clr="purple";
  r1.warrenty="1yr";
  r1.door="double";
  r1.voltage="100v-290v";
  r1.storage="245ltr";
  r1.price=19740;
  r1.star=2;

  Refrigerator r2=new Refrigerator(); 
	  r2.brand="samsung";
  r2.clr="grey";
  r2.warrenty="1yr";
  r2.door="side by side";
  r2.voltage="100v-290v";
  r2.storage="810ltr";
  r2.price=97990;
  r2.star=4;
  r.refrigerator();

		System.out.println(r.brand+""+r.clr+""+r.warrenty+""+r.door+""+r.voltage+""+r.storage+""+r.price+"rs"+r.star);
		  r.refrigerator();

		System.out.println(r1.brand+""+r1.clr+""+r1.warrenty+""+r1.door+""+r1.voltage+""+r1.storage+""+r1.price+"rs"+r1.star);
		System.out.println(r2.brand+""+r2.clr+""+r2.warrenty+""+r2.door+""+r2.voltage+""+r2.storage+""+r2.price+"rs"+r2.star);
	}
}
