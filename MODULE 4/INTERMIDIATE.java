public class Main {
	/*
	@Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
		System.out.println("===== SUM UNTIL SENTINEL VALUE=====");
		
		
		int[] number = {1,2,3,4,5,-1,-2};
		int number1 = 0, total = 0;
		
		System.out.println("Number: " +number[number1]);
		while(number[number1] != -1) {
		total += number[number1];
		number1++;
		System.out.println("number: " +number[number1]);
		}
		
		System.out.println("Total: " +total);
		
		
		
		
	}
}
