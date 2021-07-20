import java.util.Scanner;

public class Aula35_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("Qual dia da semana predileto");
		System.out.println("Digite 1 para segunta até 7 para Domindo");
		
		int num = in.nextInt();
		
		String dia=(num==1) ? "Segunda":
					(num==2) ? "Terça":
					(num==3) ? "Quarta":
					(num==4) ? "Quinta":
					(num==5) ? "Sexta":
					(num==6) ? "Sabado":
					(num==7) ? "Domingo":
								"Dia Invalido";
System.out.println(dia);
		
	}

}
