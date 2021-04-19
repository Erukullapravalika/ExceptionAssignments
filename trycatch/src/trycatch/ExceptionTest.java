package trycatch;

public class ExceptionTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	if(args.length==0) {
		System.out.println("No input received");
	}
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int result=a/b;
			System.out.println("result is:"+result);
			
		}catch(NumberFormatException nfe) {
			System.out.println("only integers are allowed");
		}catch(ArithmeticException ae) {
			System.out.println("Divisible with zero is not possible");
		}
	}
	

}		
		


		
		
		
		

	


