package assignment_5._2_Music;

public class Music {
	
	// private ������ - ���� ��Ű�� �ȿ����� ȣ�� ����
    private String name;	// �۰
    private String song;	// ��

    public Music(String name, String song) {
    	
    // this - �ش� �ν��Ͻ� ������ �ʱ�ȭ
        this.name = name;	
        this.song = song;
    }
    
    // getName �޼��� - name �ν��Ͻ� ������ ���� ��ȯ
    public String getName() {
        return name;	
    }
    
    // setName �޼��� - name �ν��Ͻ� ������ ���� �μ��� ���޵� ��
    public void setName(String name) {
        this.name = name;
    }
    
    // getSong �޼��� - song �ν��Ͻ� ������ ���� ��ȯ
    public String getSong() {
        return song;
    }
    
    // setSong �޼��� - song �ν��Ͻ� ������ ���� �μ��� ���޵� ��
    public void setSong(String song) {
        this.song = song;
    }
    
    // printPlayData �޼��� 
    // - getSong(), getName() �޼��带 ȣ�� -> �۰, �뷡 ���
    public void printPlayData() {
        System.out.println(getSong() + " of " + getName());
    }
    
}
