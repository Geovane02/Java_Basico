import java.util.Random;

public class Aula34 {
	public static void main(String[] args) {
		Random num = new Random();
		System.out.println(num.nextInt());
		System.out.println(num.nextInt(6));//intervalo de 0 a 5;
		
		
		
		//Inserir vários numeros aleatórios.
		for(int i = 0; i < 20; i++) { 
			//System.out.println(num.nextInt(6)+1); // executar com numero inteiro
			//System.out.println(num.nextDouble());//Executa com numero com virgula.
			//System.out.println(num.nextDouble()*50);//Gerar numero aleatorio com ponto flutuante até 50.
			//System.out.println(num.nextDouble()*50+20);//Obter numero entre o intervalo de 20 até 50.
			System.out.println(num.nextBoolean());//Executar numeros verdadeiros e falsos
		
		}
		
		
	}

}
