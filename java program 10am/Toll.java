import java.util.Scanner;
class Toll 
{
	public static void main(String[] args) 
	{
		int toll=12;
		Scanner s=new Scanner(System.in);

		System.out.println("enter toll fee");
		int t=s.nextInt();

		if(toll==t)
		{
			System.out.println("enter valid tool fee");
		}
		else if(t>=50 &&t<=60)
			{
			System.out.println("bike amount");
		}
		else if(t>=128 && t<=155)
		{
			System.out.println("car amount");
		}
		else if(t>=220 &&t<=270)
		{
			System.out.println("bus amount");
		}
		else if(t>=343 &&t<=420)
		{
			System.out.println("truck amount");
		}
	}
}
