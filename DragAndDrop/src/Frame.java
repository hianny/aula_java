import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements MouseListener{
	JLabel label;
	
	ImageIcon smile;
	ImageIcon pain;
	ImageIcon nervs;
	ImageIcon dizzy;
	
	Frame(){
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.addMouseListener(this);
		
		smile = new ImageIcon("caminho para png");
		pain = new ImageIcon("caminho para png");
		nervs = new ImageIcon("caminho para png");
		dizzy = new ImageIcon("caminho para png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(smile);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(dizzy);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(pain);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(nervs);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(smile);
		
	}
	

}
