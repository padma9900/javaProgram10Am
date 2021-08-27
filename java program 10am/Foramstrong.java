class Foramstrong 
{
	public static void main(String[] args) 
	{
		int n=153;
		int count=0;
		for(int temp=n;n>0;n=n/10)
		{
        count++;
		}
		int sum=0;
		n=temp;
		int pow=1;
		for(int base=n%10;n>0;n=n/10)
		{
			pow=pow*base;
      for(int c=count;c>0;c--)
			{
          sum=sum+pow;
	  }

		}
		if(sum==temp)
		{
		System.out.println("armstrong number"+temp);
		}
	}
}
