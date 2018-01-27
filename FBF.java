class FBF
{
	public static void main(String a[])
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0&&i%5==0)	
			{
				System.out.println("FizzBuzz"+i);
				continue;
			}	
			if(i%3==0)
			{
				System.out.println("Fizz"+i);
				continue;
			}
			if(i%5==0)
			{
				System.out.println("Buzz"+i);
			}
		}
	}
}

