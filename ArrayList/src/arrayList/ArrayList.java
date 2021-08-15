package arrayList;
import java.util.ArrayList;
public class ArrayList {
	public static void main(String[] args) {
		ArrayList<String> nome=new ArrayList<String>(); //N�o aceita variaveis dos tipos primitivos
		nome.add("Carlos"); //adicionando os nomes
		nome.add("Maria");
		
		//removendo os dados
		nome.remove("Carlos");
		nome.clear();//remove todas as posi��es
		
		
		
		
		//acessando cada posi��o do array
		System.out.println(nome.get(0));//get(0) acessando atrav�s da posi��o
		System.out.println(nome.isEmpty); //mostra se as listas est�o cheias ou vazias
		System.out.println(nome.contains("Maria"));//Pesquisa se existe esta pessoa no arraylist
		System.out.println(nome.size());//retorna a quantidade de conteudo
		System.out.println(nome.indexOf("Ana"));//retorna a posi��o do objeto que foi passado por parametro, caso n�o encontre ele retorna -1 
	}
}
	
