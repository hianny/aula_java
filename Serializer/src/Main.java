import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		user.name = "usuario1";
		user.password = "pizza";
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\hianny.urt\\eclipse-workspace\\Serializer\\UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved");
	}

}
