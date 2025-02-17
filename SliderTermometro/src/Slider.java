import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	Slider(){
		frame = new JFrame("slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		label.setFont(new Font("MV Boli",Font.PLAIN,15));
		
		slider.setOrientation(SwingConstants.VERTICAL);
		//faz a variacao de temperetura no texto 
		label.setText("ºC = "+ slider.getValue());
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("ºC = "+ slider.getValue());
		
	}

}
