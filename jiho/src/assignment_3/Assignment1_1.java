package assignment_3;

import java.util.Scanner;

public class Assignment1_1 {
		public static void main(String[]arg) {

			int num = 0;										// num = 0으로 초기화
			Scanner input = new Scanner(System.in);
 		
			while (num != 6) {									// num이 6이 아니면 반복 -> 즉, num == 6이면 반복 종료

				System.out.println("1. Add stock");							
				System.out.println("2. Delete stock");
				System.out.println("3. Edit stock");
				System.out.println("4. Vidw stock");
				System.out.println("5. Show a Menu");
				System.out.println("6. Exit");
				System.out.println("Select one number between 1-6");

				num = input.nextInt();

				if (num==1) 									// num = 1일 때 -> 재고 정보 추가
				{
					addStock();									// addstock함수 불러옴
				}

				else if(num==2) 								// num = 2 일 때 -> 재고 정보 삭제
				{
					deleteStock();								// deleteStock함수 불러옴
				}

				else if(num==3) 								// num = 3 일 때 -> 재고 정보 수정
				{
					editStock();								// editStock함수 불러옴
				}
				else if(num==4) 								// num = 4 일 때 -> 재고 정보 확인
				{
					viewStock();								// viewStock함수 불러옴
				}
				
				else 
				{
					continue;
				}
				
			}
			
			input.close();
		}

		public static void addStock() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Commodity type: ");				// 물건 종류 입력		
			String stockType = input.next();					// 문자열 변수인 stockType에 정수(물건 종류) 입력
			
			System.out.print("Commodity name: ");				// 물건 이름 입력
			String stockName = input.next();					// 문자열 변수인 stockName에 문자열(물건 이름) 입력

			System.out.print("Unique number: ");					// 물건 고유 번호 입력
			int stockUnique = input.nextInt();					// 정수형 변수인 stockUnique에 정수(고유 번호) 입력
			
			System.out.print("The number of commodity: ");		// 물건 갯수 입력
			int stockNumber = input.nextInt();					// 정수형 변수인 StockNumber에 정수(물건 잿수) 입력
		}

		public static void deleteStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// 물건 고유 번호 입력
			int stockUnique = input.nextInt();					// 정수형 변수인 stockUnique에 정수(고유 번호) 입력
		}

		public static void editStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// 물건 고유 번호 입력
			int stockUnique = input.nextInt();					// 정수형 변수인 stockUnique에 정수(고유 번호) 입력
		}

		public static void viewStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// 물건 고유 번호 입력
			int stockUnique = input.nextInt();					// 정수형 변수인 stockUnique에 정수(고유 번호) 입력
		}
		
		
 }