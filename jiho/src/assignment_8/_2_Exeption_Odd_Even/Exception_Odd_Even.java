package assignment_8._2_Exeption_Odd_Even;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Odd_Even {
	public static void main(String[] args) {
		
		while(true) {									// while �ݺ��� - ����: true -> ���ѷ���
	       	try {										// try - ������ �߻��� �� �ִ� �ڵ�
	        	Scanner input = new Scanner(System.in);	
	        	System.out.print("���ڸ� �Է��ϼ���: ");
	            int number = input.nextInt();			// ���� num �Է�
		        if (number % 2 != 0) {					// num % 2�� 0�� �ƴ� ��� -> Ȧ���� ���
		        	throw new MyException("Ȧ���Դϴ�!");	// throw: ������ ���� �߻�
		            									// ��> ����: throw new �߻���ų ����
		        }//if
		            
		        else if(number % 2 == 0) {				// num % 2�� 0�� ��� -> ¦���� ���
		        	System.out.println("¦���Դϴ�!");
		            break;								// �ݺ��� ���� 
		        }//else if
		        
		        else {									// ���� ������ �Ѵ� �������� ���� ���
		            continue;							// �ݺ��� ��� ����
		        }//else
       		}
	       	catch (MyException e) {						// catch - ������ �߻��� ��� -> �Ʒ� �ڵ� ����
	       												// 		 -> Ȧ���� ��� ����
	            System.out.println("����: " + e.getMessage());
	        }// catch
	        
	        catch (InputMismatchException e) {			// catch - ������ �߻��� ��� -> �Ʒ� �ڵ� ���� 
	        											// 		 -> ���ڸ� �Է����� ��� ����
	            System.out.println("����! ���ڸ� �Է��ϼ���!");   
	        }//catch
        }
    }// main
}// class
