import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	//JTextField textField;
	JCheckBox checkBox;
	ImageIcon Icon;
	ImageIcon Check;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Icon = new ImageIcon("C:\\\\Users\\\\hianny.urt\\\\eclipse-workspace\\\\GUIAvanced\\\\src\\\\eu.jpg");
		Check = new ImageIcon("C:\\Users\\hianny.urt\\Pictures\\drive.jpg");
		
		button = new JButton("dirija");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("eu drivo");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,20));
		checkBox.setIcon(Check);
		checkBox.setSelectedIcon(Icon);
		
		/*textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,20));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("username");
		textField.setEditable(false); */
		
		this.add(button);
		//this.add(textField);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			//System.out.println("welcome "+ textField.getText());
			System.out.println("eu drivo");
		}
		else {
			System.out.println("eu nao drivo");
		}
	}
}