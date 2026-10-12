public class Main {
	/* 
	@Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
	
	
        double ave = 80;
        int absent = 2;

      boolean passgrade = (ave >= 75.0);
      boolean overallabsent = (absent <= 3);
      boolean passed = (passgrade && overallabsent);
      
      System.out.println("============ GRADE THRESHOLD CHECKER ===========");
      System.out.println("");
      System.out.println("Student average grade: " +ave);
      System.out.println("Student total absent: " +absent);
      
      if (passed) {
      	
      	System.out.println(" You Passed!");
      	System.out.println("You met both requirements!");	
      	}
	
	 else {
	 	
	 	System.out.println("You did not passed!");
	 	System.out.println("You did not met one of the requirements");
	 }
	
	
	
	
	
	}
}
