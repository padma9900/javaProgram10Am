import java.util.Scanner;
class Marks
{
	public static void main(String[] args) 
	{
		int studentmark=80;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a student marks");
		int sm=s.nextInt();
		if(studentmark==sm)
		{
			System.out.println("enter vaild student number");

		}
		else if(sm>=85&&sm<=100)
			{
			System.out.println("distinction");

		}
else if (sm>=75&&sm<=84)
{
	System.out.println("first class");
}
else if(sm>=60&&sm<=74)
		{
	System.out.println("second class");
}
else if(sm>=50&&sm<=59)
	{
	System.out.println("third class");
}
else if(sm>=35&&sm<=49)
		{
	System.out.println("forth class");
}
else
		{
	System.out.println("fail");
}

	}
}