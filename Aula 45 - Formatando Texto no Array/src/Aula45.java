
public class Aula45 {
public static void main(String[] args) {
		
		int [] array; //declaração do array
		array = new int [10]; //cria e reserva o espaço para o nosso array
		
		System.out.printf("%s%10s\n"," _______","________ ");
		System.out.printf("%s%10s\n","|INDICE ","| VALORES|");
		System.out.printf("%s%10s\n","|-------","|--------|");
		for (int i = 0; i <=9; i++) {
			
			System.out.printf("%5d%7d\n", i , array [i]);
			
		}
		System.out.printf("%s%10s\n","|-------","|--------|");
}
}
