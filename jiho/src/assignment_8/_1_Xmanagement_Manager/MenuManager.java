package assignment_8._1_Xmanagement_Manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[]arg) {

		Scanner input = new Scanner(System.in);
		StockManager manager = new StockManager(input);
		
	
		selectMenu(input, manager);
	}
	
	public static void selectMenu(Scanner input, StockManager manager) {
		
		int num = -1;								// num = -1로 초기화
		while (num != 5) {							// num이 6이 아니면 반복 -> 즉, num == 6이면 반복 종료
			
			
			try {									// try - 에러가 발생할 수 있는 코드
				
				showMenu();							// showMenu() 메서드 호출
				
				num = input.nextInt();				// 실행할 번호를 입력받음
	
				switch(num) {						// switch 조건문 - 인수: num
				
				case 1:								// num = 1 일 경우 -> 재고 정보 추가	
					manager.addStock();				// manager 개체의 addstock 메서드 불러옴
					break;							// break를 통해 조건문을 빠져나옴

	
				case 2: 							// num = 2 일 경우 -> 재고 정보 삭제		
					manager.deleteStock();			// manager 개체의  deleteStock 메서드 불러옴
					break;							// break를 통해 조건문을 빠져나옴
		
				case 3:								// num = 3 일 경우 -> 재고 정보 수정
					manager.editStock();			// manager 개체의  editStoc 메서드 불러옴
					break;							// break를 통해 조건문을 빠져나옴
			
				case 4:								// num = 4 일 경우-> 재고 정보 확인
					manager.viewStocks();			// manager 개체의 viewStock 메서드 불러옴
					break;							// break를 통해 조건문을 빠져나옴
				
				case 5:								// num = 5 일 경우 -> 프로그램 종료
					break;							// break를 통해 조건문을 빠져나옴
					
				default :							// num이 위의 조건을 만족하지 않을 경우 -> 1~5가 아닐 때
					continue;						// continue를 통해 num을 다시 입력 받음
				}// switch
				
			}// try
			
			catch(InputMismatchException e){		// catch - 에러가 발생할 경우 -> 아래 코드 실행
				
				System.out.print("Please put an integer between 1 and 5: ");
				
				if (input.hasNext()) {				// hasNext() - 읽어올 요소가 남아있는지 확인하는 메서드
													// 			   ㄴ> 요소가 있으면 true, 없으면 false
					input.next();					// input.next() - 입력 스트림에서 다음 요소를 읽음
													//			   ㄴ> 입력 스트림에 남아있는 잘못된 값을 제거
				}//if
				
				num = -1;							// num 변수에 -1을 할당
				
			}// catch
			
		}// while
		
		input.close();
		
	}// selectMenu()
	
	// showMenu() - 실행할 메뉴를 보여주는 메서드
	public static void showMenu() {
		
		System.out.println("1. Add stock");			// 재고 정보 추가
		System.out.println("2. Delete stock");		// 재고 정보 삭제
		System.out.println("3. Edit stock");		// 재고 정보 수정
		System.out.println("4. View stock");		// 재고 정보 확인
		System.out.println("5. Exit");				// 프로그램 종료
		System.out.print("Select one number between 1-5: ");
		
	}
	
}