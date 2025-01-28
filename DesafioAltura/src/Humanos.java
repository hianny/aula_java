import java.util.Scanner;

public class Humanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sexo, qtdMulheres = 0, qtdHomens=0;
		float altura, somaH = 0, mediaHomens, maior = 0,menor = 0;
		
		for(int i=0;i<10;i++){
			System.out.println("1-Mulheres | 2-Homens ");
			System.out.println("qual vai ser o genero? ");
			sexo = scanner.nextInt();
			System.out.println("qual a altura: ");
			altura = scanner.nextFloat();
			if(sexo==1) {
				qtdMulheres++;
			}
			else if(sexo==2){
				qtdHomens++;
				somaH = somaH + altura;			
			}
			else {
				System.out.println("opção invalida");
			}
			if(altura>maior) {
				maior = altura;
			}else if(altura<menor) {
				menor = altura;
			}
			 mediaHomens = somaH / qtdHomens;
		        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
		        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
		        System.out.println("O número de mulheres é " + qtdMulheres);
			}
		scanner.close();
		
	}

}
