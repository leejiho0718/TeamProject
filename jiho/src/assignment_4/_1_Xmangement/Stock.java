package assignment_4._1_Xmangement;

public class Stock {
	String name;	// 재고 이름
	int id;			// 재고 고유 번호
	int sale;		// 재고 판매 갯수
	int stockinput;	// 재고 추가 갯수

	public Stock() {
		
	}
	
	// String name, int id, int sale, int stockinput 
	// - 4개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id, int sale, int stockinput) {
		this.name = name;
		this.id = id;
		this.sale = sale;
		this.stockinput = stockinput;
	}
	
	// PrintInfo() - 재고 정보를 출력하는 메소드.
	public void PrintInfo() {
		System.out.println("name:"+name+" id:"+id+" sale:"+sale+ " stockinput:"+stockinput);
	}

}