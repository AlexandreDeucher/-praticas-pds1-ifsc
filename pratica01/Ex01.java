package pratica01;

/**
 * 
 * @author Alexandre deucher
 * @date 30/09/2022
 * @version 1.0
 *
 */

public class Ex01 {

	public static void main(String[] args) {
		

	}
	/**
	 * usa um vetor que multiplica todos os elementos do vetor
	 * 
	 */
	
	public Double[] vetx(Double[]vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] *= vet[i];
		}
		return vet;
	}
}

