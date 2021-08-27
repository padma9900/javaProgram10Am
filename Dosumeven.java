class Dosumeven 
{
	public static void main(String[] args) 
	{
		int i=346789;
		int sum=0;
		do{
			int digit=i%10;
			if(digit%2==0)
				sum=sum+digit;
             i=i/10;
		}while(i>0);
		System.out.println(sum);
	}
}
