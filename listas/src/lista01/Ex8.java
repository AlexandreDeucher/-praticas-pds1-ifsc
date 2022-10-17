package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();

		System.out.println("Elementos da lista ");

		for (int i = 0; i < 10; i++) {
			list.add(x.nextLine());
		}

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("tamanho da lista:" + list.size());
		System.out.println("Ultimo elemento:" + list.get(list.size() - 1));

	}

}


