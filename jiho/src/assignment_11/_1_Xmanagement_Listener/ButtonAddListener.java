package assignment_11._1_Xmanagement_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import assignment_11._1_Xmanagement_Gui.MenuSelection;
import assignment_11._1_Xmanagement_Gui.StockAdder;
import assignment_11._1_Xmanagement_Gui.WindowFrame;


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

