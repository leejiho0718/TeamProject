package xmanagement.stock;

import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public interface StockInput {

	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setDate(int date); //throws DateFormatException;

	public void setSale(int sale);

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
