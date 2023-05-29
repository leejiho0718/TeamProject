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
		
		int num = -1;								// num = -1�� �ʱ�ȭ
		while (num != 5) {							// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����
			
			
			try {									// try - ������ �߻��� �� �ִ� �ڵ�
				
				showMenu();							// showMenu() �޼��� ȣ��
				
				num = input.nextInt();				// ������ ��ȣ�� �Է¹���
	
				switch(num) {						// switch ���ǹ� - �μ�: num
				
				case 1:								// num = 1 �� ��� -> ��� ���� �߰�	
					manager.addStock();				// manager ��ü�� addstock �޼��� �ҷ���
					break;							// break�� ���� ���ǹ��� ��������

	
				case 2: 							// num = 2 �� ��� -> ��� ���� ����		
					manager.deleteStock();			// manager ��ü��  deleteStock �޼��� �ҷ���
					break;							// break�� ���� ���ǹ��� ��������
		
				case 3:								// num = 3 �� ��� -> ��� ���� ����
					manager.editStock();			// manager ��ü��  editStoc �޼��� �ҷ���
					break;							// break�� ���� ���ǹ��� ��������
			
				case 4:								// num = 4 �� ���-> ��� ���� Ȯ��
					manager.viewStocks();			// manager ��ü�� viewStock �޼��� �ҷ���
					break;							// break�� ���� ���ǹ��� ��������
				
				case 5:								// num = 5 �� ��� -> ���α׷� ����
					break;							// break�� ���� ���ǹ��� ��������
					
				default :							// num�� ���� ������ �������� ���� ��� -> 1~5�� �ƴ� ��
					continue;						// continue�� ���� num�� �ٽ� �Է� ����
				}// switch
				
			}// try
			
			catch(InputMismatchException e){		// catch - ������ �߻��� ��� -> �Ʒ� �ڵ� ����
				
				System.out.print("Please put an integer between 1 and 5: ");
				
				if (input.hasNext()) {				// hasNext() - �о�� ��Ұ� �����ִ��� Ȯ���ϴ� �޼���
													// 			   ��> ��Ұ� ������ true, ������ false
					input.next();					// input.next() - �Է� ��Ʈ������ ���� ��Ҹ� ����
													//			   ��> �Է� ��Ʈ���� �����ִ� �߸��� ���� ����
				}//if
				
				num = -1;							// num ������ -1�� �Ҵ�
				
			}// catch
			
		}// while
		
		input.close();
		
	}// selectMenu()
	
	// showMenu() - ������ �޴��� �����ִ� �޼���
	public static void showMenu() {
		
		System.out.println("1. Add stock");			// ��� ���� �߰�
		System.out.println("2. Delete stock");		// ��� ���� ����
		System.out.println("3. Edit stock");		// ��� ���� ����
		System.out.println("4. View stock");		// ��� ���� Ȯ��
		System.out.println("5. Exit");				// ���α׷� ����
		System.out.print("Select one number between 1-5: ");
		
	}
	
}