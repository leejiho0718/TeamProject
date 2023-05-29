package xmanagement.stock;

import java.io.Serializable;
import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public abstract class Stock implements StockInput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3847382418549831835L;
	protected StockKind kind = StockKind.FrozenFood;	// ��� ���� - ����Ʈ �� = �����ǰ
	protected String name;								// ��� �̸�
	protected int id;									// ��� ���� ��ȣ
	protected int date;									// ��� �������
	protected int sale;									// ��� �Ǹ� ����
	protected int order;								// ��� �߰� ����

	public Stock() {
		
	}
	
	// StockKind kind
	// - 1���� �Ķ���͸� �޾� �ش� ������ �ʱ�ȭ�ϴ� ������
	public Stock(StockKind kind) {
		this.kind = kind;
	}
	
	
	// String name, int id
	// - 2���� �Ķ���͸� �޾� �ش� ������ �ʱ�ȭ�ϴ� ������
	public Stock(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// String name, int id, int sale, int Order 
	// - 4���� �Ķ���͸� �޾� �ش� ������ �ʱ�ȭ�ϴ� ������
	public Stock(String name, int id, int date, int sale, int order) {
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// StockKind kind, String name, int id, int sale, int Order 
	// - 5���� �Ķ���͸� �޾� �ش� ������ �ʱ�ȭ�ϴ� ������
	public Stock(StockKind kind, String name, int id, int date, int sale, int order) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// Getter & Setter
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) throws DateFormatException {
		String targetDate = "2023";
		String inputDate = String.valueOf(date);
		if((!inputDate.contains(targetDate) || inputDate.equals("0")) || inputDate.length() != 8) {
			throw new DateFormatException();
		}
		
		this.date = date;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	// PrintInfo() - ��� ������ ����ϴ� �޼ҵ�.
	public abstract void PrintInfo();
	
	public void setStockId(Scanner input) {
		System.out.print("Stock Id: ");		
		int id = input.nextInt();		// ��� ���� ��ȣ �Է�
		this.setId(id);					// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
	
	}
	
	public void setStockName(Scanner input) {
		System.out.print("Stock Name: ");
		String name = input.next();		// ��� �̸� �Է�
		this.setName(name);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
	
	}
	
	public void setStockDate(Scanner input) {
		
		String targetDate = "2023";
		
		String inputDate = String.valueOf(date);
		
		while(!inputDate.contains(targetDate) || inputDate.length()!=8) {
			
			System.out.print("Expiration Date: ");
			
			inputDate = input.next();
			try {
				int date = Integer.valueOf(inputDate);
				this.setDate(date);
			}
			catch( DateFormatException e ){
				System.out.println("Incorrect Date Format, put the Expiration Date that contains 2023");
			}
		}
	
	}
	
	public void setStockSale(Scanner input) {
		System.out.print("Today Sale: ");
		int sale = input.nextInt();			// ��� ���� ���� �Է�
		this.setSale(sale);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ����
	
	}
	
	public void setStockOrder(Scanner input) {
		System.out.print("Today Order: ");
		int order = input.nextInt();		// ��� �ֹ�(����) ���� �Է�
		this.setOrder(order);				// setId �޼��� ȣ�� -> stock ������ �ŰԺ���(id) ���� ������
	
	}
	
	
	public void setStockDateYN(Scanner input) {
		
		char answer = 'x';					// answer�� x�� �ʱ�ȭ
		
		// answer�� ���� 'y', 'Y', 'n', 'N' �ƴ� ��쿡 �ݺ�
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.print("Is there an Expiration date? (Y/N): ");
			
			answer = input.next().charAt(0);				// charAt() - String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ
															// 			- ��ȣ �ȿ� ����ִ� �ε��� ��ȣ�� ��ġ�� ���ڸ� char Ÿ������ ��ȯ
			try {
				if(answer == 'y' || answer == 'Y') {			// answer�� ���� 'y' �Ǵ� 'Y' �� ���
					
					setStockDate(input);
					break;										// break - �ݺ��� ����
				}
				
				else if(answer == 'n' || answer == 'N') {		// answer�� ���� 'n' �Ǵ� 'N' �� ���
					
					this.setDate(0);							// setDate �޼��� ȣ��: ���� - 0
					break;										// break - �ݺ��� ����
				}
				
				else {
				}
			}
			catch(DateFormatException e) {
				System.out.println("Incorrect Date Format, put the Expiration Date that contains 2023");
			}
		}
	}
	
	public void setStockSaleYN(Scanner input) {
		
		char answer = 'x';									// answer�� x�� �ʱ�ȭ
		
		// answer�� ���� 'y', 'Y', 'n', 'N' �ƴ� ��쿡 �ݺ�
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.print("Was there a sale this week? (Y/N): ");
			
			answer = input.next().charAt(0);				// charAt() - String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ
															// 			- ��ȣ �ȿ� ����ִ� �ε��� ��ȣ�� ��ġ�� ���ڸ� char Ÿ������ ��ȯ
			
			if(answer == 'y' || answer == 'Y') {			// answer�� ���� 'y' �Ǵ� 'Y' �� ���
				
				setStockSale(input);
				
				setStockOrderYN(input);
			}
			
			else if(answer == 'n' || answer == 'N') {		// answer�� ���� 'n' �Ǵ� 'N' �� ���
				
				this.setSale(0);							// setDate �޼��� ȣ��: ���� - 0
				break;										// break - �ݺ��� ����
			}
			
			else {
			}
			
		}
	}
	
	public void setStockOrderYN(Scanner input) {
		
		char answer = 'x';							// answer�� x�� �ʱ�ȭ
		
		System.out.print("Are you going to place an order today? (Y/N): ");
		
		answer = input.next().charAt(0);		
		
		if(answer == 'y' || answer == 'Y') {		// answer�� ���� 'y' �Ǵ� 'Y' �� ���
			
			setStockOrder(input);
		}
		
		else if(answer == 'n' || answer == 'N'){	// answer�� ���� 'n' �Ǵ� 'N' �� ���
			
			this.setOrder(0);						// setOrder �޼��� ȣ��: ���� - 0
		}
		
		else {
		}
	}
	
	
	
	public String getStockKind() {
		
		String stockKind = "none";
		
		switch(this.kind) {
		
		case FrozenFood:			// �õ������� ���
			stockKind = "FrozenFood";
			break;					
			
		case RefrigerationFood:		// ���������� ���
			stockKind = "RefrigerationFood";
			break;						
			
		case RoomTemperatureFood:	// ��������� ���
			stockKind = "RoomTemperatureFood";
			break;
			
		case Alcohol:				// �ַ��� ���
			stockKind = "Alcohol";
			break;
			
		case Beverage:				// ������ ���
			stockKind = "Beverage";
			break;
			
		case Cigarette:				// ����� ���
			stockKind = "Cigarette";
			break;
			
		case Sundries:				// ��ȭ�� ���
			stockKind = "Sundries";
			break;
			
		default:
		}
		
		return stockKind;	
	}
}