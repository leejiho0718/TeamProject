package assignment_6._1_Xmanagement_Manager;

import java.util.ArrayList;

import java.util.Scanner;

import assignment_6._1_Xmanagement_Stock.StockKind;
import assignment_6._1_Xmanagement_Stock.Alcohol;
import assignment_6._1_Xmanagement_Stock.Beverage;
import assignment_6._1_Xmanagement_Stock.Cigarette;
import assignment_6._1_Xmanagement_Stock.RefrigerationFood;
import assignment_6._1_Xmanagement_Stock.RoomTemperatureFood;
import assignment_6._1_Xmanagement_Stock.Stock;
import assignment_6._1_Xmanagement_Stock.Sundries;

public class StockManager {
	
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner 객체를 받아 입력 변수를 초기화하는 생성자
	StockManager(Scanner input){
		this.input = input;
	}
	
	// addStock() - Stock 객체를 생성하여 stocks ArrayList에 추가하는 메소드
	public void addStock() {
		
		int kind = 0;			// 재고 종류 설정
		Stock stock;			
		while (kind != 8) {		// 재고는 1~7까지 있으며 8이면 반복문 종료 
			
			System.out.println("1. Frozen Food");							// 1. 냉동 식품
			System.out.println("2. Refrigeration Food");					// 2. 냉장 식품
			System.out.println("3. RoomTemperature Food");					// 3. 상온 식품
			System.out.println("4. Alcohol");								// 4. 주류
			System.out.println("5. Beverage");								// 5. 음료
			System.out.println("6. Cigarette");								// 6. 담배
			System.out.println("7. Sundries");								// 7. 잡화
			System.out.print("Select num for Stock Kind from 1 to 7: ");
			
			kind = input.nextInt();					// 물건 종류 입력받기	
					
			if (kind == 1) {						// 1: 냉동 식품일 경우
				
				// Stockind의 초기값이 FrozenFood이므로 Stock(StockKind kind) 생성자 호출
				stock = new Stock(StockKind.FrozenFood);
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else if (kind == 2) {					// 2: 냉장 식품일 경우
				
				// Stock 클래스의 stock 변수 = new RefrigerationFood(StockKind kind) 생성자 호출
				stock = new RefrigerationFood(StockKind.RefrigerationFood);	
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else if (kind == 3) {					// 3: 상온 식품일 경우
				
				// Stock 클래스의 stock 변수 = new RoomTemperatureFood(StockKind kind) 생성자 호출
				stock = new RoomTemperatureFood(StockKind.RoomTemperatureFood);	
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
				
			else if (kind == 4) {					// 4: 주류일 경우
				
				// Stock 클래스의 stock 변수 = new Alcohol(StockKind kind) 생성자 호출
				stock = new Alcohol(StockKind.Alcohol);			
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else if (kind == 5) {					// 5: 음료일 경우
				
				// Stock 클래스의 stock 변수 = new Beverage(StockKind kind) 생성자 호출 
				stock = new Beverage(StockKind.Beverage);		
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else if (kind == 6) {					// 6: 담배일 경우
				
				// Stock 클래스의 stock 변수 = new Cigarette(StockKind kind) 생성자 호출
				stock = new Cigarette(StockKind.Cigarette);		
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else if (kind == 7) {					// 7: 잡화일 경우
				
				// Stock 클래스의 stock 변수 = new Sundries(StockKind kind) 생성자 호출
				stock = new Sundries(StockKind.Sundries);				
				
				stock.getStockInput(input);			// getStockInput 메서드 호출 -> stock 변수에 매게변수(input) 값을 저장
				stocks.add(stock);					// add 메서드 호출 -> stocks 배열에 매게변수(stock) 값을 저장
				break;								// break - 반복문 종료
			}
			
			else {									// 1~7이 아닐 경우 다시 선택
				System.out.println("Select num for Stock Kind from 1 to 7");
			}
				
		}
			
	}
	
	// deleteStock() - 사용자에게 Stock ID를 입력받아 
	//                 ArrayList에서 일치하는 Stock ID를 발견 및 삭제하는 메서드
	public void deleteStock() {
		
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId를 입력 받음
		int index = -1;									// index 변수를 -1로 초기화
		
		for(int i = 0; i<stocks.size(); i++)			// 0부터 1씩 증가하며 stocks 배열의 크기까지 반복  
		{
			if(stocks.get(i).getId() == stockId) {		// 입력받은 stockId가 stocks 배열의 i번째 인덱스의 Id와 같을 경우
														// ㄴ> ArrayList.get(int index): 인자 - 인덱스 -> 인덱스의 위치에 있는 객체를 리턴
				index = i;								// index = i
				break;									// break - 반복문 종료
			}
		}
		if(index >=0){									// index가 0보다 클 경우
			stocks.remove(index);						// stocks 배열의 index 값을 제거
														// ㄴ> ArrayList.get(int index)
														//    : 인자로 전달된 인덱스 위치의 아이템을 리스트에서 삭제, 객체는 리턴
			System.out.println("the stock " + stockId + "is deleted");
		}

		else{											// 위의 조건을 만족하지 않을 경우 -> return
			System.out.println("the stock has been resistered");
			return;
		}
	}
	
	// editStock() - Stock ID 입력하고 일치하는 Stock ID를 가진 stocks ArrayList 검색
	//               -> 편집할 필드(ID, 이름, 판매 또는 주식 입력)를 사용자에게 묻는 메서드입니다.
	public void editStock() {
		
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId 입력 받음
		
		for(int i = 0; i<stocks.size(); i++)			// 0부터 1씩 증가하며 stocks 배열의 크기까지 반복 
		{
			
			Stock stock = stocks.get(i);				// Stock 클래스의 stock 변수 = stocks 배열의 i번째 인덱스에 있는 객체 
														// ㄴ> ArrayList.get(int index): 인자 - 인덱스 -> 인덱스의 위치에 있는 객체를 리턴

			if(stock.getId() == stockId) 				// getId 메서드 호출 -> stock 변수의 값이 stockId의 값과 같을 경우
			{				
				int num = -1;							// num은 -1로 초기화
				
				while (num != 6) {							// num이 6이 아닐 때까지 반복
					System.out.println("1. Edit Id");		// 1. 재고 고유 번호 수정
					System.out.println("2. Edit Name");		// 2. 재고 이름 수정
					System.out.println("3. Edit Date");		// 3. 재고 유통기한 수정
					System.out.println("4. Edit Sale");		// 4. 재고 판매 갯수 수정
					System.out.println("5. Edit Order");	// 5. 재고 주문(발주) 갯수 수정
					System.out.println("6. Exit");			// 6. 종료
					System.out.println("Select one number between 1-5");
					
					num = input.nextInt();					// num 값 입력
					
					if (num==1) {							// num이 1일 경우
						System.out.println("Stock Id");		
						int id = input.nextInt();			// 재고 고유 번호 입력
						stock.setId(id);					// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
					}
					
					else if(num==2) {
						System.out.println("Stock Name");
						String name = input.nextLine();		// 재고 이름 입력
						stock.setName(name);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
					}
					
					else if(num==3) {
						System.out.println("Expiration Date");
						int date = input.nextInt();			// 재고 유통기한 입력
						stock.setDate(date);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
					}
					
					else if(num==4) {
						System.out.println("Today Sale");
						int sale = input.nextInt();			// 재고 만매 갯소 입력
						stock.setSale(sale);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
					}
					
					else if(num==5) {
						System.out.println("Today Order");
						int order = input.nextInt();		// 재고 주문(발주) 갯수 입력
						stock.setOrder(order);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
					}
					
					else {									// 위의 조건이 다 맞지 않을 경우
						continue;							// 계속
					}
					
				}		
				
			}
			
			
	
		}

		
	}
	
	// viewStocks() - stocks ArrayList에 있는 모든 주식의 정보를 출력하는 메소드
	public void viewStocks() {
	//  System.out.print("Stock ID: ");
	//  int stockId = input.nextInt();	
		
		for(int i = 0; i<stocks.size(); i++)		// 0부터 1씩 증가하며 stocks 배열의 크기까지 반복 
		{
			stocks.get(i).PrintInfo();				// PrintInfo 메서드 호출 -> stocks 배열의 i번째 인덱스
													// ㄴ> ArrayList.get(int index): 인자 - 인덱스 -> 인덱스의 위치에 있는 객체를 리턴
	
		}

	}
}
