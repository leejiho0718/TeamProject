package assignment_4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("����: ");
        String name = input.nextLine();
        System.out.print("HP: ");
        int hp = input.nextInt();

        Monster monster = new Monster(name, hp);
        Hunter hunter = new Hunter();

        System.out.println("�߻��� \""+ monster.getName() + "\" �� ��Ÿ����. - " + monster.getHp() + " HP.");

        while(true) 
        {
            System.out.print("������: ");
            int damage = input.nextInt();
            hunter.attack(monster, damage);
            System.out.println("\"" + monster.getName() + "\"�� ���� HP - " + monster.getHp() + " HP.");
            
            if(monster.getHp()<=20 && monster.getHp()>0) 
            {
            	System.out.println("���� HP�� 20 ���� �Դϴ�! ���ݸ� �� ��������");
            }
            else if(monster.getHp()<=0)
            {
            	 System.out.println("�߻��� \"" + monster.getName() + "\"�� ��������.");
            	 break;
            }
        }
        
        input.close();
    }
}

