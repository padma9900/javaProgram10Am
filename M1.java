// write a program tocheck armstrong number using method

class M1

{
	public static int countDigit(int n)
	{
		int count=0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	return count;
}
public static int power(int base, int exp)
	{
	int pow=1;
	while(exp>0)
		{
		pow=pow*base;
		exp--;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int sum=0;
		int c=countDigit(n);
		while(n>0)
		{
			int digit=n%10;
			int pow=power(digit,c);
			sum=sum+pow;
			n=n/10;
			

		}
		System.out.println(temp +"armstrong number");
	}
}
