package xmanagement.stock;

import java.util.Scanner;

public class Cigarette extends Stock{
	
	// Cigarette ������ - �Ű�����: StockKind Ŭ���� Ÿ���� kind ���� 
	public Cigarette(StockKind kind) {
		super(kind);						// kind�� ��� ����
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
		return id;
	}
}
