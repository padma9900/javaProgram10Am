class Amstrong 
{
	public static void main(String[] args) 
	{
	
		int sum=0;
		int n=153;
		
		int temp=n;
		int count=0;
		do{
       n=n/10;            //n becomes 0
       count++;       //count=3
		}while(n>0);
		n=temp;      // before n=0 thts why reassigning n=153;
       do{
		   int base=n%10;  // base remains same

        int pow=1;
		int c=count;  //count is 3 asign to c
      do{
         pow=pow*base;
			c--;
	   }while(c>0);
			sum=sum+pow;
	   n=n/10;
	   }while(n>0);

if(sum==temp)
			{
		System.out.println("armstrong number" + sum);
			}
			else
				{
		System.out.println("not a armstrong number" + sum);
			}


		
	}
}

