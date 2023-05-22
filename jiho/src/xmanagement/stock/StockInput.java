package xmanagement.stock;

import java.util.Scanner;

import xmanagement.exception.DateFormatException;

public interface StockInput {

	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setDate(int date) throws DateFormatException;

	public void setSale(int sale);

	public void setOrder(int order);
	
	public void getUserInput(Scanner Input);
	
	public void PrintInfo();
	
}
