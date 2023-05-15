package assignment_6._1_Xmanagement_Stock;

import java.util.Scanner;

public class Stock {
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
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
	
	public void getStockInput(Scanner input) {
		
		System.out.print("Stock ID: ");		
		int id = input.nextInt();		// ��� ���� ��ȣ �Է�
		this.setId(id);					// setId �޼��� ȣ��: ���� - id
		
		System.out.print("Stock Name: ");
		String name = input.next();		// ��� �̸� �Է�
		this.setName(name);				// setName �޼��� ȣ��: ���� - name
		
		System.out.print("Expiration Date:");	
		int date = input.nextInt();		// ��� ������� �Է�
		this.setDate(date);				// setDate �޼��� ȣ��: ���� - date
		
		System.out.print("Today Sale: ");
		int sale = input.nextInt();		// ��� �Ǹ� ���� �Է�
		this.setSale(sale);				// setSale �޼��� ȣ��: ���� - sale
		 
		System.out.print("Today Order: ");
		int order = input.nextInt();	// ��� �ֹ�(����) ���� �Է�
		this.setOrder(order);			// setOrder �޼��� ȣ��: ���� - order
	}
	
	
	// PrintInfo() - ��� ������ ����ϴ� �޼ҵ�.
	public void PrintInfo() {
		
		String stockKind = "none";	// stockKind ���� - none �ʱ�ȭ
		
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
		}
		
		System.out.println("kind: " + kind + " name: " + name + " id: " + id + " date: " + date + " sale: " + sale + " order: "+ order);
	}

}