package assignment_2;

import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] arg) {
		int num = 0;								// num = 0���� �ʱ�ȭ
	    Scanner input = new Scanner(System.in);
	      
	    while (num != 6)							// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����
	    {
	    	System.out.println("1. Add Students");
	    	System.out.println("2. Delete Students");
	        System.out.println("3. Edit Students");
	        System.out.println("4. Vidw Students");
	        System.out.println("5. Show a Menu");
	        System.out.println("6. Exit");
            System.out.print("Select one number between 1-6: ");
	         
            num = input.nextInt();
	         
	        switch(num) 							// switch�� �Է� ���� = num
	        {
	        case 1:									// num = 1�� �� -> �л� ���� �߰�
	        	System.out.print("Student Id: ");	
	            int studentId = input.nextInt();	// ������ ������ studentId�� ����(�л� ��ȣ) �Է�
	            
	            System.out.print("Student Name: ");
	            String studentName = input.next();	// ���ڿ� ������ studentName�� ���ڿ�(�л� �̸�) �Է�
	            
	            break;								// break�� ���� ���ڿ��� ��������
	            
	        case 2:									// num = 2 �� �� -> �л� ���� ����
	         	 
	        case 3:									// num = 3 �� �� -> �л� ���� ����
	         	 			
	        case 4:									// num = 4 �� �� -> �л� ���� Ȯ��
	    	    System.out.print("Student Id: ");
	            int studentId2 = input.nextInt();	// studentId2 - ����(�л� ��ȣ) �Է�
	          
	        case 5:									// num = 5 �� �� -> �޴� Ȯ��
	        	
	        
	        }
	         
	    }
	    
	    input.close();
	}

}
