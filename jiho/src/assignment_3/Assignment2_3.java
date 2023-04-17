package assignment_3;

import java.util.*;		// util���丮 �ȿ� �ִ� ��� Ŭ������ ������

public class Assignment2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.: ");
        String sentence = input.nextLine();
        
        String[] words = sentence.split("[,\\s]+");					// split() �޼��� - ()�ȿ� ���ڸ� �������� ����
        															// ��> sentence �������� ȣ��-> ���ҵ� �ܾ���� words �迭�� ����
        															 
        															//     "[,\\s]+"
        															// ��> "[" �� "]"		: 	��ġ��ų ���� ������ �����ϴ� ���� Ŭ���� ����
															        // ��>    ","		: 	���� Ŭ���� ���� ù ��° �����̸� ��ǥ�� ��ġ
															        // ��>   "\\s"		: 	�齽���� �ڿ� ���� s�� ���� �����̳� �ǰ� ���� ���� ���ڿ� ��ġ
															        // ��>    "+"		: 	"�ϳ� �̻�"�� �ǹ� 
        															//						-> ������ ���� ���� �Ǵ� ���� Ŭ������ �ϳ� �̻��� �׸�� ��ġ�ؾ� ���� ����

															       						
        
        
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
																    // ��> Set��		  	-	������ �߿����� ���� ���
																    // ��> Queue��	  	-	���� ���� ���� ���� ���� (First In First Out)
																    // ��> Map��		  	-	KEY-VALUE�� ���·� ����
																        
        
        
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
