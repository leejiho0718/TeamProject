package assignment_8._1_Xmanagement_Stock;

import java.util.Scanner;

public class RefrigerationFood extends Stock{
	
	// RefrigerationFood ������ - �Ű�����: StockKind Ŭ���� Ÿ���� kind ���� 
	public RefrigerationFood(StockKind kind) {
		super(kind);						// kind�� ��� ����
	}

	public void getUserInput(Scanner input){
		
		setStockId(input);
		setStockName(input);
		setStockDate(input);			
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
