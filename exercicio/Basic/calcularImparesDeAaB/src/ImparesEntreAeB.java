import java.util.Scanner;

public class ImparesEntreAeB {

	
	public static void main(String[] args) {
		int valorA;
		int valorB;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		
		valorA = input.nextInt();
		
		System.out.println("Digite o valor de B:");
		
		valorB = input.nextInt();
		
		System.out.println("Numeros entre " + valorA + " E " + valorB);
		
		calcularNumerosImpares(valorA, valorB);
		
		input.close();
		
	}
	
	
	public static void calcularNumerosImpares(int valorA, int valorB) {
		for(int i = valorA; i <= valorB; i++) {
			if(i % 2 == 1) {
				System.out.println("Valores entre impares: " + i );
			}
			
		}
	}
}
