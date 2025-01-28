import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double F,K ;
		
		System.out.print("quantos graus esta na sua cidade: ");
		double C = scanner.nextDouble();
		
		F = C * 1.8 + 32;
        K = C + 273.15;
        
		System.out.println("Você digitou: " + C + " Graus!");
        System.out.println("a temperatura em Fahrenheit é "+F);
        System.out.println("a temperatura em Kelvin é "+K);
	}

}
