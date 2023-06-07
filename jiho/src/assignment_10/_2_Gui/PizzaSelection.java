package assignment_10._2_Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

public class PizzaSelection extends JFrame{

    
    public static void main(String[] args) {
        PizzaSelection pizzaSelection = new PizzaSelection();
    }
    
    public PizzaSelection() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Welcome to Java Pizza. Choose the type of pizza");

        JButton button1 = new JButton("Combination Pizza");
        JButton button2 = new JButton("Potato Pizza");
        JButton button3 = new JButton("Roasted Meat Pizza");
        
        JLabel countLabel = new JLabel("Count:");
        add(countLabel);
        JTextField countField = new JTextField(10);
        add(countField);


        panel1.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(countLabel);
        panel2.add(countField);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
}
