import java.util.*;
class TakeInput
{
  public static void main(String[] args)
	{
    	Scanner scan = new Scanner(System.in);
    	
	System.out.println("Enter Integer :");
	int n = scan.nextInt();
    	
	System.out.println("Enter Double :");
    	double db = scan.nextDouble();

	System.out.println("Enter Float :");
    	float fl = scan.nextFloat();

	System.out.println("Enter String :");
    	String st = scan.next();

   	System.out.println("Integer :" + n);
    	System.out.println("Double :" + db);
	System.out.println("Float :" + fl);
	System.out.println("String :" + st);
	
  	}
}