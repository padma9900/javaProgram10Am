class Dofactorial 
{
	public static void main(String[] args) 
	{
		int i=4;
		
		int fact=1;
		do{
		
			fact=fact*i;
	
		i--;
		}while(i>0);
		System.out.println(fact);
		
	}
}
