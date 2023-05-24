package xmanagement.stock;

import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public abstract class Stock implements StockInput {
	
	protected StockKind kind = StockKind.FrozenFood;	// 재고 종류 - 디폴트 값 = 냉장식품
	protected String name;								// 재고 이름
	protected int id;									// 재고 고유 번호
	protected int date;									// 재고 유통기한
	protected int sale;									// 재고 판매 갯수
	protected int order;								// 재고 추가 갯수

	public Stock() {
		
	}
	
	// StockKind kind
	// - 1개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(StockKind kind) {
		this.kind = kind;
	}
	
	
	// String name, int id
	// - 2개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// String name, int id, int sale, int Order 
	// - 4개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id, int date, int sale, int order) {
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// StockKind kind, String name, int id, int sale, int Order 
	// - 5개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(StockKind kind, String name, int id, int date, int sale, int order) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// Getter & Setter
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) { //throws DateFormatException {
//		String targetDate = "2023";
//		String inputDate = String.valueOf(date);
//		if(!inputDate.contains(targetDate) || inputDate.equals("")) {
//			throw new DateFormatException();
//		}
		this.date = date;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	// PrintInfo() - 재고 정보를 출력하는 메소드.
	public abstract void PrintInfo();
	
	public void setStockId(Scanner input) {
		System.out.println("Stock Id");		
		int id = input.nextInt();			// 재고 고유 번호 입력
		this.setId(id);					// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
	
	}
	
	public void setStockName(Scanner input) {
		System.out.println("Stock Name");
		String name = input.next();		// 재고 이름 입력
		this.setName(name);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
	
	}
	
	public void setStockDate(Scanner input) {
		
		System.out.println("Stock date");		
		int date = input.nextInt();			// 재고 고유 번호 입력
		this.setDate(date);					// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
	
		
//		String targetDate = "2023";
//		
//		String inputDate = String.valueOf(date);
//		
//		while(!inputDate.contains(targetDate)) {
//			
//			System.out.println("Expiration Date:");
//			
//			int date = input.nextInt();
//			try {
//				this.setDate(date);
//			}
//			catch( DateFormatException e ){
//				System.out.println("Incorrect Date Format, put the Expiration Date that contains 2023");
//				e.printStackTrace();
//				
//			}
//		}
	
	}
	
	public void setStockSale(Scanner input) {
		System.out.println("Today Sale");
		int sale = input.nextInt();			// 재고 만매 갯소 입력
		this.setSale(sale);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장
	
	}
	
	public void setStockOrder(Scanner input) {
		System.out.println("Today Order");
		int order = input.nextInt();		// 재고 주문(발주) 갯수 입력
		this.setOrder(order);				// setId 메서드 호출 -> stock 변수에 매게변수(id) 값을 저장장
	
	}
	
	
	public void setStockDateYN(Scanner input) {
		
		char answer = 'x';					// answer을 x로 초기화
		
		// answer의 값이 'y', 'Y', 'n', 'N' 아닐 경우에 반복
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.println("Is there an Expiration date? (Y/N)");
			
			answer = input.next().charAt(0);				// charAt() - String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
															// 			- 괄호 안에 들어있는 인덱스 번호에 위치한 문자를 char 타입으로 변환
			
			if(answer == 'y' || answer == 'Y') {			// answer의 값이 'y' 또는 'Y' 일 경우
				
				setStockDate(input);
				break;										// break - 반복문 종료
			}
			
			else if(answer == 'n' || answer == 'N') {		// answer의 값이 'n' 또는 'N' 일 경우
				
				this.setDate(0);							// setDate 메서드 호출: 인자 - 0
				break;										// break - 반복문 종료
			}
			
			else {
			}
			
		}
	}
	
	public void setStockSaleYN(Scanner input) {
		
		char answer = 'x';									// answer을 x로 초기화
		
		// answer의 값이 'y', 'Y', 'n', 'N' 아닐 경우에 반복
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.println("Was there a sale this week? (Y/N)");
			
			answer = input.next().charAt(0);				// charAt() - String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
															// 			- 괄호 안에 들어있는 인덱스 번호에 위치한 문자를 char 타입으로 변환
			
			if(answer == 'y' || answer == 'Y') {			// answer의 값이 'y' 또는 'Y' 일 경우
				
				setStockSale(input);
				
				setStockOrderYN(input);
			}
			
			else if(answer == 'n' || answer == 'N') {		// answer의 값이 'n' 또는 'N' 일 경우
				
				this.setSale(0);							// setDate 메서드 호출: 인자 - 0
				break;										// break - 반복문 종료
			}
			
			else {
			}
			
		}
	}
	
	public void setStockOrderYN(Scanner input) {
		
		char answer = 'x';							// answer을 x로 초기화
		
		System.out.println("Are you going to place an order today? (Y/N)");
		
		answer = input.next().charAt(0);		
		
		if(answer == 'y' || answer == 'Y') {		// answer의 값이 'y' 또는 'Y' 일 경우
			
			setStockOrder(input);
		}
		
		else if(answer == 'n' || answer == 'N'){	// answer의 값이 'n' 또는 'N' 일 경우
			
			this.setOrder(0);						// setOrder 메서드 호출: 인자 - 0
		}
		
		else {
		}
	}
	
	
	
	public String getStockKind() {
		
		String stockKind = "none";
		
		switch(this.kind) {
		
		case FrozenFood:			// 냉동음식일 경우
			stockKind = "FrozenFood";
			break;					
			
		case RefrigerationFood:		// 냉장음식일 경우
			stockKind = "RefrigerationFood";
			break;						
			
		case RoomTemperatureFood:	// 상온음식일 경우
			stockKind = "RoomTemperatureFood";
			break;
			
		case Alcohol:				// 주류일 경우
			stockKind = "Alcohol";
			break;
			
		case Beverage:				// 음료일 경우
			stockKind = "Beverage";
			break;
			
		case Cigarette:				// 담배일 경우
			stockKind = "Cigarette";
			break;
			
		case Sundries:				// 잡화일 경우
			stockKind = "Sundries";
			break;
			
		default:
		}
		
		return stockKind;	
	}
}