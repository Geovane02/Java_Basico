
public class Aula26 {

	
	public static void main(String[] args) {
		
		//Operedor de Incremento
		System.out.println("---------------OPERADOR DE INCREMENTO-------------");
		int i = 0;
		System.out.println(++i);
		//++i; Operador de pré-incrementos, ou seja, antes da ação;
		
		
		
		int y = 0;
		System.out.println(y++);
		//y--; Operador de pós incremento, ou seja, o valor será incrementado depois da excecução, aonde a nossa espressão estiver contida.
		
		
		
		System.out.println("-------------OPERADOR DE DECREMENTO--------------");
		
		int a = 0;
		int b = 0;
		
		System.out.println(--a); //PRÉ DECREMENTO
		System.out.println(b--); // PÓS DECREMENTO
		
		
		System.out.println("-------------------------------------------------");
		
		int u = 0; 
		u = u + 10; //Forma tradicional de trabalhar.
		System.out.println(u);
		u += 10;// Operador de Atribuição.
		System.out.println(u);
		u++;   //Operador de Incremento. Onde aceita apenas 1 valor
		System.out.println(u);
		
		
		
		
		
		
	}
}
