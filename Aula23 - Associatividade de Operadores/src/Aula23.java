
public class Aula23 {

	public static void main(String[] args) {
		//A precedência é a ordem na qual o interpretador irá resolver nossas expressões 
		//matemáticas. Ou seja, nós temos que uma expressão matemática será resolvida da 
		//esquerda para a direita de cima para baixo.
		
		
		/*
		 * Da direita para esquerda
	        * 1) ()
	        * 2) *, /, %
	        * 3) +, -
	        * <, <=, >, >=
	        * ==, !=
	        * 
	        * 
	        * De Esquerda Para Direita = (Atribuição)
	        * */
		
		
		
		
		int x, y, z;
        x = y = z = 5;
        
	int a = (x + y) + z;
	System.out.println("O valor é "+ a);
	
	
	
	
	
	}
}
