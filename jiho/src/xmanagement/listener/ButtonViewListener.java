package xmanagement.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import xmanagement.gui.MenuSelection;
import xmanagement.gui.StockViewer;
import xmanagement.gui.WindowFrame;


public class ButtonViewListener implements ActionListener {

	WindowFrame windowFrame;
	
	public ButtonViewListener(WindowFrame windowFrame) {
		
		this.windowFrame = windowFrame;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		StockViewer stockViewer = windowFrame.getStockViewer();
		windowFrame.setupPanel(stockViewer);
		
	}
}
