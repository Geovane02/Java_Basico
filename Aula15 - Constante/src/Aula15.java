
public class Aula15 {

	public static void main(String[] args) {
		
		/*
		 * 1)Os Dados das constantes nunca poderão ser alterados
		 * 2) Uma Constante tem o endereço Protegido
		 * Uma Constante nunca será desacoplada
		 * Declaramos uma vez, e podemos utilizar várias vezes
		 * 
		 *
		 */
		
		
		
					int val=10;
		final int Constante =10;
		
		val = 1001;
		//Constante = 40;
		
		System.out.println(val);
		System.out.println(Constante);
	}
}
