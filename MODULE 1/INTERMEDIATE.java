public class Week1 {
/*
	@Author: Jheric S. Barza
	*/
		public static void main(String[] args) {
	
		
		int quantity = 5;
		double unitcost = 25.73;
		double total;
		String name = "Grocery store";
		/* The total is not int since there's a remainder when you calculate the total cost, and the number is not integer when it's come to total, so thats why I used double for total since it can hold decimal numbers
		
		*/
		
		total = unitcost * quantity;
		
		System.out.println("       TYPE-SAFE SHOPPING CALCULATOR");	
		
		
		System.out.println("============================");
		System.out.println("");
		System.out.println("=========" +name+ "==========");
		System.out.println("Quantity purchased: " +quantity);
		System.out.println("Unit cost: " +unitcost+ " Pesos");
		System.out.println("Total purchased:" +total);
											
														
	}
}
