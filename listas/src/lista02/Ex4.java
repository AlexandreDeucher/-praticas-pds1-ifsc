package lista02;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String n=JOptionPane.showInputDialog("Digite um numero");
			
			Integer n1=Integer.valueOf(n);
			JOptionPane.showMessageDialog(null, n1);
		}
	}
}
