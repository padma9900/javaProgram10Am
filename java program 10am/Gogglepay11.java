import java.util.Scanner;
class Googlepay11 
{
	public static void main(String[] args) 
	{
		int studentmark=80;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a student marks")
		int sm=s.nextInt();
		if(studentmark==sm)
		{
			System.out.println("enter vaild student number");

		}
		else if(sm>=80)
			{
			System.out.println("distinction");

		}
else if (sm<=70)
{
	System.out.println("first class");
}
else if(sm>=30)
		{
	System.out.println("pass marks");
}
	}
}