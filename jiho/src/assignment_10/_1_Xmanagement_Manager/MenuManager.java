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
		
		int num = -1;								// num = -1�� �ʱ�ȭ
		while (num != 5) {							// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����
			
			
			try {									// try - ������ �߻��� �� �ִ� �ڵ�
				
				showMenu();							// showMenu() �޼��� ȣ��
				
				num = input.nextInt();				// ������ ��ȣ�� �Է¹���
	
				switch(num) {						// switch ���ǹ� - �μ�: num
				
				case 1:								// num = 1 �� ��� -> ��� ���� �߰�	
					stockManager.addStock();				// manager ��ü�� addstock �޼��� �ҷ���
					logger.log("add a stock");
					break;							// break�� ���� ���ǹ��� ��������

	
				case 2: 							// num = 2 �� ��� -> ��� ���� ����		
					stockManager.deleteStock();			// manager ��ü��  deleteStock �޼��� �ҷ���
					logger.log("delete a stock");

					break;							// break�� ���� ���ǹ��� ��������
		
				case 3:								// num = 3 �� ��� -> ��� ���� ����
					stockManager.editStock();			// manager ��ü��  editStoc �޼��� �ҷ���
					logger.log("edit a stock");

					break;							// break�� ���� ���ǹ��� ��������
			
				case 4:								// num = 4 �� ���-> ��� ���� Ȯ��
					stockManager.viewStocks();			// manager ��ü�� viewStock �޼��� �ҷ���
					logger.log("view stocks");

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