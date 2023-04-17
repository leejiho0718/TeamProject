package assignment_4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("몬스터: ");
        String name = input.nextLine();
        System.out.print("HP: ");
        int hp = input.nextInt();

        Monster monster = new Monster(name, hp);
        Hunter hunter = new Hunter();

        System.out.println("야생의 \""+ monster.getName() + "\" 가 나타났다. - " + monster.getHp() + " HP.");

        while(true) 
        {
            System.out.print("데미지: ");
            int damage = input.nextInt();
            hunter.attack(monster, damage);
            System.out.println("\"" + monster.getName() + "\"의 남은 HP - " + monster.getHp() + " HP.");
            
            if(monster.getHp()<=20 && monster.getHp()>0) 
            {
            	System.out.println("남은 HP가 20 이하 입니다! 조금만 더 힘내세요");
            }
            else if(monster.getHp()<=0)
            {
            	 System.out.println("야생의 \"" + monster.getName() + "\"가 쓰러졌다.");
            	 break;
            }
        }
        
        input.close();
    }
}

