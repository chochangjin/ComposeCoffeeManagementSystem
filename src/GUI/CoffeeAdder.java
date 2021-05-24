package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class CoffeeAdder extends JFrame {
	
	public CoffeeAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());;
		
		JLabel labelPnum = new JLabel("Product Number : ", JLabel.TRAILING);
		JTextField fieldPnum = new JTextField(10);
		labelPnum.setLabelFor(fieldPnum);
		panel.add(labelPnum);
		panel.add(fieldPnum);
		
		JLabel labelPname = new JLabel("Product Name : ", JLabel.TRAILING);
		JTextField fieldPname = new JTextField(10);
		labelPnum.setLabelFor(fieldPname);
		panel.add(labelPname);
		panel.add(fieldPname);
		
		JLabel labelPrice = new JLabel("Product Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPnum.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
}
