package lista02;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		String nome=JOptionPane.showInputDialog("Escreva um nome");
		
		String idade=JOptionPane.showInputDialog("Escreva sua idade");
		Integer id=Integer.valueOf(idade);
		JOptionPane.showMessageDialog(null, nome + " tem " + id + " anos");

	}
}
