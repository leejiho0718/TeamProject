package assignment_4._2_2_MonsterHunter;

public class Monster {
    private String name;		// private ���� - class �ܺο��� ���� �Ұ�
    private int hp;

    // name, hp�� �μ��� ��� & �ν��Ͻ� ������ �ʱ�ȭ�ϴ� ������
    public Monster(String name, int hp) {
        this.name = name;		// this.������� - �Ű� ������ ��ü �ڽ��� ������ �ִ� ������ �̸��� ���� ��� 
        this.hp = hp;			//				�̸��� �����ϱ� ���� this. �� ����
    }

    // getName() �޼��� - ������ �̸��� ��ȯ
    public String getName() {
        return name;			
    }

    // getHp() �޼��� - ������ ���� hp�� ��ȯ
    public int getHp() {
        return hp;				
    }
    
    // Damage() �޼��� -  damage��� ���� �μ��� �޾Ƽ� ������ ���� hp�� �� �縸ŭ ����
    public void Damage(int damage) {
        hp -= damage;
        if (hp < 0) {			// hp�� 0���� ������ 
            hp = 0;				// 0���� ����
        }
    }
}
