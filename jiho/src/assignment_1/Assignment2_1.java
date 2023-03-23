package assignment_1;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		Scanner temp = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		
		double ft = temp.nextDouble();
		
		double ct = (5.0/9.0) * (ft - 32);
		
		System.out.printf("섭씨 온도는 %.2f'C입니다.", ct);
		
		temp.close();

	}

}
