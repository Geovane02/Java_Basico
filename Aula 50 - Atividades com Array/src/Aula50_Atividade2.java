
public class Aula50_Atividade2 {
//Calculo de Média Aritimética
	public static void main(String[] args) {
		
		int [] nuns = new int [5];
		nuns [0] = 9;
		nuns [1] = 10;
		nuns [2] = 5;
		nuns [3] = 6;
		nuns [4] = 7;
		
		int media = 0;
		for (int i = 0; i <nuns.length; i++) { // metodo length = serve para tetornar valores que estão no arrei, se foce no formato parametro, não saberiamos quantos valores teriam, esse comando serve para atribuir todos os valores
			media += nuns [i];
			
			
			
			
		}
		float total = (float)media / nuns.length; // convertendo valores inteiros para floant durante a divisão; Floante são valores com virgulas
		System.out.println("A média desses valores são: "+total);
	}
	
	
}
