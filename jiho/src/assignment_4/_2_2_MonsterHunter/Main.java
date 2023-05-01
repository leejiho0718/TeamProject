package assignment_4._2_2_MonsterHunter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("����: ");
        String name = input.nextLine();			
        System.out.print("HP: ");
        int hp = input.nextInt();

        Monster monster = new Monster(name, hp);	// name, hp�� �Է¹��� Monster ��ü ����
        Hunter hunter = new Hunter();				// Hunter ��ü ����

        System.out.println("�߻��� \""+ monster.getName() + "\" �� ��Ÿ����. - " + monster.getHp() + " HP.");

        while(true) 								// while �ݺ��� - ���� ����
        {
            System.out.print("������: ");
            int damage = input.nextInt();
            
            hunter.attack(monster, damage);			// hunter ��ü�� attack �޼��� ȣ�� - monster�� damage�� �μ��� ����
            
            System.out.println("\"" + monster.getName() + "\"�� ���� HP - " + monster.getHp() + " HP.");
            
            if(monster.getHp()<=20 && monster.getHp()>0)							// monster ��ü�� getHp �޼��� ȣ��  
            {																		// -> monster.getHp()�� ���� 20����, 0 �ʰ��� ������ ��� ������ ��
            	System.out.println("���� HP�� 20 ���� �Դϴ�! ���ݸ� �� ��������");			// ���� ���
            }
            else if(monster.getHp()<=0)												// monster ��ü�� getHp �޼��� ȣ��  
            {																		// -> monster.getHp()�� ���� 0 ���� �� �� 
            	 System.out.println("�߻��� \"" + monster.getName() + "\"�� ��������.");	// ���Ͱ� ���������ϴ� ���
            	 break;																// �ݺ��� ��������
            }
        }
        
        input.close();
    }
}

