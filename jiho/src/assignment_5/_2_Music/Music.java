package assignment_5._2_Music;

public class Music {
	
	// private 접근자 - 같은 패키지 안에서만 호출 가능
    private String name;	// 작곡가
    private String song;	// 곡

    public Music(String name, String song) {
    	
    // this - 해당 인스턴스 변수를 초기화
        this.name = name;	
        this.song = song;
    }
    
    // getName 메서드 - name 인스턴스 변수의 값을 반환
    public String getName() {
        return name;	
    }
    
    // setName 메서드 - name 인스턴스 변수의 값을 인수로 전달된 값
    public void setName(String name) {
        this.name = name;
    }
    
    // getSong 메서드 - song 인스턴스 변수의 값을 반환
    public String getSong() {
        return song;
    }
    
    // setSong 메서드 - song 인스턴스 변수의 값을 인수로 전달된 값
    public void setSong(String song) {
        this.song = song;
    }
    
    // printPlayData 메서드 
    // - getSong(), getName() 메서드를 호출 -> 작곡가, 노래 출력
    public void printPlayData() {
        System.out.println(getSong() + " of " + getName());
    }
    
}
