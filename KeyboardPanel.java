package atm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class KeyboardPanel extends JPanel{
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton cancel;
	private JButton zero;
	private JButton enter;
	
	public KeyboardPanel(){
		initComponents();
		
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(border);
		
		layoutComponents();
	}

	private void initComponents() {
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		cancel = new JButton("Cancel");
		zero = new JButton("0");
		enter = new JButton("Enter");
	}
	
	private void layoutComponents() {
		setLayout(new GridBagLayout());
		
		GridBagConstraints gd = new GridBagConstraints();
		
		//////////////First Row///////////////////
		gd.gridx = 0;
		gd.gridy = 0;
		gd.weightx = 1;
		gd.weighty = 1;
		add(one, gd);
		
		gd.gridx = 1;
		gd.gridy = 0;
		gd.weightx = 1;
		gd.weighty = 1;
		add(two, gd);
		
		gd.gridx = 2;
		gd.gridy = 0;
		gd.weightx = 1;
		gd.weighty = 1;
		add(three, gd);
		
		//////////////Second Row///////////////////
		gd.gridx = 0;
		gd.gridy = 1;
		gd.weightx = 1;
		gd.weighty = 1;
		add(four, gd);
		
		gd.gridx = 1;
		gd.gridy = 1;
		gd.weightx = 1;
		gd.weighty = 1;
		add(five, gd);
		
		gd.gridx = 2;
		gd.gridy = 1;
		gd.weightx = 1;
		gd.weighty = 1;
		add(six, gd);
		
		//////////////Third Row///////////////////
		gd.gridx = 0;
		gd.gridy = 2;
		gd.weightx = 1;
		gd.weighty = 1;
		add(seven, gd);
		
		gd.gridx = 1;
		gd.gridy = 2;
		gd.weightx = 1;
		gd.weighty = 1;
		add(eight, gd);
		
		gd.gridx = 2;
		gd.gridy = 2;
		gd.weightx = 1;
		gd.weighty = 1;
		add(nine, gd);
		
		//////////////Fourth Row///////////////////
		gd.gridx = 0;
		gd.gridy = 3;
		gd.weightx = 1;
		gd.weighty = 1;
		add(cancel, gd);
		
		gd.gridx = 1;
		gd.gridy = 3;
		gd.weightx = 1;
		gd.weighty = 1;
		add(zero, gd);
		
		gd.gridx = 2;
		gd.gridy = 3;
		gd.weightx = 1;
		gd.weighty = 1;
		add(enter, gd);
	}
}
