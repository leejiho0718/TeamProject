package assignment_3;

import java.util.Scanner;

public class Assignment1_1 {
		public static void main(String[]arg) {

			int num = 0;										// num = 0���� �ʱ�ȭ
			Scanner input = new Scanner(System.in);
 		
			while (num != 6) {									// num�� 6�� �ƴϸ� �ݺ� -> ��, num == 6�̸� �ݺ� ����

				System.out.println("1. Add stock");							
				System.out.println("2. Delete stock");
				System.out.println("3. Edit stock");
				System.out.println("4. Vidw stock");
				System.out.println("5. Show a Menu");
				System.out.println("6. Exit");
				System.out.println("Select one number between 1-6");

				num = input.nextInt();

				if (num==1) 									// num = 1�� �� -> ��� ���� �߰�
				{
					addStock();									// addstock�Լ� �ҷ���
				}

				else if(num==2) 								// num = 2 �� �� -> ��� ���� ����
				{
					deleteStock();								// deleteStock�Լ� �ҷ���
				}

				else if(num==3) 								// num = 3 �� �� -> ��� ���� ����
				{
					editStock();								// editStock�Լ� �ҷ���
				}
				else if(num==4) 								// num = 4 �� �� -> ��� ���� Ȯ��
				{
					viewStock();								// viewStock�Լ� �ҷ���
				}
				
				else 
				{
					continue;
				}
				
			}
			
			input.close();
		}

		public static void addStock() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Commodity type: ");				// ���� ���� �Է�		
			String stockType = input.next();					// ���ڿ� ������ stockType�� ����(���� ����) �Է�
			
			System.out.print("Commodity name: ");				// ���� �̸� �Է�
			String stockName = input.next();					// ���ڿ� ������ stockName�� ���ڿ�(���� �̸�) �Է�

			System.out.print("Unique number: ");					// ���� ���� ��ȣ �Է�
			int stockUnique = input.nextInt();					// ������ ������ stockUnique�� ����(���� ��ȣ) �Է�
			
			System.out.print("The number of commodity: ");		// ���� ���� �Է�
			int stockNumber = input.nextInt();					// ������ ������ StockNumber�� ����(���� ���) �Է�
		}

		public static void deleteStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// ���� ���� ��ȣ �Է�
			int stockUnique = input.nextInt();					// ������ ������ stockUnique�� ����(���� ��ȣ) �Է�
		}

		public static void editStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// ���� ���� ��ȣ �Է�
			int stockUnique = input.nextInt();					// ������ ������ stockUnique�� ����(���� ��ȣ) �Է�
		}

		public static void viewStock() {
			Scanner input = new Scanner(System.in);
			System.out.print("Unique number: ");				// ���� ���� ��ȣ �Է�
			int stockUnique = input.nextInt();					// ������ ������ stockUnique�� ����(���� ��ȣ) �Է�
		}
		
		
 }