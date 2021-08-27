import java.util.Scanner;
class GooglePay1
{
	public static void main(String[] args) 
	{
		int password=1234;
		int upipin=1010;
		int balance=30000;

		Scanner s=new Scanner(System.in);

		System.out.println("enter the pasword");
		int pw=s.nextInt();
		System.out.println("enter the amt");
		int amt=s.nextInt();
		System.out.println("enter the upipin");
		int upi=s.nextInt();
		if(password==pw)
		{
			if(amt>0)
			{
				if(amt<=balance)
					{
					if(upipin==upi)
						{
						System.out.println("amout successfully transferred");
					}
					else
						{
						System.out.println("invalid upipin");

					}
					
				}
				else
				{
					System.out.println("insuffienct balance");
				}
			}
			else
			{
				System.out.println("invalid balance");
			}
		}
		else
		{
System.out.println("incorrect password");
		}

		
	}
}