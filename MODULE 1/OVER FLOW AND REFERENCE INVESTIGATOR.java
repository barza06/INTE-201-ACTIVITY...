public class Week1 {
  /*
	@Author: Jheric S. Barza
	*/
      public static void main(String[] args) {

        System.out.println("===  PRIMITIVE OVERFLOW ===");
        byte maxByte = 127; 
        System.out.println("Before overflow: " + maxByte);
        maxByte++; 
        System.out.println("After overflow (maxByte++): " + maxByte);
        /* ang byte kase can stored -128 to 127, so if mag add tayo ng 1 or increment using ++, the value of maxbyte it's not going to add one since it's already get the maz value, so its going to back from the start or -128
              
        */

        System.out.println("\n===  STRING  COMPARISON ===");
        String s1 = new String("Java");
        String s2 =  ("Java");
        String s3 = "Java"; 
        String s4 = "Java";
        
        System.out.println("s1 == s2: " +(s1 == s2));
  
              /*
        The code above is falls since we know they have diffrent address, as you can see the s1 and s2 string have they own variable name witch is new thats why == sign its going to check if they same, but since there diffrence address, the s1 == s2 output is false
        
        
        Also same with the line of code below, the s1 have address but the s3 dont have so this one is also a false
        
        */

        System.out.println("s1 == s3: " + (s1 == s3));
       
         

       //  meanwhile all the code below is true   

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        
        /*this one is true since the one asking in the value and thet have same value which is the word 'java' */
        
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        
        // also this one is same just like the line 39 explanation
    
        System.out.println("s3 == s4: " + (s3 == s4));
        // this one is true since the s3 and s4 stored the same value which is the word java
        
        System.out.println("\n===  ARRAY  SHARING ===");
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; 

       /* 
       So theres arr1 which contain the array and arr2 which is connected to arr1, so if i print arr1[0] and arr[0] , the output Im going to get is 10 , 10, that is my explnation the the code below.
       
       */


        System.out.println("Before: arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);

        /* On this code below you can I change the value of arr[0] = 99, and arr2 is connected to arr1 since they are basically equal so the 0 that represent by 10 is going to be 99, intead of 10, heres an good example below
    
            int[] arr1 = {10, 20, 30};
            int[] arr2 = arr1; 
        after I change arr2[0] = 99 the value now of arr1 is
      
          int[] arr1 = {99, 20, 30};


       */
       
        arr2[0] = 99; 

        System.out.println("After arr2[0] = 99:");
        System.out.println("arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);
        
        
    }
}
