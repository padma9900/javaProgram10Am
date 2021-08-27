class Conductor 
{
void issuing()
	{
System.out.println("Conductor issuing ticket");
}
}
class Ticket
{
	public static void main(String[] args) 
	{
		Conductor c=new Conductor();
		c.issuing();
	}
}
