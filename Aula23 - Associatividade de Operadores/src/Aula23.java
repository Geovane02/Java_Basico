
public class Aula23 {

	public static void main(String[] args) {
		//A preced�ncia � a ordem na qual o interpretador ir� resolver nossas express�es 
		//matem�ticas. Ou seja, n�s temos que uma express�o matem�tica ser� resolvida da 
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
	        * De Esquerda Para Direita = (Atribui��o)
	        * */
		
		
		
		
		int x, y, z;
        x = y = z = 5;
        
	int a = (x + y) + z;
	System.out.println("O valor � "+ a);
	
	
	
	
	
	}
}
