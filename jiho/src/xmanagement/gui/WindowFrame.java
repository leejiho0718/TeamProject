package xmanagement.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xmanagement.manager.StockManager;

public class WindowFrame extends JFrame{

	StockManager stockManager;
	
	MenuSelection menuSelection;
	StockAdder stockAdder;
	StockViewer stockViewer;

	public WindowFrame(StockManager stockManager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		//this.setupPanel(menuSelection);

		this.stockManager = stockManager;
		menuSelection = new MenuSelection(this);
		stockAdder = new StockAdder(this);
		stockViewer = new StockViewer(this, this.stockManager);
		
		this.add(menuSelection);
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();

	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public StockAdder getStockAdder() {
		return stockAdder;
	}

	public void setStockadder(StockAdder stockAdder) {
		this.stockAdder = stockAdder;
	}

	public StockViewer getStockViewer() {
		return stockViewer;
	}

	public void setStockViewer(StockViewer stockViewer) {
		this.stockViewer = stockViewer;
	}
}
