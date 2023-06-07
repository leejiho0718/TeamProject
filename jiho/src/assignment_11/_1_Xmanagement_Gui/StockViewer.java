package assignment_11._1_Xmanagement_Gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import assignment_11._1_Xmanagement_Manager.StockManager;
import assignment_11._1_Xmanagement_Stock.StockInput;

public class StockViewer extends JPanel{
	
	StockManager stockManager;
	WindowFrame windowFrame;
	
	public StockViewer(WindowFrame windowFrame, StockManager stockManager) {
		
		this.windowFrame = windowFrame;
		this.stockManager = stockManager;

		System.out.println("***" + stockManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Sale");
		model.addColumn("Order");

		for( int i = 0; i < stockManager.size(); i++) {
			Vector row = new Vector();
			StockInput stockInput = stockManager.get(i);
			row.add(stockInput.getId());
			row.add(stockInput.getName());
			row.add(stockInput.getDate());
			row.add(stockInput.getSale());
			row.add(stockInput.getOrder());
			model.addRow(row);

		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}
}
