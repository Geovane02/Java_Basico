import java.util.Scanner;

public class Aula28 {

	public static void main(String[] args) {
		
		
		
		
		Scanner in = new Scanner (System.in);
		int x = 0;
		double num1, num2, resultado;
		num1 = num2 = resultado = 0;
		do {
		
	
		
		
		System.out.println("Digite 1 para SOMAR");
		System.out.println("Digite 2 para SUBTRAIR");
		System.out.println("Digite 3 para MULTIPLICAR");
		System.out.println("Digite 4 para DIVIDIR");
		System.out.println("Digite 0 para SAIR");
		System.out.println("");
		System.out.println("Digite o código da operação de deseja realizar?");
		x = in.nextInt();
		
		if (x!=0) { //verefica se o usuario vai sair do programa;
			System.out.println("Digite o primeiro valor:");
			num1 = in.nextDouble();
			System.out.println("Digite o segundo valor:");
			num2 = in.nextDouble();
			
			if (x == 1) {
				resultado = num1 + num2;
			}else {
				if(x == 2) {
					resultado = num1 - num2;
				}else {
					if(x == 3) {
						resultado = num1 * num2;
					}else {
						if(x == 4) {
							resultado = num1 / num2;
						}
					}
				}
				
			}
			System.out.println("o resultado é "+resultado);
			System.out.println("");
			System.out.println("----------------------------------------------------- ");
			System.out.println("");
		}
		
		
		
	}while(x!=0);
	}
	
	
}
