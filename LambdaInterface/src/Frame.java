import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	JButton button = new JButton("botao1");
	JButton button2 = new JButton("botao2");
	
	
	Frame(){
		button.setBounds(100,100,200,100);
		button.addActionListener(
			(e) -> System.out.println("this is the first button")	
		);
		button2.setBounds(100,200,200,100);
		button2.addActionListener(
			(e) -> System.out.println("this is the second button")	
		);
			
		this.add(button);
		this.add(button2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}
}
