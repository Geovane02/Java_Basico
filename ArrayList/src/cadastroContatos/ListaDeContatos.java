package cadastroContatos;

import java.util.ArrayList;

public class ListaDeContatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Contato> contatos = new ArrayList();
		Contato contato = new Contato("Marcos", "Marcos@gmail.com", "9 91234509");
		Contato contato1 = new Contato("Ana Betatriz", "ana@gmail.com", "9 88964509");
		Contato contato2 = new Contato("Marcelo", "Marcelo@gmail.com", "9 91000098");
		Contato contato3 = new Contato("Juca", "Juca@hotmail.com", "9 88659087");
		
		//colocando centro da lista
		contatos.add(contato);
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		
		
		for(Contato c : contatos) {
			System.out.println(c);
		}
		
		
	}

}
