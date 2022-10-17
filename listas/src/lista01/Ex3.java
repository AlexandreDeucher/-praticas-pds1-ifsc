package lista01;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		String numero = x.nextLine();
		Integer numeros = Integer.valueOf(numero);
		if (numeros % 2 == 0) {
			System.out.println(numeros + " e par");
		} else {
			System.out.println(numeros + " e impar");
		}
	}
}
