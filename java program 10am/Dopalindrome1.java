class Dopalindrome1 
{
	public static void main(String[] args) 
	{
		int temp=11;
		do{
			int rev=0;
			int num=temp;
		do{
			int digit=num%10;
				rev=rev*10+digit;
			num=num/10;
     }while(num>0);

			if(rev==temp)
			{
           System.out.println("palindrome" +rev);
			}
		temp++;
		}while(temp<=1000);
			

			
		  
		
	}
}