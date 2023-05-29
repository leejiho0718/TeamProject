package assignment_8._2_Exeption_Odd_Even;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Odd_Even {
	public static void main(String[] args) {
		
		while(true) {									// while 반복문 - 조건: true -> 무한루프
	       	try {										// try - 에러가 발생할 수 있는 코드
	        	Scanner input = new Scanner(System.in);	
	        	System.out.print("숫자를 입력하세요: ");
	            int number = input.nextInt();			// 정수 num 입력
		        if (number % 2 != 0) {					// num % 2가 0이 아닐 경우 -> 홀수일 경우
		        	throw new MyException("홀수입니다!");	// throw: 강제로 예외 발생
		            									// ㄴ> 문법: throw new 발생시킬 예외
		        }//if
		            
		        else if(number % 2 == 0) {				// num % 2가 0일 경우 -> 짝수일 경우
		        	System.out.println("짝수입니다!");
		            break;								// 반복문 종료 
		        }//else if
		        
		        else {									// 위의 조건이 둘다 만족하지 않을 경우
		            continue;							// 반복문 계속 실행
		        }//else
       		}
	       	catch (MyException e) {						// catch - 에러가 발생할 경우 -> 아래 코드 실행
	       												// 		 -> 홀수이 경우 실행
	            System.out.println("오류: " + e.getMessage());
	        }// catch
	        
	        catch (InputMismatchException e) {			// catch - 에러가 발생할 경우 -> 아래 코드 실행 
	        											// 		 -> 문자를 입력했을 경우 실행
	            System.out.println("오류! 숫자를 입력하세요!");   
	        }//catch
        }
    }// main
}// class
