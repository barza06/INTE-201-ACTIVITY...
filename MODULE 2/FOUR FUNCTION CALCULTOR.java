public class Week2 {
/*
	@Author: Jheric S. Barza
	*/

public static void main(String[] args) {


System.out.println("========= Four-Function Calculator ============/n");
  
  
	int a = 10, b= 3;
	
		System.out.println ( "This is addition: 10 + 3 =  " +(a + b)   );
		System.out.println (   "This is subtraction:  10 - 3 = "+  ( a - b) );
		System.out.println (  "This is multiplication: 10 × 3 = "+ (  a * b) );
		System.out.println (  "This is Division 10 ÷ 3 = "+ (  a / b) );
		System.out.println (  "This is modulos 10 % 3 = "+ (  a % b) );
				
					
		double negative = -10;
		int positive = 8;
		//modulos is the one behave diffrently when its come to negative, its returned a result with the same sgn  as the dividend rather than a positive number
							System.out.println("-10 % 8 = " +(negative % positive));					
				

					
	}
}
