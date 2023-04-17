package xmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	Manager(Scanner input){
		this.input = input;
	}
	public void addStock() {
		Stock stock = new Stock();
		System.out.print("Stock ID: ");
		stock.id = input.nextInt();
		
		System.out.print("Stock name: ");
		stock.name = input.next();
		
		System.out.print("Today Sale: ");
		stock.sale = input.nextInt();
		
		System.out.print("Today input");
		stock.stockinput = input.nextInt();	
		stocks.add(stock);
	}
	public void deleteStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();
		int index = -1;
		
		for(int i = 0; i<stocks.size(); i++)
		{
			if(stocks.get(i).id == stockId) {
				index = i;
				break;
			}
		}
		if(index >=0){
			stocks.remove(index);
			System.out.println("the stock " + stockId + "is deleted");
		}

		else{
			System.out.println("the stock has been resistered");
			return;
		}
	}
	public void editStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();
		for(int i = 0; i<stocks.size(); i++)
		{
			Stock stock = stocks.get(i);
			if(stock.id == stockId) {
				int num = -1;
				
				while (num != 5) {
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Sale");
					System.out.println("4. Edit input");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-5");
					
					num = input.nextInt();
					
					if (num==1) {
						System.out.println("Stock Id");
						stock.id = input.nextInt();
					}
					else if(num==2) {
						System.out.println("Stock Name");
						stock.name = input.nextLine();
					}
					else if(num==3) {
						System.out.println("Today Sale");
						stock.sale = input.nextInt();
					}
					else if(num==4) {
						System.out.println("Today Input");
						stock.stockinput = input.nextInt();
					}
					else {
						continue;
						}
					
				}		
				
			}
			
			
	
		}

		
	}
	public void viewStocks() {
//		System.out.print("Stock ID: ");
//		int stockId = input.nextInt();	
		
		for(int i = 0; i<stocks.size(); i++)
		{
			stocks.get(i).PrintInfo();
	
		}

	}
}
