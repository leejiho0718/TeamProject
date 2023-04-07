package assignment_3;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		int randNum = (int) (Math.random() * 2); 				// Math.random() 메서드 
																// - 0과 2 사이의 난수 생성 -> 0: 포함, 2: 제외 -> 즉, 0과 1
																// - 0.0(포함)과 1.0(제외) 사이의 double 값 반환 
		  														//	 -> 메서드 (x2) => 0.0과 2.0 사이의 값 -> 0.0: 포함, 2.0: 제외 -> 즉, 0.0 ~ 1.9xxx...
																// - 결과: 값의 소수 부분 제외 -> 정수 부분 남김 -> int형으로 형변환 
																// - randNum: 0 or 1 (동일 확률)
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("동전 선택 (H or T): ");
	    String choice = input.next();						
	    
	    
	    //equalsIgnoreCase() 메서드
	 	// - 문자의 대소문자에 관계x -> randNum == choice 확인
	    // - 값이 같으면 true를 반환, 그렇지 않으면 false를 반환
	    
	    if (randNum == 0 && choice.equalsIgnoreCase("H"))		// randNum == 0이고 H와 같다면 		
	      System.out.println("맞았습니다.");						// '맞았습니다' 출력
	      														 
	    else if (randNum == 1 && choice.equalsIgnoreCase("T"))	// randNum == 1이고 T와 같다면 
	      System.out.println("맞았습니다.");						// '맞았습니다' 출력
	    	
	    else 													// 만약 조건이 맞지 않다면 
	      System.out.println("틀렸습니다.");						// '틀렸습니다' 출력
	    
	    
	    input.close();
	}

}
