package atm;

import java.awt.*;
import javax.swing.*;

public class GUI {
	
	private JFrame frame;
	private JTextArea instruction;
	private JTextField textField;
	
	public GUI (){
		frame = new JFrame ("Saintsbury Bank");
		initComponents();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void initComponents() {
		Container contentPanel = frame.getContentPane();
		instruction = new JTextArea(5, 20);
		textField = new JTextField();
		
		instruction.setEditable(false);
		
		instruction.setText("That is the first step of swing.");
		
		contentPanel.add(instruction, BorderLayout.NORTH);
		contentPanel.add(textField, BorderLayout.SOUTH);
	}


	
	
}
