import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Timer timer;
	Image enemy;
	Image backgroundImage;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	Panel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		backgroundImage = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\drive.jpg").getImage();
		enemy = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\Screenshots\\enemy.png").getImage();
		timer = new Timer(10, this);
		timer.start();
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage,0,0,null);
		g2D.drawImage(enemy,x,y,null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity; 
		
		if(y>=PANEL_HEIGHT-enemy.getWidth(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		
		repaint();
		//y = y + yVelocity; 
		
	}	
}