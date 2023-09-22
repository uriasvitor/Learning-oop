import java.util.Scanner;

public class CalculaMedia {
	
	public static void main(String[] args) {
		int quantidadeDeNumeros;
		int soma = 0;
		
		System.out.println("****************Iniciando ************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce deseja inserir");
		quantidadeDeNumeros = scanner.nextInt();
		
		while(quantidadeDeNumeros <= 0) {
			System.out.println("Quantidade de numeros deve ser maior ou igual a 1");
			System.out.println("Novamente, Quantos numeros voce deseja inserir");
			quantidadeDeNumeros = scanner.nextInt();
			
		}
		
		int[] numeros = new int[quantidadeDeNumeros];
		
		for(int i = 0; i < quantidadeDeNumeros; i++) {
			System.out.println("Digite o numero # "+ i + " " );
			numeros[i] = scanner.nextInt();
		}
		
		for(int numero: numeros) {
			soma+= numero;
		}
		
		double media = (double) soma / quantidadeDeNumeros;
        
        System.out.println("A media dos numeros e: " + media);
        
        scanner.close();
        
		
	}

}
