public class Main {
	/*
	@Author: Jheric S. Barza
	*/
	public static void main(String[] args) {
		
		 System.out.println("========Pattern Generator With Early Exit======");
			int value = 5;
			
			for (int i = 1; i <= value; i++) {
				if (i == 3) {
					// Its skip number 3 or row 3 since its i == 3
					System.out.println("Skip");
					System.out.println("Row: " +i);
					continue;
				}
					for (int j = 1; j <= value; j++) {
						if (j > 3) {
							//and heres break when its reach column 3
							System.out.println("Break");
							System.out.println("Row: " +i+ ", Column: " +j);
							break;
						} else System.out.println("*");
					}
					System.out.println();
				}
			}
}
		
		
		
	
