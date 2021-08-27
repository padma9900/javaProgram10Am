import java.util.Scanner;
class Age 
{
	public static void main(String[] args) 
	{
		int age=30;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a age");
		int a=s.nextInt();
		if(age==a)
		{

			System.out.println("enter valid age");
		}
		else if(a>=1 &&a<=3)
		{
			System.out.println("baby");
		}
		else if(a>=4 &&a<=5)
			{
			System.out.println("go to nursery");
		}
		else if(a>=6 && a<=16)
			{
			System.out.println("go to school");
			}
			else if(a>=17 && a<=18)
		{
				System.out.println("go to college");
			}
			else if(a>=18 && a<=22)
		{
				System.out.println("go to degree college");
			}
			else
		{
				System.out.println("enter valid  age");
			}
		
		}
	}
