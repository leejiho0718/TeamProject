package assignment_4._1_Xmangement;

public class Stock {
	String name;	// ��� �̸�
	int id;			// ��� ���� ��ȣ
	int sale;		// ��� �Ǹ� ����
	int stockinput;	// ��� �߰� ����

	public Stock() {
		
	}
	
	// String name, int id, int sale, int stockinput 
	// - 4���� �Ķ���͸� �޾� �ش� ������ �ʱ�ȭ�ϴ� ������
	public Stock(String name, int id, int sale, int stockinput) {
		this.name = name;
		this.id = id;
		this.sale = sale;
		this.stockinput = stockinput;
	}
	
	// PrintInfo() - ��� ������ ����ϴ� �޼ҵ�.
	public void PrintInfo() {
		System.out.println("name:"+name+" id:"+id+" sale:"+sale+ " stockinput:"+stockinput);
	}

}