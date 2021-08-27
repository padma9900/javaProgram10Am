import java.util.Scanner;
class Qspider
{
	public static void main(String[] args) 
	{
		String email="padmapatelkh@gmail.com";
		String password="padma9900";


		Scanner s=new Scanner(System.in);
System.out.println("enter email id");
		String id=s.next();

		System.out.println("enter passworrd");
			String pw=s.next();

		
		if(password==pw || email==id)
		{
			System.out.println("Qspider succefully login");
		}
			else
		{
				System.out.println("invalid username and password");
			}

	}
}

