class Dostrongnumber1 
{
	public static void main(String[] args) 
	{
		int temp=1;
		do{
		int num=temp;
		int sum=0;
		do{
			int digit=num%10;
		
			int fact=1;
			do{

			
			fact=fact*digit;
			digit--;
			}while(digit>0);
		
			sum=sum+fact;
			num=num/10;
		}while(num>0);
		if(sum==temp)
		{
		System.out.println(sum+ "is strong number");
		}
		temp++;
		}while(temp<=1000);
	}
}
