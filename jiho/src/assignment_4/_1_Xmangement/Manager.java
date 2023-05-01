package assignment_4._1_Xmangement;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner 객체를 받아 입력 변수를 초기화하는 생성자
	Manager(Scanner input){
		this.input = input;
	}
	
	// addStock() - Stock 객체를 생성하여 stocks ArrayList에 추가하는 메소드
	public void addStock() {
		Stock stock = new Stock();
		System.out.print("Stock ID: ");
		stock.id = input.nextInt();
		
		System.out.print("Stock name: ");
		stock.name = input.next();
		
		System.out.print("Today Sale: ");
		stock.sale = input.nextInt();
		
		System.out.print("Today input: ");
		stock.stockinput = input.nextInt();	
		stocks.add(stock);
	}
	
	// deleteStock() - 사용자에게 Stock ID를 입력받아 
	//                 ArrayList에서 일치하는 Stock ID를 발견 및 삭제하는 메서드
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
	
	// editStock() - Stock ID 입력하고 일치하는 Stock ID를 가진 stocks ArrayList 검색
	//               -> 편집할 필드(ID, 이름, 판매 또는 주식 입력)를 사용자에게 묻는 메서드입니다.
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
