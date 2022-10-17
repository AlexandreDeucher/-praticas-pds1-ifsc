package lista02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			list.add(JOptionPane.showInputDialog("escreva alguma coisa: "));
		}
		JOptionPane.showMessageDialog(null, list);
	}

}
