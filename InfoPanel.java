package atm;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class InfoPanel extends JPanel{
	private JTextArea info;
	
	public InfoPanel(){
		info = new JTextArea();
		info.setEditable(false);
		
		setPreferredSize(new Dimension(240, 200));
		
		Border raisedEtched = BorderFactory.createBevelBorder(EtchedBorder.RAISED);
		Border loweredEtched = BorderFactory.createBevelBorder(EtchedBorder.LOWERED);
		Border inside = BorderFactory.createCompoundBorder(raisedEtched, loweredEtched);
		Border outside = BorderFactory.createEmptyBorder(5, 10, 5, 10);
		setBorder(BorderFactory.createCompoundBorder(outside, inside));
		
		setLayout(new BorderLayout());
		add(info, BorderLayout.CENTER);
	}
	
	public void showText(String text){
		if (text.equalsIgnoreCase("Clear")){
			info.setText("");
		} else if (text.equalsIgnoreCase("Enter")){
			info.append("\n");
		} else {
			info.append(text);
		}
	}
}
