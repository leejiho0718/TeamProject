package xmanagement.stock;

import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public abstract class Stock {
	
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

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) throws DateFormatException {
		String targetDate = "2023";
		String inputDate = String.valueOf(date);
		if(!inputDate.contains(targetDate) || inputDate.equals("")) {
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
	
	public void setStockDate(Scanner input) {
		String targetDate = "2023";
		String inputDate = String.valueOf(date);
		
		while(!inputDate.contains(targetDate)) {
			
			System.out.println("Expiration Date:");
			
			int date = input.nextInt();
			try {
				this.setDate(date);
			}
			catch(DateFormatException e){
				System.out.println("Incorrect Date Format, put the Expiration Date that contains 2023");
				e.printStackTrace();
				
			}
		}
		
	}
	
	// PrintInfo() - ��� ������ ����ϴ� �޼ҵ�.
	public abstract void PrintInfo();
}