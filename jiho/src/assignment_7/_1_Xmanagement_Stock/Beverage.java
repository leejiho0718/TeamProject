package assignment_7._1_Xmanagement_Stock;

import java.util.Scanner;

public class Beverage extends Stock implements StockInput {
	
	// Beverage 생성자 - 매개변수: StockKind 클래스 타입의 kind 변수 
	public Beverage(StockKind kind) {
		super(kind);						// kind를 상속 받음
	}

	public void getUserInput(Scanner input){
		
		System.out.print("Stock ID: ");		
		int id = input.nextInt();			// 재고 고유 번호 입력
		this.setId(id);						// setId 메서드 호출: 인자 - id
		
		System.out.print("Stock Name: ");
		String name = input.next();			// 재고 이름 입력
		this.setName(name);					// setId 메서드 호출: 인자 - id
		
		System.out.print("Expiration Date:");	
		int date = input.nextInt();			// 재고 유통기한 입력
		this.setDate(date);					// setDate 메서드 호출: 인자 - date
		
		char answer = 'x';					// answer을 x로 초기화
		
		// answer의 값이 'y', 'Y', 'n', 'N' 아닐 경우에 반복
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.println("Was there a sale this week? (Y/N)");
			
			answer = input.next().charAt(0);				// charAt() - String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
															// 			- 괄호 안에 들어있는 인덱스 번호에 위치한 문자를 char 타입으로 변환
			
			if(answer == 'y' || answer == 'Y') {			// answer의 값이 'y' 또는 'Y' 일 경우
				
				System.out.print("Today Sale: ");
				int sale = input.nextInt();					// 재고 판매 갯수 입력
				this.setSale(sale);							// setSale 메서드 호출: 인자 - sale
				
				System.out.println("Are you going to place an order today? (Y/N)");
				
				answer = input.next().charAt(0);		
				
				if(answer == 'y' || answer == 'Y') {		// answer의 값이 'y' 또는 'Y' 일 경우
					
					System.out.print("Today Order: ");
					int order = input.nextInt();			// 재고 주문(발주) 갯수 입력
					this.setOrder(order);					// setOrder 메서드 호출: 인자 - order
				}
				
				else if(answer == 'n' || answer == 'N'){	// answer의 값이 'n' 또는 'N' 일 경우
					
					this.setOrder(0);						// setOrder 메서드 호출: 인자 - 0
				}
				
				else break;										// break - 반복문 종료
			}
			
			else if(answer == 'n' || answer == 'N') {		// answer의 값이 'n' 또는 'N' 일 경우
				
				this.setSale(0);							// setDate 메서드 호출: 인자 - 0
				break;										// break - 반복문 종료
			}
			
			else {
			}
			
		}
		
	}
	
	public void PrintInfo() {
		
		String stockKind = "none";	// stockKind 변수 - none 초기화
		
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
		
		System.out.println("kind: " + kind + " name: " + name + " id: " + id + " date: " + date + " sale: " + sale + " order: "+ order);
	}

	public int getId() {
		return 0;
	}


}
