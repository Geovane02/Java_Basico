
//package com.excript.aula17;
import java.util.Scanner;


public class Aula17 {
	public static void main(String[] args) {
		//Introdu��o a opera��o l�gico;
		 Scanner in = new Scanner(System.in);
		 
		 final int idadeJovem, idadeIdoso;
		 idadeJovem = 17;
		idadeIdoso = 60;
		
		
		System.out.println("Digite a sua idade?");
		int idade= in.nextInt();
		
		if(idade<=17) {
			System.out.println("Voc� � Jovem");
		}else {
			if(idade >= 60) {
				System.out.println("Voc� � Idoso");
			}else {
				if((idade > 17)&&(idade < 60)) {
					System.out.println("Voc� � uma pessoa de meia idade");
				}
			}
		}
				 
				 
	}
}
