import java.util.Scanner;
class Facebook
{
	public static void main(String[] args) 
	{
int password=1234;
	long phno=8884310855l;
	Scanner s=new Scanner(System.in);
		System.out.println("enter the password");
	int pw=s.nextInt();
	System.out.println("enter the username");
long pn=s.nextLong();
if(phno==pn && password==pw)
		{
System.out.println("facebook successfully login");
}
else
	{
	System.out.println("invalid username and password");
}
	}
}
