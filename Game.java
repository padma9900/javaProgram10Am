import java.util.Scanner;
import java.util.Random;
class Game 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int b=sc.nextInt();
Random r=new Random();
int a=r.nextInt(20);
if(a==b)
	{
		System.out.println("won the game"+a);

}
else
		{
			System.out.println("loose the game"+a);

}
	}
}
