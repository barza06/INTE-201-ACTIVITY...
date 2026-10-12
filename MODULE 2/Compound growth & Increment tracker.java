public class Main {
	/*
	Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
		
		
		
		System.out.println("===== COMPOUND GROWTH =======");
		System.out.println("");
		System.out.println("");
		
		
		
		double balance = 100.0;
		
		System.out.println("Initial Balance: " +balance);
		
		balance +=150.0;
		
		System.out.println("After adding 150 the totla blance is " +balance);
		
		
		balance *= 1.5;
		
		System.out.println("After multipliying with 1.5 , the total blance is " +balance);
		
		balance +=200;
		
		
		System.out.println("After ading again 200, the toral balance is " +balance);
		System.out.println("");
		System.out.println("=====  INCREMENT TRACKER =======");
		System.out.println("");
		
		System.out.println("===== Postfix Increment =======");
		System.out.println("");
		int count = 5;
		
		System.out.println("The value of count++ is " +count++);
		
		System.out.println("after the count++ :" +count);
		
		
		System.out.println("");
		
		count = 5;
		
		System.out.println("===== Prefix Increment =======");
		System.out.println("");
		
		System.out.println("The value of ++count ; " + ++count);
		
		System.out.println("the value after ++count : " +count);
		
		
		/* the diffrenece between the posfic and prefix increment, the  postfix increment is going to add 1 in the next line of code meanwhile the prefix is goin to add 1 immediately. Heres wht its look like

				postfix increment 
				count = 5
		        count++ if you print this you get 5
		        
		        meanwhile prefix increment
		        count = 5
		        ++count if you print this you can get 6
	
		        	        
		      
		        
		*/
			
		
	}
}
