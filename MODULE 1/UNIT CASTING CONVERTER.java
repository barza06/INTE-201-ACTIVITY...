public class Main {
/*
	@Author: Jheric S. Barza
	*/
 public static void main(String[] args) {
		
			
			double centimeters = 165.5;
			int meters = (int)(centimeters / 100);
			double remaining = centimeters - (meters * 100);	
	/* I convert centimeters to meters */	
				
								
		System.out.println("               UNIT CASTING CONVERTER              ");
		System.out.println("");						
		System.out.println("==================================");		
    System.out.println("");	
										
		   System.out.println("Original centimeters: " +centimeters);
		   System.out.println("Equivalent: " +meters+ " meters and " +remaining+ " cm");				
								
      
          	System.out.println("");	
       		System.out.println("");	
     /* In implicit widening theres no need to use cast since the number or the value youre going to transfer in double is capable to hold the value that stored in int, since double can hold any number that can hold by int. 
     */		
      		
      		int age = 19;
      		double number = age;
      		System.out.println(" Implicit widening example");	
      		System.out.println(number);
      
      
           double size = 1.5;
           int small = size;
           
           	System.out.println(" Explicit narrowing example");	
              	System.out.println(small);	
      
      
      /*On the other hand, the data that has been lost in explicit narrowing is .5, because 'int'' can't hold decimal numbers, that's why if you run this source code the output is gonna be 1, since int can't hold decimal.
      
      
      */
         
		
	}
}
