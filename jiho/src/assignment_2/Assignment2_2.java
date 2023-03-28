package assignment_2;

import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		
				
		Scanner input = new Scanner(System.in);
	
        boolean work = true;	 											// while �ݺ����� ������Ű�� ���� �� ���� bool�� ��� 
        
        
        while(work)															// statement = true -> run = true�� �� ���� �ݺ�
        {
        	System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
            int n1 = input.nextInt();
            
            System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
            int n2 = input.nextInt();
            
        	System.out.print("1. +\n2. -\n3. *\n4. /\n5. #(����) � ���� �����Ͻðڽ��ϱ�? (��ȣ or ��ȣ): ");
            char operator = input.next().charAt(0);
            // Eclipse���� char�� ��, ���� �ϳ��� scanner �Ұ���
            // charAt(); = String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� char Ÿ������ �ٲ��� -> (0)�� 0��° �ε��� ���� 1���� ���
            
            
        	int result;														//result���� n1�� n2�� ������ ���� ����
        	
        	
            switch(operator)												// ���� - operater
            {
                case '+': case '1':											// + or 1�� �� 
                    result = n1 + n2;										
                    System.out.printf("%d + %d = %d\n", n1, n2, result);
                    break;													// swith�� ��������-> �ݺ����� ��ӵ�
                    
                case '-': case '2':											// - or 2�� �� 					
                    result = n1 - n2;
                    System.out.printf("%d - %d = %d\n", n1, n2, result);	
                    break;													// swith�� ��������-> �ݺ����� ��ӵ�
                
                case '*': case '3':											// + or 1�� �� 
                    result = n1 * n2;
                    System.out.printf("%d * %d = %d\n", n1, n2, result);
                    break;
               
                case '/': case '4':											// / or 4�� ��
                    if (n2 == 0) 											// n2 ==0 �̸�
                    {														// ���� / 0 = ���� �߻��̹Ƿ� 
                        System.out.println("�� ��° ���ڰ� 0�Դϴ�. "				// �� ��° ���ڸ� �ٲ� �� �ֵ��� �ٽ� �ݺ��� ó������ ���ư�
                        		+ "0�� �ƴ� �ٸ� ���ڸ� �־��ּ���");				
                        break;												// swith�� ��������-> �ݺ����� ��ӵ�
                    }
                    double resultD = (double)n1 / n2;
                    System.out.printf("%d / %d = %.3f\n", n1, n2, resultD);
                    break;													// swith�� ��������-> �ݺ����� ��ӵ�
                    
                case '#': case '5':											// # or 5�� ��
                	System.out.println("�����մϴ�.");
                	work = false;											// run = false�� �ٲ� -> ( = while(false))
                	break;													// �� swith���� �ݺ����� ��������
                
                default:													// ���ǰ� ���� ���� ��� -> �ٽ� �Է�
                    System.out.println("�ٽ� �Է��ϼ���");						
                    break;													// swith�� ��������-> �ݺ����� ��ӵ�
            }
        }
        
        input.close();
        
        
        
	}

}
