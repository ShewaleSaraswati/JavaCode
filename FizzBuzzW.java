class FizzBuzzW
{
	public static void main(String a[])
	{
	int i=1;	
	while(i<=100)
		{
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
		}
	}
}

