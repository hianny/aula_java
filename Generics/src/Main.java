
public class Main {
	public static void main(String[] args) {
		new OtherClass();
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
		Character[] charArray = {'H','E','L','L','O'}; 
		String[] stringArray = {"B","Y","E"};
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
	}
	private static <Thing> void displayArray(Thing[] array) {
		// TODO Auto-generated method stub
		for(Thing x : array) {
			System.out.print(x+"");
		}
		System.out.println();
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
	
	/*public void displayArray(Integer[] array) {
		 for(Integer x : array) {
			 System.out.println(x+" ");
		 }
		 System.out.println();
	}*/
	//public static void displayA
}
