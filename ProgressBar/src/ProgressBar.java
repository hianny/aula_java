import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBar(){
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,20));
		bar.setForeground(Color.red);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	public void fill() {
		int counter =0;
		
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			}catch(InterruptedException e ){
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("done :)");
		//bar.setValue(20);
	}
}
