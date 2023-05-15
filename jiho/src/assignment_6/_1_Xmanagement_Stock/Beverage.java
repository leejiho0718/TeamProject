package assignment_6._1_Xmanagement_Stock;

import java.util.Scanner;

public class Beverage extends Stock {
	
	// Beverage ������ - �Ű�����: StockKind Ŭ���� Ÿ���� kind ���� 
	public Beverage(StockKind kind) {
		super(kind);						// kind�� ��� ����
	}

	public void getStockInput(Scanner input){
		
		System.out.print("Stock ID: ");		
		int id = input.nextInt();			// ��� ���� ��ȣ �Է�
		this.setId(id);						// setId �޼��� ȣ��: ���� - id
		
		System.out.print("Stock Name: ");
		String name = input.next();			// ��� �̸� �Է�
		this.setName(name);					// setId �޼��� ȣ��: ���� - id
		
		System.out.print("Expiration Date:");	
		int date = input.nextInt();			// ��� ������� �Է�
		this.setDate(date);					// setDate �޼��� ȣ��: ���� - date
		
		char answer = 'x';					// answer�� x�� �ʱ�ȭ
		
		// answer�� ���� 'y', 'Y', 'n', 'N' �ƴ� ��쿡 �ݺ�
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.println("Was there a sale this week? (Y/N)");
			
			answer = input.next().charAt(0);				// charAt() - String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ
															// 			- ��ȣ �ȿ� ����ִ� �ε��� ��ȣ�� ��ġ�� ���ڸ� char Ÿ������ ��ȯ
			
			if(answer == 'y' || answer == 'Y') {			// answer�� ���� 'y' �Ǵ� 'Y' �� ���
				
				System.out.print("Today Sale: ");
				int sale = input.nextInt();					// ��� �Ǹ� ���� �Է�
				this.setSale(sale);							// setSale �޼��� ȣ��: ���� - sale
				
				System.out.println("Are you going to place an order today? (Y/N)");
				
				answer = input.next().charAt(0);		
				
				if(answer == 'y' || answer == 'Y') {		// answer�� ���� 'y' �Ǵ� 'Y' �� ���
					
					System.out.print("Today Order: ");
					int order = input.nextInt();			// ��� �ֹ�(����) ���� �Է�
					this.setOrder(order);					// setOrder �޼��� ȣ��: ���� - order
				}
				
				else if(answer == 'n' || answer == 'N'){	// answer�� ���� 'n' �Ǵ� 'N' �� ���
					
					this.setOrder(0);						// setOrder �޼��� ȣ��: ���� - 0
				}
				
				else {
				}
				
				break;										// break - �ݺ��� ����
			}
			
			else if(answer == 'n' || answer == 'N') {		// answer�� ���� 'n' �Ǵ� 'N' �� ���
				
				this.setSale(0);							// setDate �޼��� ȣ��: ���� - 0
				break;										// break - �ݺ��� ����
			}
			
			else {
			}
			
		}
		
	}
}
