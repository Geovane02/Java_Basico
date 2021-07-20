
public class Aula39 {
	public static void main(String[] args) {
		
		label1:{
			System.out.println("Label 1 ini");
			label2 : {
				System.out.println("Label 2 ini");
				label3 : {
				System.out.println("Label 3 ini");
				
				if(true)
					break label2;
				
				}
				System.out.println("Label 2 fim");
			}
			System.out.println("Label 1 fim");
			
		}
	}
}
