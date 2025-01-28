import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton hamburgButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgIcon;
	ImageIcon hotdogIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\Screenshots\\Captura de tela 2024-11-27 084458.png");
		hamburgIcon = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\Screenshots\\Captura de tela 2024-11-27 084458.png");
		hotdogIcon = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\Screenshots\\Captura de tela 2024-11-27 084458.png");
		
		pizzaButton = new JRadioButton("eu");
		hamburgButton = new JRadioButton("quero");
		hotdogButton = new JRadioButton("vazar");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgButton.setIcon(hamburgIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("vc quer comer pizza");
		}
		else if(e.getSource()==hamburgButton) {
			System.out.println("vc quer comer amburg");
		}
		else if(e.getSource() ==hotdogButton) {
			System.out.println("vc quer comer hotdogao");
		}
	}
	
}
