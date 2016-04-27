package atm;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class KeyboardPanel extends JPanel{
	private JButton[] btns;
	private String[] labels = {
			"1", "2", "3",
			"4", "5", "6",
			"7", "8", "9",
		"Clear", "0", "Enter"};
	
	public KeyboardPanel(){
		setLayout(new GridLayout(4, 3));
		btns = new JButton[12];
		for (int i = 0; i < btns.length; i++){
			btns[i] = new JButton(labels[i]);
			add(btns[i]);
		}
		
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(border);
		
	}
}
