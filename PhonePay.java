import java.util.Scanner;
class PhonePay
{
	public static void main(String[] args) 
	{
		int password=1234;
		int upipin=9900;
		int balance=40000;

		Scanner s=new Scanner(System.in);

		System.out.println("enter the pasword");
		int pw=s.nextInt();
		System.out.println("enter the amt");
		int amt=s.nextInt();
		System.out.println("enter the upipin");
		int upi1=s.nextInt();
		if(password==pw)
		{
			if(amt>0)
			{
				if(amt<=balance)
				{
					if(upipin==upi1)
					{
						System.out.println("amt successfully transferred");
					}
					else
						{
						System.out.println("incorrect upipin");
					}
				}
				else
					{
					System.out.println("insufficent balance");
				}
			}
			else
			{
System.out.println("invalid amount");
			}
			
		}
		else
			{
			System.out.println("incorrect passwpord");
		}}}