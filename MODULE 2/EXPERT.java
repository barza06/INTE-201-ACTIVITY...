public class Main {
	/*
	@Author: Jheric s. Barza
	*/
	public static void main(String[] args) {

System.out.println("======= PRECEDENCE PUZZLE SOLVER =======");
		System.out.println("");

     
		double a = 5, b = 2, c = 10, d = 50;

	     System.out.println(" I guess the result is going to be true");	
			
	boolean result1 = a * b + c - d < d / c * b && d * c == 500;
	        // 5 X 2 = 20 + 10 IS 30 - 50 IS EQUAL TO -20, while 50 / 10 = 5 x 2=10 & 50 x 10 = 500 so its true
			System.out.println(" The actual result is : " +result1);		
		System.out.println("");								
			int x = 50, y = 10, z = 5;
		
		System.out.println(" I guess the result is going to be true");
			boolean result2 = x + y / z == 52 || x / z < x;
			// the first problem is true and the second is false, but still the answer is true, since what is looking for are OR, so even one is wrong if theres one right that is true, specially the code is reading to left to right
		System.out.println(" The actual result is : " +result2);			
				System.out.println("");				
										
			int q = 15, w = 3, e = 5;     
			System.out.println("I guess the result is true");
		boolean result3 = ++q % 3 + e == 6;
		//this one is true since 15 is going to add 1 since its Prefix increment so its going to be 16, 16 % 3 = 1 , 1 + 5 = 6, and 6 = 6 is true;
			System.out.println("The actual reult is :" +result3);									
														
		
		
		
	}
}
