class Dodigit 
{
	public static void main(String[] args) 
	{
		int i=346789;
		do{
			int digit=i%10;

		System.out.println(digit);
		 i=i/10;
		}while(i>0);
		//i=i/10;
	}
}
