import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key extends JFrame implements KeyListener{
	JLabel label;
	ImageIcon icon;
	Key(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\kwid.jpg");
		
		Image resizedImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Cria um novo ImageIcon com a imagem redimensionada
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		//label.setBackground(Color.red);
		//label.setIcon(icon);
		label.setIcon(resizedIcon);
		//label.setOpaque(true);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10,label.getY());
			break;
		case 'w': label.setLocation(label.getX(),label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(),label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10,label.getY());
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("voce apertou a key char "+ e.getKeyChar());
		System.out.println("voce apertou a key code "+ e.getKeyCode());
	}
}
