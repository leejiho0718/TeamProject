package assignment_3;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		int randNum = (int) (Math.random() * 2); 				// Math.random() �޼��� 
																// - 0�� 2 ������ ���� ���� -> 0: ����, 2: ���� -> ��, 0�� 1
																// - 0.0(����)�� 1.0(����) ������ double �� ��ȯ 
		  														//	 -> �޼��� (x2) => 0.0�� 2.0 ������ �� -> 0.0: ����, 2.0: ���� -> ��, 0.0 ~ 1.9xxx...
																// - ���: ���� �Ҽ� �κ� ���� -> ���� �κ� ���� -> int������ ����ȯ 
																// - randNum: 0 or 1 (���� Ȯ��)
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("���� ���� (H or T): ");
	    String choice = input.next();						
	    
	    
	    //equalsIgnoreCase() �޼���
	 	// - ������ ��ҹ��ڿ� ����x -> randNum == choice Ȯ��
	    // - ���� ������ true�� ��ȯ, �׷��� ������ false�� ��ȯ
	    
	    if (randNum == 0 && choice.equalsIgnoreCase("H"))		// randNum == 0�̰� H�� ���ٸ� 		
	      System.out.println("�¾ҽ��ϴ�.");						// '�¾ҽ��ϴ�' ���
	      														 
	    else if (randNum == 1 && choice.equalsIgnoreCase("T"))	// randNum == 1�̰� T�� ���ٸ� 
	      System.out.println("�¾ҽ��ϴ�.");						// '�¾ҽ��ϴ�' ���
	    	
	    else 													// ���� ������ ���� �ʴٸ� 
	      System.out.println("Ʋ�Ƚ��ϴ�.");						// 'Ʋ�Ƚ��ϴ�' ���
	    
	    
	    input.close();
	}

}
