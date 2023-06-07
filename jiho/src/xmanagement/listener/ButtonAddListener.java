package xmanagement.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import xmanagement.gui.MenuSelection;
import xmanagement.gui.StockAdder;
import xmanagement.gui.WindowFrame;


public class ButtonAddListener implements ActionListener {

	WindowFrame windowFrame;

	
	public ButtonAddListener(WindowFrame windowFrame) {
		
		this.windowFrame = windowFrame;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		StockAdder stockAdder = windowFrame.getStockAdder();
		windowFrame.setupPanel(stockAdder);

	}
	
}

