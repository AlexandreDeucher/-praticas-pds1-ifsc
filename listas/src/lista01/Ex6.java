package lista01;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		Integer min=Integer.MAX_VALUE;
		Integer max=0;
		
		
		
		Integer[] vetor = new Integer[10];
		//Integer vetores = Integer.valueOf(vetores = 0);
		
		for (int i = 0; i < 10; i++) {

			System.out.println("escreva um numero: ");
			vetor[i] = x.nextInt();
			
				if(vetor[i] > max) {
					max = vetor[i];
				}else {
					
				}if(vetor[i]< min) {
					min = vetor[i];
				}
		}
			System.out.println("o maior numero é="+max);
			System.out.println("o menor numero é="+min);

	}

}

