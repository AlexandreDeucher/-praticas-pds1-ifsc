package lista02;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main(String[] args) {
		Integer max = 0;
		Integer min = Integer.MAX_VALUE;
		Integer vet[] = new Integer[10];
		for (int i = 0; i < 10; i++) {

			String n = JOptionPane.showInputDialog("digite um numero");

			Integer numero = Integer.valueOf(n);

			vet[i] = numero;
			if (numero > max) {
				max=vet[i];
			}
			if (vet[i] < min) {
				min=vet[i];
			}

		}
		JOptionPane.showMessageDialog(null, "maior numero é: " + max + " menor numero é: " + min);
	}

}
