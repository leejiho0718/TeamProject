package assignment_8._2_Exception_Add;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Add {
	 public static void main(String[] args) {
		 
	        Scanner input = new Scanner(System.in);	

	        try {									// try - ������ �߻��� �� �ִ� �ڵ�
	        	
	            System.out.print("ù ��° ����: ");		
	            int n1 = input.nextInt();			// ���� n1 �Է�

	            System.out.print("�� ��° ����: ");
	            int n2 = input.nextInt();			// ���� n2 �Է�

	            int sum = n1 + n2;					// ���� sum = n1 + n2
	            
	            System.out.println("�հ�: " + sum);
	            
	        }
	        
	        catch (InputMismatchException e) {		// catch - ������ �߻��� ��� -> �Ʒ� �ڵ� ���� 
	        	
	            System.out.println("����! ���ڸ� �Է��ϼ���!");
	            
	        }

	        input.close();
	 }

}
