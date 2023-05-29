package assignment_8._2_Exception_Add;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Add {
	 public static void main(String[] args) {
		 
	        Scanner input = new Scanner(System.in);	

	        try {									// try - 에러가 발생할 수 있는 코드
	        	
	            System.out.print("첫 번째 숫자: ");		
	            int n1 = input.nextInt();			// 정수 n1 입력

	            System.out.print("두 번째 숫자: ");
	            int n2 = input.nextInt();			// 정수 n2 입력

	            int sum = n1 + n2;					// 정수 sum = n1 + n2
	            
	            System.out.println("합계: " + sum);
	            
	        }
	        
	        catch (InputMismatchException e) {		// catch - 에러가 발생할 경우 -> 아래 코드 실행 
	        	
	            System.out.println("오류! 숫자를 입력하세요!");
	            
	        }

	        input.close();
	 }

}
