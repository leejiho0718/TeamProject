package assignment_10._1_Xmanagement_Manager;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import assignment_10._1_Xmanagement_Log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");

	
	public static void main(String[]arg) {

		Scanner input = new Scanner(System.in);
		StockManager stockManager = getObject("stockmanager.ser");
		if(stockManager == null) {
			stockManager = new StockManager(input);

		}

		selectMenu(input, stockManager);
		putObject(stockManager, "stockmanager.ser");
	}
	
	public static void selectMenu(Scanner input, StockManager stockManager) {
		
		int num = -1;								// num = -1로 초기화
		while (num != 5) {							// num이 6이 아니면 반복 -> 즉, num == 6이면 반복 종료
			
			
			try {									// try - 에러가 발생할 수 있는 코드
				
				showMenu();							// showMenu() 메서드 호출
				
				num = input.nextInt();				// 실행할 번호를 입력받음
	
				switch(num) {						// switch 조건문 - 인수: num
				
				case 1:								// num = 1 일 경우 -> 재고 정보 추가	
					stockManager.addStock();				// manager 개체의 addstock 메서드 불러옴
					logger.log("add a stock");
					break;							// break를 통해 조건문을 빠져나옴

	
				case 2: 							// num = 2 일 경우 -> 재고 정보 삭제		
					stockManager.deleteStock();			// manager 개체의  deleteStock 메서드 불러옴
					logger.log("delete a stock");

					break;							// break를 통해 조건문을 빠져나옴
		
				case 3:								// num = 3 일 경우 -> 재고 정보 수정
					stockManager.editStock();			// manager 개체의  editStoc 메서드 불러옴
					logger.log("edit a stock");

					break;							// break를 통해 조건문을 빠져나옴
			
				case 4:								// num = 4 일 경우-> 재고 정보 확인
					stockManager.viewStocks();			// manager 개체의 viewStock 메서드 불러옴
					logger.log("view stocks");

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
	
	public static StockManager getObject(String filename) {
		StockManager stockManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockManager = (StockManager) in.readObject();
			in.close();
			file.close();
		}
		catch(FileNotFoundException e){
			return stockManager;
		}
		catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return stockManager;
	}
	
	public static void putObject(StockManager stockManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockManager);
			out.close();
			file.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
}