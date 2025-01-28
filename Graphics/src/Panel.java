import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class Panel extends JPanel{
	
	Image image;
	Panel(){
		image = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\kwid.jpg").getImage();
		
		this.setPreferredSize(new Dimension(500,500));
	}
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		//imagem jpg
		g2D.drawImage(image,100 ,0,null);
		
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0,0,500,500);
			
		
		//quadrado
		//g2D.setPaint(Color.pink);
		//g2D.fillRect(0,0,100,200);
		
		//g2D.setPaint(Color.red);
		//g2D.drawOval(0,0,100,100);
		
		//pokebola
		//g2D.setPaint(Color.red);
		//g2D.drawArc(0, 0, 100, 100, 0, 180);
		//g2D.fillArc(0, 0, 100, 100, 0, 180);
		//g2D.setPaint(Color.white);
		//g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		
		//triangulo amarelo
		//int[] xPoints = {150,250,350};
		//int[] yPoints = {300,150,300};
		//g2D.setPaint(Color.yellow);
		//g2D.drawPolygon(xPoints,yPoints,3);
		//g2D.fillPolygon(xPoints,yPoints,3);
		
		//escrever frase
		//g2D.setFont(new Font("Ink Free",Font.BOLD,50));
		//g2D.drawString("vc é um vencendor :D", 50, 50);
		
	}
}
