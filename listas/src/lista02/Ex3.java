package lista02;

import javax.swing.JOptionPane;

public class Ex3 {
	public static void main(String[] args) {
		String precoLitro=JOptionPane.showInputDialog("escreva o preço do litro: ");
		
		String quantidadeLitros=JOptionPane.showInputDialog("escreva a quantidade de litros gastos: ");
		
		Double litro=Double.valueOf(precoLitro);
		
		Integer qtdLitro=Integer.valueOf(quantidadeLitros);
		
		JOptionPane.showMessageDialog(null,"preço total: "+litro*qtdLitro);

	}
}
