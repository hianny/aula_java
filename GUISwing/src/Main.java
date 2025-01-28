import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//int resposta = JOptionPane.showConfirmDialog(null, "vc coda","esse é meu codigo",JOptionPane.YES_NO_CANCEL_OPTION);
		//String name = JOptionPane.showInputDialog("qual seu nome? ");
		
		String[] responses = {"No,  you're awesome","valeu","tar"};
		ImageIcon icon = new ImageIcon("C:\\Users\\hianny.urt\\eclipse-workspace\\GUIAvanced\\src\\eu.jpg");
		JOptionPane.showOptionDialog(null,
				"legal",
				"secreto",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses,
				0); 
	}
}
