package xmanagement.manager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import xmanagement.stock.Alcohol;
import xmanagement.stock.Beverage;
import xmanagement.stock.Cigarette;
import xmanagement.stock.FrozenFood;
import xmanagement.stock.RefrigerationFood;
import xmanagement.stock.RoomTemperatureFood;
import xmanagement.stock.Stock;
import xmanagement.stock.StockInput;
import xmanagement.stock.StockKind;
import xmanagement.stock.Sundries;

public class StockManager {
	
	ArrayList<StockInput>stocks = new ArrayList<StockInput>();
	Scanner input;
	
	// Manager(Scanner input) - Scanner ��ü�� �޾� �Է� ������ �ʱ�ȭ�ϴ� ������
	StockManager(Scanner input){
		this.input = input;
	}
		
	// addStock() - Stock ��ü�� �����Ͽ� stocks ArrayList�� �߰��ϴ� �޼ҵ�
	public void addStock() {
		
		int kind = 0;			// ��� ���� ����
		StockInput stockInput;			
		while (kind != 8) {		// ���� 1~7���� ������ 8�̸� �ݺ��� ����
			
			try {				// try - ������ �߻��� �� �ִ� �ڵ�
			
				System.out.println("1. Frozen Food");							// 1. �õ� ��ǰ
				System.out.println("2. Refrigeration Food");					// 2. ���� ��ǰ
				System.out.println("3. RoomTemperature Food");					// 3. ��� ��ǰ
				System.out.println("4. Alcohol");								// 4. �ַ�
				System.out.println("5. Beverage");								// 5. ����
				System.out.println("6. Cigarette");								// 6. ���
				System.out.println("7. Sundries");								// 7. ��ȭ
				System.out.print("Select num for Stock Kind from 1 to 7: ");
				
				kind = input.nextInt();						// ���� ���� �Է¹ޱ�	
						
				if (kind == 1) {							// 1: �õ� ��ǰ�� ���
					
					// Stockind�� �ʱⰪ�� FrozenFood�̹Ƿ� Stock(StockKind kind) ������ ȣ��
					stockInput = new FrozenFood(StockKind.FrozenFood);
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
				
				else if (kind == 2) {						// 2: ���� ��ǰ�� ���
					
					// Stock Ŭ������ stock ���� = new RefrigerationFood(StockKind kind) ������ ȣ��
					stockInput = new RefrigerationFood(StockKind.RefrigerationFood);	
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
				
				else if (kind == 3) {						// 3: ��� ��ǰ�� ���
					
					// Stock Ŭ������ stock ���� = new RoomTemperatureFood(StockKind kind) ������ ȣ��
					stockInput = new RoomTemperatureFood(StockKind.RoomTemperatureFood);	
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
					
				else if (kind == 4) {						// 4: �ַ��� ���
					
					// Stock Ŭ������ stock ���� = new Alcohol(StockKind kind) ������ ȣ��
					stockInput = new Alcohol(StockKind.Alcohol);			
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
				
				else if (kind == 5) {						// 5: ������ ���
					
					// Stock Ŭ������ stock ���� = new Beverage(StockKind kind) ������ ȣ�� 
					stockInput = new Beverage(StockKind.Beverage);		
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}	
				
				else if (kind == 6) {						// 6: ����� ���
					
					// Stock Ŭ������ stock ���� = new Cigarette(StockKind kind) ������ ȣ��
					stockInput = new Cigarette(StockKind.Cigarette);		
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
				
				else if (kind == 7) {						// 7: ��ȭ�� ���
					
					// Stock Ŭ������ stock ���� = new Sundries(StockKind kind) ������ ȣ��
					stockInput = new Sundries(StockKind.Sundries);				
					
					stockInput.getUserInput(input);			// getUserInput �޼��� ȣ�� -> stock ������ �ŰԺ���(input) ���� ����
					stocks.add(stockInput);					// add �޼��� ȣ�� -> stocks �迭�� �ŰԺ���(stock) ���� ����
					break;									// break - �ݺ��� ����
				}
				
				else {										// 1~7�� �ƴ� ��� �ٽ� ����
					System.out.println("Please select again num for Stock Kind from 1 to 7");
				}
				
			}// try
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 7!");
				
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}// catch
				
		}// while
			
	}// addStock()
	
	
	// deleteStock() - ����ڿ��� Stock ID�� �Է¹޾� 
	//                 ArrayList���� ��ġ�ϴ� Stock ID�� �߰� �� �����ϴ� �޼���
	public void deleteStock() {
		
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId�� �Է� ����
		int index = findIndex(stockId);					// findIndex �޼��� ȣ�� - �μ�: stockId
		removeFromStock(index, stockId);				// removeFromStock �޼��� ȣ�� - �μ�: index, stockId
		
	}
	
	
	// findIndex() - stocks�� �ε����� ã�� �޼���
	public int findIndex(int stockId) {
		
		int index = -1;									// index ������ -1�� �ʱ�ȭ
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ�  
		{
			
			if(stocks.get(i).getId() == stockId) {		// �Է¹��� stockId�� stocks �迭�� i��° �ε����� Id�� ���� ���
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
				index = i;								// index = i
				break;									// break - �ݺ��� ����
			}// if	
			
		}// for
		
		return index;
		
	}// findIndex()
	
	
	// removeFromStock() - �ε����� ��ġ�� �������� ���� �� �����ϴ� �޼���
	public int removeFromStock(int index, int stockId) {
		
		if(index >=0){									// index�� 0���� Ŭ ���
			stocks.remove(index);						// stocks �迭�� index ���� ����
														// ��> ArrayList.get(int index)
														//    : ���ڷ� ���޵� �ε��� ��ġ�� �������� ����Ʈ���� ����, ��ü�� ����
			System.out.println("the stock " + stockId + "is deleted");
			return 1;									// 1�� ��ȯ
		}

		else{											// ���� ������ �������� ���� ��� -> return
			System.out.println("the stock has been resistered");
			return -1;									// -1�� ��ȯ
		}
		
	}
	
	// editStock() - Stock ID �Է��ϰ� ��ġ�ϴ� Stock ID�� ���� stocks ArrayList �˻�
	//               -> ������ �ʵ�(ID, �̸�, �Ǹ� �Ǵ� �ֽ� �Է�)�� ����ڿ��� ���� �޼����Դϴ�.
	public void editStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();					// StockId �Է� ����
		
		for(int i = 0; i<stocks.size(); i++)			// 0���� 1�� �����ϸ� stocks �迭�� ũ����� �ݺ� 
		{
			
			StockInput stock = stocks.get(i);				// Stock Ŭ������ stock ���� = stocks �迭�� i��° �ε����� �ִ� ��ü 
														// ��> ArrayList.get(int index): ���� - �ε��� -> �ε����� ��ġ�� �ִ� ��ü�� ����
			
			if(stock.getId() == stockId) 				// getId �޼��� ȣ�� -> stock ������ ���� stockId�� ���� ���� ���
			{				
				int num = -1;							// num�� -1�� �ʱ�ȭ
				
				while (num != 6) {							// num�� 6�� �ƴ� ������ �ݺ�
					
					showEditMenu();
					
					num = input.nextInt();					// num �� �Է�
					
					switch(num) {
					
					case 1:									// num�� 1�� ���
						stock.setStockId(input);
						break;
					
					case 2:									// num�� 2�� ���
						stock.setStockName(input);
						break;
						
					case 3:									// num�� 3�� ���
						stock.setStockDate(input);
						break;
						
					case 4:									// num�� 4�� ���
						stock.setStockSale(input);
						break;
						
					case 5:									// num�� 5�� ���
						stock.setStockOrder(input);
						break;
						
					default:								// ���� ������ �� ���� ���� ���
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
	
	public void showEditMenu() {
		System.out.println("1. Edit Id");		// 1. ��� ���� ��ȣ ����
		System.out.println("2. Edit Name");		// 2. ��� �̸� ����
		System.out.println("3. Edit Date");		// 3. ��� ������� ����
		System.out.println("4. Edit Sale");		// 4. ��� �Ǹ� ���� ����
		System.out.println("5. Edit Order");	// 5. ��� �ֹ�(����) ���� ����
		System.out.println("6. Exit");			// 6. ����
		System.out.println("Select one number between 1-6");
		
	}
}
