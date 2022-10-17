package lista01;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Escrava seu nome e em seguida idade");
		String nome = x.nextLine();
		String idadeLida = x.nextLine();

		Integer idade = Integer.valueOf(idadeLida);
		
		System.out.println(nome + " tem " + idade + " anos");
		
	}
}
