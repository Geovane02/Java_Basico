
public class Aula48 {

	public static void main(String[] args) {
		
		
		int [] arrayInt = new int [5];
		arrayInt [0] = 10;
		arrayInt [1] = 20;
		arrayInt [2] = 30;
		arrayInt [3] = 60;
		arrayInt [4] = 90;
		
		int soma = arrayInt [0] + arrayInt [1] + arrayInt [2];
		System.out.println("A noma dos 3 primeiros elementos são: "+soma);
		
		
		int soma2 = 0;
		for (int i = 0; i<5; i++) {
			soma2 +=arrayInt[i];
			
		}
		System.out.println("O resultado da soma de todos elementos: "+soma2);
		
		
	}
	
	
}
