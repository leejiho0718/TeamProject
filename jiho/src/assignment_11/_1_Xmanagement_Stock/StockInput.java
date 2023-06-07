package assignment_11._1_Xmanagement_Stock;

import java.util.Scanner;

import assignment_11._1_Xmanagement_Exception.DateFormatException;

public interface StockInput {

	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public int getDate();

	public void setDate(int date) throws DateFormatException;

	public int getSale();

	public void setSale(int sale);

	public int getOrder();

	public void setOrder(int order);
	
	public void getUserInput(Scanner Input);
	
	public void PrintInfo();
	
	public void setStockId(Scanner input);
	
	public void setStockName(Scanner input);
	
	public void setStockDate(Scanner input);
	
	public void setStockSale(Scanner input);
	
	public void setStockOrder(Scanner input);
	
	public void setStockDateYN(Scanner input);
	
	public void setStockSaleYN(Scanner input);
	
	public void setStockOrderYN(Scanner input);


	
}
