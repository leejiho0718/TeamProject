package assignment_4._2_2_MonsterHunter;

public class Monster {
    private String name;		// private 변수 - class 외부에서 접근 불가
    private int hp;

    // name, hp를 인수로 사용 & 인스턴스 변수를 초기화하는 생성자
    public Monster(String name, int hp) {
        this.name = name;		// this.멤버변수 - 매개 변수와 객체 자신이 가지고 있는 변수의 이름이 같은 경우 
        this.hp = hp;			//				이름을 구분하기 위해 this. 을 붙임
    }

    // getName() 메서드 - 몬스터의 이름을 반환
    public String getName() {
        return name;			
    }

    // getHp() 메서드 - 몬스터의 현재 hp를 반환
    public int getHp() {
        return hp;				
    }
    
    // Damage() 메서드 -  damage라는 정수 인수를 받아서 몬스터의 현재 hp를 그 양만큼 줄임
    public void Damage(int damage) {
        hp -= damage;
        if (hp < 0) {			// hp가 0보다 작으면 
            hp = 0;				// 0으로 설정
        }
    }
}
