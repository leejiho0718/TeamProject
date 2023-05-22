package assignment_7._1_Xmanagement_Manager;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[]arg) {

		Scanner input = new Scanner(System.in);
		StockManager manager = new StockManager(input);
		
		int num = -1;										// num = -1로 초기화
		while (num != 6) {									// num이 6이 아니면 반복 -> 즉, num == 6이면 반복 종료

			System.out.println("1. Add stock");							
			System.out.println("2. Delete stock");
			System.out.println("3. Edit stock");
			System.out.println("4. Vidw stock");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5");

			num = input.nextInt();

			if (num==1) 									// num = 1일 때 -> 재고 정보 추가
			{
				manager.addStock();							// manager 개체의 addstock 메서드 불러옴
			}

			else if(num==2) 								// num = 2 일 때 -> 재고 정보 삭제
			{
				manager.deleteStock();						// manager 개체의  deleteStock 메서드 불러옴
			}

			else if(num==3) 								// num = 3 일 때 -> 재고 정보 수정
			{
				manager.editStock();						// manager 개체의  editStoc 메서드 불러옴
			}
			else if(num==4) 								// num = 4 일 때 -> 재고 정보 확인
			{
				manager.viewStocks();						// manager 개체의 viewStock 메서드 불러옴
			}
			
			else 
			{
				continue;
			}
			
		}
		
		input.close();
	}
	

}