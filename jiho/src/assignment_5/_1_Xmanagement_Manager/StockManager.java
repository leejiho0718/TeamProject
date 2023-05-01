package assignment_5._1_Xmanagement_Manager;

import java.util.ArrayList;
import java.util.Scanner;

import assignment_5._1_Xmanagement_Stock.Stock.Stock;
import assignment_5._1_Xmanagement_Stock.Storage.Alcohol;
import assignment_5._1_Xmanagement_Stock.Storage.Beverage;
import assignment_5._1_Xmanagement_Stock.Storage.Cigarette;
import assignment_5._1_Xmanagement_Stock.Storage.RefrigerationFood;
import assignment_5._1_Xmanagement_Stock.Storage.RoomTemperatureFood;
import assignment_5._1_Xmanagement_Stock.Storage.Sundries;

public class StockManager {
	
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner 객체를 받아 입력 변수를 초기화하는 생성자
	StockManager(Scanner input){
		this.input = input;
	}
	
	// addStock() - Stock 객체를 생성하여 stocks ArrayList에 추가하는 메소드
	public void addStock() {
		
		int kind = 0;
		Stock stock;
		while (kind != 8) {
			
			System.out.println("1. Frozen Food");
			System.out.println("2. Refrigeration Food");
			System.out.println("3. RoomTemperature Food");
			System.out.println("4. Alcohol");
			System.out.println("5. Beverage");
			System.out.println("6. Cigarette");
			System.out.println("7. Sundries");
			System.out.print("Select num for Stock Kind from 1 to 7: ");
			
			kind = input.nextInt();
			
			if (kind == 1) {
				stock = new Stock();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 2) {
				stock = new RefrigerationFood();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 3) {
				stock = new RoomTemperatureFood();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 4) {
				stock = new Alcohol();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 5) {
				stock = new Beverage();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 6) {
				stock = new Cigarette();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else if (kind == 7) {
				stock = new Sundries();
				stock.getStockInput(input);
				stocks.add(stock);
				break;
			}
			
			else {
				System.out.println("Select num for Stock Kind from 1 to 7");
			}
				
		}
			
	}
	
	// deleteStock() - 사용자에게 Stock ID를 입력받아 
	//                 ArrayList에서 일치하는 Stock ID를 발견 및 삭제하는 메서드
	public void deleteStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();
		int index = -1;
		
		for(int i = 0; i<stocks.size(); i++)
		{
			if(stocks.get(i).getId() == stockId) {
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
	
	// editStock() - Stock ID 입력하고 일치하는 Stock ID를 가진 stocks ArrayList 검색
	//               -> 편집할 필드(ID, 이름, 판매 또는 주식 입력)를 사용자에게 묻는 메서드입니다.
	public void editStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();
		for(int i = 0; i<stocks.size(); i++)
		{
			Stock stock = stocks.get(i);
			if(stock.getId() == stockId) {
				int num = -1;
				
				while (num != 6) {
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Date");
					System.out.println("4. Edit Sale");
					System.out.println("5. Edit Order");
					System.out.println("6. Exit");
					System.out.println("Select one number between 1-5");
					
					num = input.nextInt();
					
					if (num==1) {
						System.out.println("Stock Id");
						int id = input.nextInt();
						stock.setId(id);
					}
					else if(num==2) {
						System.out.println("Stock Name");
						String name = input.nextLine();
						stock.setName(name);
					}
					
					else if(num==3) {
						System.out.println("Expiration Date");
						int date = input.nextInt();
						stock.setDate(date);
					}
					
					else if(num==4) {
						System.out.println("Today Sale");
						int sale = input.nextInt();
						stock.setSale(sale);
					}
					else if(num==5) {
						System.out.println("Today Order");
						int order = input.nextInt();
						stock.setOrder(order);
					}
					else {
						continue;
						}
					
				}		
				
			}
			
			
	
		}

		
	}
	
	// viewStocks() - stocks ArrayList에 있는 모든 주식의 정보를 출력하는 메소드
	public void viewStocks() {
	//  System.out.print("Stock ID: ");
	//  int stockId = input.nextInt();	
		
		for(int i = 0; i<stocks.size(); i++)
		{
			stocks.get(i).PrintInfo();
	
		}

	}
}
