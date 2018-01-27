class FizzBuzzDW
{
	public static void main(String a[])
	{
	int i=1;	
		do{
			if(i%3==0&&i%5==0)	
			{
				System.out.println("FizzBuzz"+i);
i++;
				continue;
			}	
			if(i%3==0)
			{
				System.out.println("Fizz"+i);
i++;
				continue;
			}
			if(i%5==0)
			{
				System.out.println("Buzz"+i);
i++;
			}
i++;
		}while(i<=100);
	}
}

