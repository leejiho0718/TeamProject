package assignment_3;

import java.util.*;		// util디렉토리 안에 있는 모든 클래스를 가져옴

public class Assignment2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        String sentence = "안녕하세요 저는 경상국립대 항공우주 및 소프트웨어 공학과에 재학 중인 2학년 이지호라고 합니다.";
        
        String[] words = sentence.split(" ");						// split() 메서드 - ()안에 문자를 기준으로 분할 
															        // ㄴ> 공백 문자(" ")를 기준 -> 개별 단어로 분할 
															        // ㄴ> sentence 변수에서 호출-> 분할된 단어들은 words 배열에 저장						
        
        
        HashSet<String> wordSet = new HashSet<String>();			// Hashset - Set 인터페이스의 구현 클래스 -> 저장 순서를 유지 X  &  중복 값을 허용 X
        															// 중복 요소를 포함하지 않는 컬렉션 wordSet이라는 HashSet 정의 
        
                
        
        for (String word : words) 									// for-each 반복문 - words 배열의 각 단어를 반복하는데 사용
        									
            wordSet.add(word);										// add() 메서드 - 리스트 끝에 요소 추가
        															// ㄴ> "wordSet" HashSet 추가
        															// ㄴ> HashSet은 중복 요소를 허용하지 않음 -> 중복 요소 자동 제거

        
        
        System.out.println("단어 갯수: " + wordSet.size());			// size() 메서드 - Collection 객체의 길이 구함
        															// ㄴ> "wordSet" HashSet에서 size() 메서드를 호출 -> 문장에서 고유한 단어 수를 가져옴 
 
																    // Collection 객체	-	여러 원소들을 담을 수 있는 자료구조
																    // ㄴ> List형		  	-	순서가 있는 목록인 
																    // ㄴ> Set형		  	-	순서가 중요하지 않은 목록인 Set형
																    // ㄴ> Queue형	  	-	먼저 들어온 것이 먼저 나가는 Queue형
																    // ㄴ> Map형		  	-	KEY-VALUE의 형태로 저장되는 Map형
																        
        
        
        HashSet<String> lowerCaseWordSet = new HashSet<String>();	// "lowerCaseWordSet" HashSet 정의 - 고유 단어 소문자로 저장하기 위함 
        
       
        
        for (String word : words) 									// for-each 반복문 - words 배열의 각 단어를 반복하는데 사용
        {
            lowerCaseWordSet.add(word.toLowerCase());				// toLowerCase() 메서드 	-	문자열을 모두 소문자로 변환
														            //         add() 메서드 	-	리스트 끝에 요소 추가
																	// ㄴ> "lowerCaseWordSet" HashSet 호출 -> 소문자 변환 후 추가														
        }			
        
        System.out.println("소문자의 경우, 단어 갯수: " + lowerCaseWordSet.size());
        
        input.close();
    }

}
