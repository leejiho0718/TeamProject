package assignment_4._2_2_MonsterHunter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("몬스터: ");
        String name = input.nextLine();			
        System.out.print("HP: ");
        int hp = input.nextInt();

        Monster monster = new Monster(name, hp);	// name, hp를 입력받은 Monster 객체 생성
        Hunter hunter = new Hunter();				// Hunter 객체 생성

        System.out.println("야생의 \""+ monster.getName() + "\" 가 나타났다. - " + monster.getHp() + " HP.");

        while(true) 								// while 반복문 - 무한 루프
        {
            System.out.print("데미지: ");
            int damage = input.nextInt();
            
            hunter.attack(monster, damage);			// hunter 객체의 attack 메서드 호출 - monster와 damage를 인수로 가짐
            
            System.out.println("\"" + monster.getName() + "\"의 남은 HP - " + monster.getHp() + " HP.");
            
            if(monster.getHp()<=20 && monster.getHp()>0)							// monster 객체의 getHp 메서드 호출  
            {																		// -> monster.getHp()의 값이 20이하, 0 초과의 조건을 모두 만족할 때
            	System.out.println("남은 HP가 20 이하 입니다! 조금만 더 힘내세요");			// 문구 출력
            }
            else if(monster.getHp()<=0)												// monster 객체의 getHp 메서드 호출  
            {																		// -> monster.getHp()의 값이 0 이하 일 때 
            	 System.out.println("야생의 \"" + monster.getName() + "\"가 쓰러졌다.");	// 몬스터가 쓰러졌습니다 출력
            	 break;																// 반복문 빠져나옴
            }
        }
        
        input.close();
    }
}

