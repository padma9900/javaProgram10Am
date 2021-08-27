class Fibbonacci1
 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;

		System.out.println(a);
				System.out.println(b);
				int i=1; //a value b value printed before while value
				while(i<=5) // it needs to print 21 times so thats why take i=1 so that it will count from 1 to 21
		{
				 c=a+b;
				 if(c<10)
			{
						System.out.println(c);
						a=b;
						b=c;
						i++;
			}

				
				}

	}
}
