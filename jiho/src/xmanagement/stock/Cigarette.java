package xmanagement.stock;

import java.util.Scanner;

public class Cigarette extends Stock{
	
	// Cigarette 생성자 - 매개변수: StockKind 클래스 타입의 kind 변수 
	public Cigarette(StockKind kind) {
		super(kind);						// kind를 상속 받음
	}

	public void getUserInput(Scanner input){
		
		setStockId(input);
		setStockName(input);
		setStockDateYN(input);
		setStockSaleYN(input);
	}
	public void PrintInfo() {
		
		String stockKind = getStockKind();
		System.out.println("kind: " + kind + " name: " + name + " id: " + id + " date: " + date + " sale: " + sale + " order: "+ order);
	}

	public int getId() {
		return 0;
	}
}
