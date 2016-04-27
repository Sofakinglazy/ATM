package atm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class KeyboardPanel extends JPanel implements ActionListener{
	private JButton[] btns;
	private String[] labels = {
			"1", "2", "3",
			"4", "5", "6",
			"7", "8", "9",
		"Clear", "0", "Enter"};
	private KeyboardListener keyboardListener;
	
	public KeyboardPanel(){
		setLayout(new GridLayout(4, 3));
		btns = new JButton[12];
		for (int i = 0; i < btns.length; i++){
			btns[i] = new JButton(labels[i]);
			add(btns[i]);
			btns[i].addActionListener(this);
		}
		
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(border);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String label = btn.getText();
		keyboardListener.keysEmitted(label);
	}
	
	public void setKeyboardListener(KeyboardListener keyboardListener){
		this.keyboardListener = keyboardListener;
	}
}
