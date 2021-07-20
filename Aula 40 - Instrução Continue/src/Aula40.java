
public class Aula40 {

	public static void main(String[] args) {
		
		System.out.println("Numeros pares de 0 até 100");
		
		for(int i = 0; i<100;i++) {
			if(i%2==0) {
				System.out.println("numeros pares "+i);
			}else
				continue;
			
			int a = 0;
			int soma = 0;
			while (a<i) {
				a++;
				soma+=a;
				
			}
			System.out.println("A soma de todas os valores é: "+soma);
				
		}
		
		
	}
	
	
	
}
