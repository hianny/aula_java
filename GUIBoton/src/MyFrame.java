import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	
	MyFrame(){
		ImageIcon icon = new ImageIcon("C:\\Users\\hianny.urt\\eclipse-workspace\\GUIColor\\src\\eu.jpg");
		
		button = new JButton();
		button.setBounds(200,100,100,50);
		button.addActionListener(this);
		button.setText("um botao");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("poo");
		}
	}
}
