import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};
		//int[] = {1,2,3};
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//System.out.println(comboBox.GetItemCount());
		//comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
		comboBox.removeItemAt(0);
		
		
		this.add(comboBox);
		this.pack();
		this.setSize(200,150);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(comboBox.getSelectedItem()=="dog") {
			System.out.println("é um cachorro ");
			
		}
	}
	
}
