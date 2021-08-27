
class Fan 
{
	static String brand="usha";
	int price;
	String clr;
	int blades;

	Fan(String a,int r,int b)
	{
	 price=r;
	clr=a;
	blades=b;
	}
	void rotate()
	{
    System.out.println("switch on");
	System.out.println("switch off");
	System.out.println("fan rotate");
	}
	/*void learn()
	{
		System.out.println("students are reading");
		System.out.println("students learning new topics daily");
	}*/
}
class MainRunning
{
	
	public static void main(String[] args) 
	{
	Fan f=new Fan("brown",2000,3);
     f.rotate();
		System.out.println(f.price+"   "+f.clr+"  "+f.blades+"  "+Fan.brand);
	}
}
