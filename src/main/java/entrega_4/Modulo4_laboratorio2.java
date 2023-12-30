package entrega_4;

import java.util.Scanner;

public class Modulo4_laboratorio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Para culminar escriba 0 de lo contrario escriba cualquier numero: ");
		int numero = scanner.nextInt();
		
		
		int sumaTotal = numero;
		int numeroMayor = numero;
		int numeroMenor = numero;
		
		if (numero != 0) {
			
			do {
				System.out.println("Para culminar escriba 0 de lo contrario escriba cualquier numero: ");
				numero = scanner.nextInt();				
				sumaTotal += numero;
				
				if (numero > numeroMayor) {
					numeroMayor = numero;
				}
				if (numero < numeroMenor) {
					numeroMenor = numero;
				}
			
			} while (numero != 0);
			}
		
		System.out.println("La suma total es: " + sumaTotal);
		System.out.println("El numero mayor es: " + numeroMayor);
		System.out.println("El numero menor es: " + numeroMenor);

		
	}

}
