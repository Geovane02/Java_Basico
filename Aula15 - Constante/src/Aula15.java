
public class Aula15 {

	public static void main(String[] args) {
		
		/*
		 * 1)Os Dados das constantes nunca poder�o ser alterados
		 * 2) Uma Constante tem o endere�o Protegido
		 * Uma Constante nunca ser� desacoplada
		 * Declaramos uma vez, e podemos utilizar v�rias vezes
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
