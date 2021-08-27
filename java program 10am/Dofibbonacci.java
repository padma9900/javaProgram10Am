class Dofibbonacci 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int i=1;
		do{
			int c=a+b;
			//if(c<10)
			
				System.out.println(c);
				a=b;
				b=c;
			
				i++;
			}while(i<=7);
	}
}
