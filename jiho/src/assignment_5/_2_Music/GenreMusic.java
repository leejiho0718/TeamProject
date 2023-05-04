package assignment_5._2_Music;

public class GenreMusic extends Music {
	
	// private 접근자 - 같은 패키지 안에서만 호출 가능
    private String genre; 	// 장르
    
    // 생성자 - name, song 및 genre 인스턴스 변수를 인수로 받아 초기화
    public GenreMusic(String name, String song, String genre) {
        super(name, song);
        this.genre = genre;
    }
    
    
    // getter & setter
    
    // getGenre 메서드 - genre 인스턴스 변수의 값을 반환
    public String getGenre() {
        return genre;
    }
    
    // setGenre 메서드 - genre 인스턴스 변수의 값을 인수로 전달된 값
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // printPlayData 메서드 - getSong(), getName(), getGenre() 메서드 호출 
    // 						-> 작곡가, 노래, 장르 출력
    public void printPlayData() {
        System.out.println(getSong() + " of " + getName() + " (" + getGenre() + ")");
    }
   
}

