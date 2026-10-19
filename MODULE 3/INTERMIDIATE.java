public class Main {
	/*
	@Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
		System.out.println("====== Multi-tier Discount System======");
		System.out.println("");
		double purchased = 1500;
		double discount;
			
			if (purchased >= 2000) {
				discount = 0.15;
			}
			else if (purchased >= 1500) {
				discount = 0.10; }
				
				else if (purchased >= 1000) {
					discount = 0.5;
				}
				
				else {
					discount = 0;
				}
				
				double totaldiscount = purchased * discount;
				double lastprice = purchased - totaldiscount;
				
				System.out.println("Purchased amount : " +purchased);
				System.out.println("------------------------------------------------------");
				System.out.println("Youre Discount	: " +totaldiscount);
				System.out.println("------------------------------------------------------");
				System.out.println("Youre total amount to pay	:	" +lastprice);
				
		
		
	}
}
