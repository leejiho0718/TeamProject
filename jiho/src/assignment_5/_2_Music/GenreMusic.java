package assignment_5._2_Music;

public class GenreMusic extends Music {
	
	// private ������ - ���� ��Ű�� �ȿ����� ȣ�� ����
    private String genre; 	// �帣
    
    // ������ - name, song �� genre �ν��Ͻ� ������ �μ��� �޾� �ʱ�ȭ
    public GenreMusic(String name, String song, String genre) {
        super(name, song);
        this.genre = genre;
    }
    
    
    // getter & setter
    
    // getGenre �޼��� - genre �ν��Ͻ� ������ ���� ��ȯ
    public String getGenre() {
        return genre;
    }
    
    // setGenre �޼��� - genre �ν��Ͻ� ������ ���� �μ��� ���޵� ��
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // printPlayData �޼��� - getSong(), getName(), getGenre() �޼��� ȣ�� 
    // 						-> �۰, �뷡, �帣 ���
    public void printPlayData() {
        System.out.println(getSong() + " of " + getName() + " (" + getGenre() + ")");
    }
   
}

