package assignment_2;

import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] arg) {
		int num = 0;								// num = 0���� �ʱ�ȭ
	    Scanner input = new Scanner(System.in);
	      
	    while (num != 6)							// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����
	    {
	    	System.out.println("1. Add Stocks");
	    	System.out.println("2. Delete Stocks");
	        System.out.println("3. Edit Stocks");
	        System.out.println("4. Vidw Stocks");
	        System.out.println("5. Show a Menu");
	        System.out.println("6. Exit");
            System.out.print("Select one number between 1-6: ");
	         
            num = input.nextInt();
	         
	        switch(num) 							// switch�� �Է� ���� = num
	        {
	        case 1:									// num = 1�� �� -> ��� ���� �߰�
	        	System.out.print("Stock Id: ");	
	            int StockId = input.nextInt();		// ������ ������ StockId�� ����(��� ��ȣ) �Է�
	            
	            System.out.print("Stock Name: ");
	            String StockName = input.next();	// ���ڿ� ������ StockName�� ���ڿ�(��� �̸�) �Է�
	            
	            break;								// break�� ���� ���ڿ��� ��������
	            
	        case 2:									// num = 2 �� �� -> ��� ���� ����
	         	 
	        case 3:									// num = 3 �� �� -> ��� ���� ����
	         	 			
	        case 4:									// num = 4 �� �� -> ��� ���� Ȯ��
	    	    System.out.print("Stock Id: ");
	            int StockId2 = input.nextInt();	// StockId2 - ����(��� ��ȣ) �Է�
	          
	        case 5:									// num = 5 �� �� -> �޴� Ȯ��
	        	
	        
	        }
	         
	    }
	    
	    input.close();
	}

}
