
public class Aula50_Atividade2 {
//Calculo de M�dia Aritim�tica
	public static void main(String[] args) {
		
		int [] nuns = new int [5];
		nuns [0] = 9;
		nuns [1] = 10;
		nuns [2] = 5;
		nuns [3] = 6;
		nuns [4] = 7;
		
		int media = 0;
		for (int i = 0; i <nuns.length; i++) { // metodo length = serve para tetornar valores que est�o no arrei, se foce no formato parametro, n�o saberiamos quantos valores teriam, esse comando serve para atribuir todos os valores
			media += nuns [i];
			
			
			
			
		}
		float total = (float)media / nuns.length; // convertendo valores inteiros para floant durante a divis�o; Floante s�o valores com virgulas
		System.out.println("A m�dia desses valores s�o: "+total);
	}
	
	
}
