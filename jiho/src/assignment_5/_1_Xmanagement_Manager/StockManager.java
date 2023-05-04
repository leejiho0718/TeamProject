package assignment_5._1_Xmanagement_Manager;

import java.util.ArrayList;
import java.util.Scanner;

import assignment_5._1_Xmanagement_Stock.Stock.Stock;
import assignment_5._1_Xmanagement_Stock.Storage.Alcohol;
import assignment_5._1_Xmanagement_Stock.Storage.Beverage;
import assignment_5._1_Xmanagement_Stock.Storage.Cigarette;
import assignment_5._1_Xmanagement_Stock.Storage.RefrigerationFood;
import assignment_5._1_Xmanagement_Stock.Storage.RoomTemperatureFood;
import assignment_5._1_Xmanagement_Stock.Storage.Sundries;

public class StockManager {
	
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner ��ü�� �޾� �Է� ������ �ʱ�ȭ�ϴ� ������
	StockManager(Scanner input){
		this.input = input;
	}
	
	// addStock() - Stock ��ü�� �����Ͽ� stocks ArrayList�� �߰��ϴ� �޼ҵ�
	public void addStock() {
		
		int kind = 0;			// ��� ���� ����
		Stock stock;			
		while (kind != 8) {		// ����� 1~7���� ������ 8�̸� �ݺ��� ���� 
			
			System.out.println("1. Frozen Food");							// 1. �õ� ��ǰ
			System.out.println("2. Refrigeration Food");					// 2. ���� ��ǰ
			System.out.println("3. RoomTemperature Food");					// 3. ��� ��ǰ
			System.out.println("4. Alcohol");								// 4. �ַ�
			System.out.println("5. Beverage");								// 5. ����
			System.out.println("6. Cigarette");								// 6. ���
			System.out.println("7. Sundries");								// 7. ��ȭ
			System.out.print("Select num for Stock Kind from 1 to 7: ");
			
			kind = input.nextInt();					// ���� ���� �Է¹ޱ�	
					
			if (kind == 1) {						// 1: �õ� ��ǰ�� ���
				stock = new Stock();				// Stockind�� �ʱⰪ�� FrozenFood�̹Ƿ� Stock ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 2) {					// 2: ���� ��ǰ�� ���
				stock = new RefrigerationFood();	// Stock Ŭ������ stock ���� = new RefrigerationFood() ������ ȣ��
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 3) {					// 3: ��� ��ǰ�� ���
				stock = new RoomTemperatureFood();	// Stock Ŭ������ stock ���� = new RoomTemperatureFood() ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
				
			else if (kind == 4) {					// 4: �ַ��� ���
				stock = new Alcohol();				// Stock Ŭ������ stock ���� = new Alcohol() ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 5) {					// 5: ������ ���
				stock = new Beverage();				// Stock Ŭ������ stock ���� = new Beverage() ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 6) {					// 6: ����� ���
				stock = new Cigarette();			// Stock Ŭ������ stock ���� = new Cigarette() ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else if (kind == 7) {					// 7: ��ȭ�� ���
				stock = new Sundries();				// Stock Ŭ������ stock ���� = new Sundries() ������ ȣ�� 
				stock.getStockInput(input);			// getStockInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
				stocks.add(stock);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
				break;								// break - �ݺ��� ����
			}
			
			else {									// 1~7�� �ƴ� ��� �ٽ� ����
				System.out.println("Select num for Stock Kind from 1 to 7");
			}
				
		}
			
	}
	
	// deleteStock() - ����ڿ��� Stock ID�� �Է¹޾� 
	//                 ArrayList���� ��ġ�ϴ� Stock ID�� �߰� �� �����ϴ� �޼���
	public void deleteStock() {
		
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId�� �Է� ����
		int index = -1;									// index ������ -1�� �ʱ�ȭ
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ�  
		{
			if(stocks.get(i).getId() == stockId) {		// �Է¹��� stockId�� stocks �迭�� i��° �ε����� Id�� ���� ���
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
				index = i;								// index = i
				break;									// break - �ݺ��� ����
			}
		}
		if(index >=0){									// index�� 0���� Ŭ ���
			stocks.remove(index);						// stocks �迭�� index ���� ����
														// ��> ArrayList.get(int index)
														//    : ���ڷ� ���޵� �ε��� ��ġ�� �������� ����Ʈ���� ����, ��ü�� ����
			System.out.println("the stock " + stockId + "is deleted");
		}

		else{											// ���� ������ �������� ���� ��� -> return
			System.out.println("the stock has been resistered");
			return;
		}
	}
	
	// editStock() - Stock ID �Է��ϰ� ��ġ�ϴ� Stock ID�� ���� stocks ArrayList �˻�
	//               -> ������ �ʵ�(ID, �̸�, �Ǹ� �Ǵ� �ֽ� �Է�)�� ����ڿ��� ���� �޼����Դϴ�.
	public void editStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId �Է� ����
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ� 
		{
			
			Stock stock = stocks.get(i);				// Stock Ŭ������ stock ���� = stocks �迭�� i��° �ε����� �ִ� ��ü 
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
			
			if(stock.getId() == stockId) 				// getId �޼��� ȣ�� -> stock ������ ���� stockId�� ���� ���� ���
			{				
				int num = -1;							// num�� -1�� �ʱ�ȭ
				
				while (num != 6) {							// num�� 6�� �ƴ� ������ �ݺ�
					System.out.println("1. Edit Id");		// 1. ��� ���� ��ȣ ����
					System.out.println("2. Edit Name");		// 2. ��� �̸� ����
					System.out.println("3. Edit Date");		// 3. ��� ������� ����
					System.out.println("4. Edit Sale");		// 4. ��� �Ǹ� ���� ����
					System.out.println("5. Edit Order");	// 5. ��� �ֹ�(����) ���� ����
					System.out.println("6. Exit");			// 6. ����
					System.out.println("Select one number between 1-5");
					
					num = input.nextInt();					// num �� �Է�
					
					if (num==1) {							// num�� 1�� ���
						System.out.println("Stock Id");		
						int id = input.nextInt();			// ��� ���� ��ȣ �Է�
						stock.setId(id);					// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==2) {
						System.out.println("Stock Name");
						String name = input.nextLine();		// ��� �̸� �Է�
						stock.setName(name);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==3) {
						System.out.println("Expiration Date");
						int date = input.nextInt();			// ��� ������� �Է�
						stock.setDate(date);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==4) {
						System.out.println("Today Sale");
						int sale = input.nextInt();			// ��� ���� ���� �Է�
						stock.setSale(sale);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else if(num==5) {
						System.out.println("Today Order");
						int order = input.nextInt();		// ��� �ֹ�(����) ���� �Է�
						stock.setOrder(order);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
					}
					
					else {									// ���� ������ �� ���� ���� ���
						continue;							// ���
					}
					
				}		
				
			}
			
			
	
		}

		
	}
	
	// viewStocks() - stocks ArrayList�� �ִ� ��� �ֽ��� ������ ����ϴ� �޼ҵ�
	public void viewStocks() {
	//  System.out.print("Stock ID: ");
	//  int stockId = input.nextInt();	
		
		for(int i = 0; i<stocks.size(); i++)		// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ� 
		{
			stocks.get(i).PrintInfo();				// PrintInfo �޼��� ȣ�� -> stocks �迭�� i��° �ε���
													// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
	
		}

	}
}