package entrega_4;

import java.util.Scanner;

public class Modulo4_laboratorio3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String oracion;
		char caracterMasRepetido = 'a';
		int maximaRepeticion = 0;
		
		do {
			System.out.println("Indique la oracion a evaluar (no puede estar vacia): ");
			oracion = scanner.nextLine().toLowerCase();
		} while (oracion.isEmpty());
		
		oracion = oracion.replaceAll(" ", "");
		
		
		int[] repeticionCaracter = new int[256];
		
		for (int i = 0; i < oracion.length(); i++) {
			char caracter = oracion.charAt(i);
			repeticionCaracter[caracter]++;
			
			if (repeticionCaracter[caracter]>maximaRepeticion) {
				maximaRepeticion = repeticionCaracter[caracter];
				caracterMasRepetido = caracter;
			}
		}
		
		System.out.println("El caracter [" + caracterMasRepetido + "] se repite " + maximaRepeticion + " veces.");
		
		
	}

}
