import java.util.Scanner;

public class Aula36 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String dia;
		
		
		System.out.println("Qual dia da semana predileto");
		System.out.println("Digite 1 para segunta até 7 para Domindo");
		
		int num = in.nextInt();
		
		switch (num) {
		case 1 : dia = "Segunda";
		System.out.println(dia);
		break;
		case 2 : dia = "Terça";
		System.out.println(dia);
		break;
		case 3 : dia = "Quarta";
		System.out.println(dia);
		break;
		case 4 : dia = "Quinta";
		System.out.println(dia);
		break;
		case 5 : dia = "Sexta";
		System.out.println(dia);
		break;
		case 6 : dia = "Sabado";
		System.out.println(dia);
		break;
		case 7 : dia = "Domingo";
		System.out.println(dia);
		break;
		default: dia = "Dia Invalido";
		System.out.println(dia);
		}
		
	}
}
