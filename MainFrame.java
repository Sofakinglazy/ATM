package atm;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	private InfoPanel info;
	private KeyboardPanel keyboard;
	
	public MainFrame(){
		super("Saintsbury Bank");
		info = new InfoPanel();
		keyboard = new KeyboardPanel();
		
		keyboard.setKeyboardListener(new KeyboardListener() {
			public void keysEmitted(String keyLabel){
				info.showText(keyLabel);
			}
		});
		
		setLayout(new BorderLayout());
		add(keyboard, BorderLayout.SOUTH);
		add(info, BorderLayout.NORTH);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
