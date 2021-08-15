package arrayList;
import java.util.ArrayList;
public class ArrayList {
	public static void main(String[] args) {
		ArrayList<String> nome=new ArrayList<String>(); //Não aceita variaveis dos tipos primitivos
		nome.add("Carlos"); //adicionando os nomes
		nome.add("Maria");
		
		//removendo os dados
		nome.remove("Carlos");
		nome.clear();//remove todas as posições
		
		
		
		
		//acessando cada posição do array
		System.out.println(nome.get(0));//get(0) acessando através da posição
		System.out.println(nome.isEmpty); //mostra se as listas estão cheias ou vazias
		System.out.println(nome.contains("Maria"));//Pesquisa se existe esta pessoa no arraylist
		System.out.println(nome.size());//retorna a quantidade de conteudo
		System.out.println(nome.indexOf("Ana"));//retorna a posição do objeto que foi passado por parametro, caso não encontre ele retorna -1 
	}
}
	
