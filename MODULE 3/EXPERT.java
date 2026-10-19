public class Main {
	/*
	@Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
		
		System.out.println("========== ATM Transaction Authirizer=========");
		
		String user = "Kirby";
		int pin = 1234;
		double balance = 1000;
		double withdraw = 400;
		
		if (user.equalsIgnoreCase("Kirby")) {
			if (pin == 1234) {
				
				String tier = "";
				if (balance >= 1000) {
					tier = "Platinum";
				} else if (balance >= 800) {
					tier = "Gold";
				} else if (balance >= 500) {
					tier = "Silver";
				} else {
					tier = "Bronze";
				}
					
				double fee = 0.0;
				double limit = 0.0;
					
				switch (tier) {
					case "Platinum":
						fee = 0.0;
						limit = 800;
						break;
						
					case "Gold":
						fee = 0.1;
						limit = 500;
						break;
						
					case "Silver":
						fee = 0.2;
						limit = 300;
						break; 
						 
					case "Bronze":
						fee = 0.4;
						limit = 50;
						break;
				}
						 
				double total = withdraw * fee;
				double deduction = withdraw + total;
			
				if (withdraw <= limit) {
					if (deduction <= balance) {
						balance -= deduction;
						System.out.println("------------------------------------------------------");
						System.out.println("TRANSACTION APPROVED");
						System.out.println("Account Tier: " + tier);
						System.out.println("Withdrawn: " + withdraw + " | Fee: " + total);
						System.out.println("New Balance: " + balance);
					} else {
						System.out.println(" DENIED: Insufficient balance to cover withdrawal amount. ");
					}
				} else {
					System.out.println(" DENIED: Amount exceeds your " + tier + " tier daily limit of " + limit);
				}
                
			} else {
				System.out.println(" DENIED: Incorrect PIN.");
			}
		} else {
			System.out.println(" DENIED: Username not found.");
		}
        
	}
}
