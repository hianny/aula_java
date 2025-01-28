import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

// como funciona a classe scanner
//  public static void main(String[] args) {
//    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//    System.out.println("Enter username");

 //   String userName = myObj.nextLine();  // Read user input
 //   System.out.println("Username is: " + userName);  // Output user input
 // }
//}

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		File file = new File("Level_Up.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		response = response.toUpperCase();
		while(!response.equals("Q")){
			System.out.println("P = play, S = stop, R = reset, Q = quit");
			System.out.println("enter your choice: ");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case("p"): clip.start();
				break;
				case("s"): clip.stop();
				break;
				case("r"): clip.setMicrosecondPosition(0);
				break;
				case("q"): clip.close();
				break;
				default: System.out.println("not a valide response");
			}
		}
		System.out.println("bye");
	}
}
