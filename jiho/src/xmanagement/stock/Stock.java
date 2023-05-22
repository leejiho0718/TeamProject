package xmanagement.stock;

import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public abstract class Stock {
	
	protected StockKind kind = StockKind.FrozenFood;	// 재고 종류 - 디폴트 값 = 냉장식품
	protected String name;								// 재고 이름
	protected int id;									// 재고 고유 번호
	protected int date;									// 재고 유통기한
	protected int sale;									// 재고 판매 갯수
	protected int order;								// 재고 추가 갯수

	public Stock() {
		
	}
	
	// StockKind kind
	// - 1개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(StockKind kind) {
		this.kind = kind;
	}
	
	
	// String name, int id
	// - 2개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// String name, int id, int sale, int Order 
	// - 4개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id, int date, int sale, int order) {
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// StockKind kind, String name, int id, int sale, int Order 
	// - 5개의 파라미터를 받아 해당 변수를 초기화하는 생성자
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
	
	// PrintInfo() - 재고 정보를 출력하는 메소드.
	public abstract void PrintInfo();
}