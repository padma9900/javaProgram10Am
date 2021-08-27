class Eating 
{
	public static void handwash() 
	{
         System.out.println("wash hand");
	}
	public static void eat()
	{
		handwash(); 
		System.out.println("eat food");
		handwash(); 
	}
	public static void main(String []args)
	{
		eat();
	}
}
