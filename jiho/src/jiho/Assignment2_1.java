package jiho;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("ȭ�� �µ��� �Է��ϼ���: ");
		
		double ft = temp.nextDouble();
		
		double ct = (5.0/9.0) * (ft - 32);
		
		System.out.printf("���� �µ��� %f 'C�Դϴ�.", ct);
		
		temp.close();

	}

}