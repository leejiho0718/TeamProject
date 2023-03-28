package assignment_2;

import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		
				
		Scanner input = new Scanner(System.in);
	
        boolean work = true;	 											// while 반복문을 중지시키기 위한 참 거짓 bool형 사용 
        
        
        while(work)															// statement = true -> run = true일 때 무한 반복
        {
        	System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = input.nextInt();
            
            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = input.nextInt();
            
        	System.out.print("1. +\n2. -\n3. *\n4. /\n5. #(종료) 어떤 것을 선택하시겠습니까? (기호 or 번호): ");
            char operator = input.next().charAt(0);
            // Eclipse에서 char형 즉, 문자 하나는 scanner 불가능
            // charAt(); = String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 바꿔줌 -> (0)은 0번째 인덱스 문자 1개만 출력
            
            
        	int result;														//result에는 n1과 n2를 연산한 값을 저장
        	
        	
            switch(operator)												// 조건 - operater
            {
                case '+': case '1':											// + or 1일 때 
                    result = n1 + n2;										
                    System.out.printf("%d + %d = %d\n", n1, n2, result);
                    break;													// swith문 빠져나옴-> 반복문은 계속됨
                    
                case '-': case '2':											// - or 2일 때 					
                    result = n1 - n2;
                    System.out.printf("%d - %d = %d\n", n1, n2, result);	
                    break;													// swith문 빠져나옴-> 반복문은 계속됨
                
                case '*': case '3':											// + or 1일 때 
                    result = n1 * n2;
                    System.out.printf("%d * %d = %d\n", n1, n2, result);
                    break;
               
                case '/': case '4':											// / or 4일 때
                    if (n2 == 0) 											// n2 ==0 이면
                    {														// 정수 / 0 = 오류 발생이므로 
                        System.out.println("두 번째 숫자가 0입니다. "				// 두 번째 숫자를 바꿀 수 있도록 다시 반복문 처음으로 돌아감
                        		+ "0이 아닌 다른 숫자를 넣어주세요");				
                        break;												// swith문 빠져나옴-> 반복문은 계속됨
                    }
                    double resultD = (double)n1 / n2;
                    System.out.printf("%d / %d = %.3f\n", n1, n2, resultD);
                    break;													// swith문 빠져나옴-> 반복문은 계속됨
                    
                case '#': case '5':											// # or 5일 때
                	System.out.println("종료합니다.");
                	work = false;											// run = false로 바뀜 -> ( = while(false))
                	break;													// 즉 swith문과 반복문을 빠져나옴
                
                default:													// 조건과 맞지 않을 경우 -> 다시 입력
                    System.out.println("다시 입력하세요");						
                    break;													// swith문 빠져나옴-> 반복문은 계속됨
            }
        }
        
        input.close();
        
        
        
	}

}
