import javax.swing.JFrame;

public class MyFrame  extends JFrame{
	
	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		
		this.setTitle("demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(dragPanel);
		this.setVisible(true);
		
	}
}
