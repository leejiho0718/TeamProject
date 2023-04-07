package assignment_3;

import java.util.*;		// util���丮 �ȿ� �ִ� ��� Ŭ������ ������

public class Assignment2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        String sentence = "�ȳ��ϼ��� ���� ��󱹸��� �װ����� �� ����Ʈ���� ���а��� ���� ���� 2�г� ����ȣ��� �մϴ�.";
        
        String[] words = sentence.split(" ");						// split() �޼��� - ()�ȿ� ���ڸ� �������� ���� 
															        // ��> ���� ����(" ")�� ���� -> ���� �ܾ�� ���� 
															        // ��> sentence �������� ȣ��-> ���ҵ� �ܾ���� words �迭�� ����						
        
        
        HashSet<String> wordSet = new HashSet<String>();			// Hashset - Set �������̽��� ���� Ŭ���� -> ���� ������ ���� X  &  �ߺ� ���� ��� X
        															// �ߺ� ��Ҹ� �������� �ʴ� �÷��� wordSet�̶�� HashSet ���� 
        
                
        
        for (String word : words) 									// for-each �ݺ��� - words �迭�� �� �ܾ �ݺ��ϴµ� ���
        									
            wordSet.add(word);										// add() �޼��� - ����Ʈ ���� ��� �߰�
        															// ��> "wordSet" HashSet �߰�
        															// ��> HashSet�� �ߺ� ��Ҹ� ������� ���� -> �ߺ� ��� �ڵ� ����

        
        
        System.out.println("�ܾ� ����: " + wordSet.size());			// size() �޼��� - Collection ��ü�� ���� ����
        															// ��> "wordSet" HashSet���� size() �޼��带 ȣ�� -> ���忡�� ������ �ܾ� ���� ������ 
 
																    // Collection ��ü	-	���� ���ҵ��� ���� �� �ִ� �ڷᱸ��
																    // ��> List��		  	-	������ �ִ� ����� 
																    // ��> Set��		  	-	������ �߿����� ���� ����� Set��
																    // ��> Queue��	  	-	���� ���� ���� ���� ������ Queue��
																    // ��> Map��		  	-	KEY-VALUE�� ���·� ����Ǵ� Map��
																        
        
        
        HashSet<String> lowerCaseWordSet = new HashSet<String>();	// "lowerCaseWordSet" HashSet ���� - ���� �ܾ� �ҹ��ڷ� �����ϱ� ���� 
        
       
        
        for (String word : words) 									// for-each �ݺ��� - words �迭�� �� �ܾ �ݺ��ϴµ� ���
        {
            lowerCaseWordSet.add(word.toLowerCase());				// toLowerCase() �޼��� 	-	���ڿ��� ��� �ҹ��ڷ� ��ȯ
														            //         add() �޼��� 	-	����Ʈ ���� ��� �߰�
																	// ��> "lowerCaseWordSet" HashSet ȣ�� -> �ҹ��� ��ȯ �� �߰�														
        }			
        
        System.out.println("�ҹ����� ���, �ܾ� ����: " + lowerCaseWordSet.size());
        
        input.close();
    }

}
