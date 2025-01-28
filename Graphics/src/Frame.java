import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Frame extends JFrame{
	Panel panel;
	
	Frame(){
		panel = new Panel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
