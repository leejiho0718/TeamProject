package assignment_5._1_Xmanagement_Stock.Storage;

import java.util.Scanner;

import assignment_5._1_Xmanagement_Stock.Stock.Stock;

public class RefrigerationFood extends Stock {

	public void getStockInput(Scanner input){
		
		System.out.print("Stock ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Stock Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Expiration Date:");
		int date = input.nextInt();
		this.setDate(date);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.println("Was there a sale this week? (Y/N)");
			
			answer = input.next().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Today Sale: ");
				int sale = input.nextInt();
				this.setSale(sale);
				
				System.out.println("Are you going to place an order today? (Y/N)");
				
				answer = input.next().charAt(0);
				
				if(answer == 'y' || answer == 'Y') {
					System.out.print("Today Order: ");
					int order = input.nextInt();	
					this.setOrder(order);
				}
				
				else if(answer == 'n' || answer == 'N') {
					this.setOrder(0);
				}
				else {
				}
				break;
			}
			
			else if(answer == 'n' || answer == 'N') {
				this.setSale(0);
				break;
			}
			
			else {
			}
			
		}
		
	}
}
