package assignment_5._2_Music;

public class Main {

	public static void main(String[] args) {
		
		// �۰�� �뷡 ���� �ٸ� �� ���� ��ü�� ����
		Music[] musicArray = {
		        new Music("Bn", "Destiny"),
		        new Music("Handel", "Messiah"),
		        new Music("Vivaldi", "Four Seasons")
		};
		
		// �۰�� �뷡, �帣 ���� �ٸ� �� ���� ��ü�� ����
	    GenreMusic[] genreMusicArray = {
	        new GenreMusic("Beethoven", "Destiny", "Symphony"),
	        new GenreMusic("Handel", "Messiah", "Oratorio"),
	        new GenreMusic("Vivaldi", "Four Seasons", "Concerto")
	    };
	    
	    
	    // 0���� genreMusicArray.length ( = 3) �̸����� 1�� �����ϸ� �ݺ�
	    for(int i = 0; i < genreMusicArray.length ; i++) {
	    	
	    	// printPlayData �޼��� ȣ�� -> musicArray�� i�� ° �ε��� ���
	    	musicArray[i].printPlayData();
	    	
	    	// printPlayData �޼��� ȣ�� -> genreMusicArray�� i�� ° �ε��� ���
	    	genreMusicArray[i].printPlayData();
	    }
	    
	}

	
}
