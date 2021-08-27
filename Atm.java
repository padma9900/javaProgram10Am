class Atm
{
void dispatching()
	{
System.out.println("Atm dispatching money");
}
}
class Money
{
	public static void main(String[] args) 
	{
		Atm a=new Atm();
		a.dispatching();
	}
}
