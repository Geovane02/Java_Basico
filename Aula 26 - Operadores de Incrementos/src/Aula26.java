
public class Aula26 {

	
	public static void main(String[] args) {
		
		//Operedor de Incremento
		System.out.println("---------------OPERADOR DE INCREMENTO-------------");
		int i = 0;
		System.out.println(++i);
		//++i; Operador de pr�-incrementos, ou seja, antes da a��o;
		
		
		
		int y = 0;
		System.out.println(y++);
		//y--; Operador de p�s incremento, ou seja, o valor ser� incrementado depois da excecu��o, aonde a nossa espress�o estiver contida.
		
		
		
		System.out.println("-------------OPERADOR DE DECREMENTO--------------");
		
		int a = 0;
		int b = 0;
		
		System.out.println(--a); //PR� DECREMENTO
		System.out.println(b--); // P�S DECREMENTO
		
		
		System.out.println("-------------------------------------------------");
		
		int u = 0; 
		u = u + 10; //Forma tradicional de trabalhar.
		System.out.println(u);
		u += 10;// Operador de Atribui��o.
		System.out.println(u);
		u++;   //Operador de Incremento. Onde aceita apenas 1 valor
		System.out.println(u);
		
		
		
		
		
		
	}
}
