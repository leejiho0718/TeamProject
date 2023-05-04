package assignment_5._2_Music;

public class Main {

	public static void main(String[] args) {
		
		// 작곡가와 노래 각각 다른 두 개의 개체가 포함
		Music[] musicArray = {
		        new Music("Bn", "Destiny"),
		        new Music("Handel", "Messiah"),
		        new Music("Vivaldi", "Four Seasons")
		};
		
		// 작곡가와 노래, 장르 각각 다른 세 개의 개체가 포함
	    GenreMusic[] genreMusicArray = {
	        new GenreMusic("Beethoven", "Destiny", "Symphony"),
	        new GenreMusic("Handel", "Messiah", "Oratorio"),
	        new GenreMusic("Vivaldi", "Four Seasons", "Concerto")
	    };
	    
	    
	    // 0부터 genreMusicArray.length ( = 3) 미만까지 1씩 증가하며 반복
	    for(int i = 0; i < genreMusicArray.length ; i++) {
	    	
	    	// printPlayData 메서드 호출 -> musicArray의 i번 째 인덱스 출력
	    	musicArray[i].printPlayData();
	    	
	    	// printPlayData 메서드 호출 -> genreMusicArray의 i번 째 인덱스 출력
	    	genreMusicArray[i].printPlayData();
	    }
	    
	}

	
}
