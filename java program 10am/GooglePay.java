import java.util.Scanner;
class GooglePay 
{
	public static void main(String[] args) 
	{
		int password=1234;
		int upipin=9900;
		int balance=30000;
		Scanner s=new Scanner(System.in);
System.out.println("enter the password");
		int pw=s.nextInt();

		System.out.println("enter the amount");
		int amt=s.nextInt();
		System.out.println("enter the upi pin");
		int pn=s.nextInt();
		if(password==pw)
		{
			if(amt>0 && balance>=amt)
			{
			if(upipin==pn)
				{
				System.out.println("amount succefully transferred"+amt);
				}
				
				}
		}

	}
}
