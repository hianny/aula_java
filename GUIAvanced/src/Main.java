import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		//JLabel = gui display para texto/imagem
		ImageIcon image = new ImageIcon("C:\\Users\\hianny.urt\\eclipse-workspace\\GUIAvanced\\src\\eu.jpg");
		Border border = BorderFactory.createLineBorder(Color.green);
		
		JLabel label = new JLabel();
		label.setText("teste de texto");
		label.setIcon(image);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(0);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBound(0,0,0,0) seta as posicoes de pizel que  oq esta dentro do label vai ficar fixo
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);
		frame.pack(); //fica no centro sendo flexivel
	}
}
