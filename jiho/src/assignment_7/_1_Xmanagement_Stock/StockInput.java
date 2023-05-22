package assignment_7._1_Xmanagement_Stock;

import java.util.Scanner;

public interface StockInput {

	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setDate(int date);

	public void setSale(int sale);

	public void setOrder(int order);
	
	public void getUserInput(Scanner Input);
	
	public void PrintInfo();
	
}
