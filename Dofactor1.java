import java.util.Scanner;
class Dofactor1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int num=1;
		do{
			if(a%num==0)
			{
				System.out.println(num);
			}
			num++;
		}while(num>0);
	}
}
