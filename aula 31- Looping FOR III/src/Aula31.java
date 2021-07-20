
public class Aula31 {

	
	public static void main(String[] args) {
		int i = 0;
		for(; i < 10;) {
			++i;
			System.out.println(i);
			
		}
		System.out.println("-------------------------------");
		for (int a =0, b = 0; a <=10; ++a, --b) {
			System.out.print("("+a);
			System.out.print("_");
			System.out.print(b+")");
		}
	}
}
