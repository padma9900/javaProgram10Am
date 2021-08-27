import java.util.Scanner;
class P15 
{
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int fees=0;
		int a=s.nextInt();
		if(a<=1)
		{
			System.out.println("it is applicable for govt school");
		}
		else
		{
			System.out.println("not applicable for govt school");
		}
	}
}
