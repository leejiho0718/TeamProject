package xmanagement.manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[]arg) {

		Scanner input = new Scanner(System.in);
		StockManager manager = new StockManager(input);
		
	
		selectMenu(input, manager);
	}
	
	public static void selectMenu(Scanner input, StockManager manager) {
		
		int num = -1;										// num = -1�� �ʱ�ȭ
		while (num != 5) {									// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����
			
			try {
				showMenu();
				
				num = input.nextInt();
	
				switch(num) {
				case 1:								// num = 1�� �� -> ��� ���� �߰�
		
					manager.addStock();						// manager ��ü�� addstock �޼��� �ҷ���
					break;

	
				case 2: 							// num = 2 �� �� -> ��� ���� ����
		
					manager.deleteStock();					// manager ��ü��  deleteStock �޼��� �ҷ���
					break;
		
				case 3:						// num = 3 �� �� -> ��� ���� ����
			
					manager.editStock();					// manager ��ü��  editStoc �޼��� �ҷ���
					break;
			
				case 4:						// num = 4 �� �� -> ��� ���� Ȯ��
			
					manager.viewStocks();					// manager ��ü�� viewStock �޼��� �ҷ���
					break;
					
				default :
					continue;
				}
				
		
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			
		}
		
		input.close();
	}
	
	public static void showMenu() {
		
		System.out.println("1. Add stock");							
		System.out.println("2. Delete stock");
		System.out.println("3. Edit stock");
		System.out.println("4. Vidw stock");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5");
		
	}
	
}