package assignment_2;

import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] arg) {
		int num = 0;								// num = 0으로 초기화
	    Scanner input = new Scanner(System.in);
	      
	    while (num != 6)							// num이 6이 아니면 반복 -> 즉, num == 6이면 반복 종료
	    {
	    	System.out.println("1. Add Students");
	    	System.out.println("2. Delete Students");
	        System.out.println("3. Edit Students");
	        System.out.println("4. Vidw Students");
	        System.out.println("5. Show a Menu");
	        System.out.println("6. Exit");
            System.out.print("Select one number between 1-6: ");
	         
            num = input.nextInt();
	         
	        switch(num) 							// switch문 입력 변수 = num
	        {
	        case 1:									// num = 1일 때 -> 학생 정보 추가
	        	System.out.print("Student Id: ");	
	            int studentId = input.nextInt();	// 정수형 변수인 studentId에 정수(학생 번호) 입력
	            
	            System.out.print("Student Name: ");
	            String studentName = input.next();	// 문자열 변수인 studentName에 문자열(학생 이름) 입력
	            
	            break;								// break를 통해 문자에서 빠져나옴
	            
	        case 2:									// num = 2 일 때 -> 학생 정보 삭제
	         	 
	        case 3:									// num = 3 일 때 -> 학생 정보 수정
	         	 			
	        case 4:									// num = 4 일 때 -> 학생 정보 확인
	    	    System.out.print("Student Id: ");
	            int studentId2 = input.nextInt();	// studentId2 - 정수(학생 번호) 입력
	          
	        case 5:									// num = 5 일 때 -> 메뉴 확인
	        	
	        
	        }
	         
	    }
	    
	    input.close();
	}

}
