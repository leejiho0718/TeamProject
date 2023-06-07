package assignment_11._1_Xmanagement_Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class StockAdder extends JPanel{

	WindowFrame windowFrame;

	public StockAdder(WindowFrame windowFrame) {
		
		this.windowFrame = windowFrame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelSale = new JLabel("Sale: ", JLabel.TRAILING);
		JTextField fieldSale = new JTextField(10);
		labelSale.setLabelFor(fieldSale);
		panel.add(labelSale);
		panel.add(fieldSale);
		
		JLabel labelOrder = new JLabel("Order: ", JLabel.TRAILING);
		JTextField fieldOrder = new JTextField(10);
		labelOrder.setLabelFor(fieldOrder);
		panel.add(labelOrder);
		panel.add(fieldOrder);
		
		
		panel.add( new JButton("save") );
		panel.add( new JButton("cancel") );

		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
