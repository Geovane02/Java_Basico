
public class Aula38_2 {

	
	public static void main(String[] args) {
		
		labelForI : for (int i =0; i<10; i++) {
			
		for (int j = 0; j < 10; j++) {
		System.out.println("O valor de I é "+i+" De J é "+j);
		if (j == 9 && i ==3)
			break labelForI;
			}
		}
	}
}
