import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectColor extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	SelectColor(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("escolha uma cor");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText("qualquer coisa");
		label.setFont(new Font("MV Boli",Font.PLAIN,50));
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
				
			Color color = JColorChooser.showDialog(null, "escolha uma cor", Color.black);
			
			label.setBackground(color);
			//label.setForeground(color);
		}
		
	}

}
