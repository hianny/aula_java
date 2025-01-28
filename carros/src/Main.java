
public class Main {
	public static void main(String[] args) {
		Car car = new Car("chevrolet","camaro",2021);
		
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}
}
