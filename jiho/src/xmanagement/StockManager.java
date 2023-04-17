package xmanagement;

import java.util.Scanner;

public class StockManager {
	public static void main(String[]arg) {
		
		Scanner input = new Scanner(System.in);
		Manager manager = new Manager(input);
		
		int num = -1;
		
		while (num != 6) {
			System.out.println("1. Add Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Edit Stock");
			System.out.println("4. Vidw Stock");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6");
			
			num = input.nextInt();
			
			if (num==1) {
				manager.addStock();
			}
			else if(num==2) {
				manager.deleteStock();
			}
			else if(num==3) {
				manager.editStock();
			}
			else if(num==4) {
				manager.viewStocks();
			}
			else {
				continue;
				}
		}		
	}
	

}