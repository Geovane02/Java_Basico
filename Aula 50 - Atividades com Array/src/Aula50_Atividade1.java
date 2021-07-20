import java.util.Arrays;
import java.util.Scanner;

public class Aula50_Atividade1 {

	//Some todos os números e mostre na tela
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int [] valores = new int [7];
		
		for( int i = 0; i < 7; i++) {
		System.out.printf("Digite o número da posição [%d]: ", i+1);
		valores[i] = in.nextInt();
		
		}
		System.out.println(Arrays.toString(valores)); //metodo toString ele retorna valores separados com virgulas e dentro do cochete 
		
		
		int somaElementos = 0;
		for( int x = 0; x<7;x++) {
			
			somaElementos+=valores[x];
		}
		System.out.printf("O resultado da soma dos elementos eh: %d\n",somaElementos);
		System.out.println("");
		
		//fazendo a multiplicação dos elementos dos arreys pelos valores que o usuario digito.
		for( int x = 0; x<7;x++) {
		int produto = (valores [x] * x);
		System.out.printf("A multiplicação do indice pelo elemento eh: %d * %d = %d\n", valores[x], x, produto);
		}
		
	}
	
	
	
}
