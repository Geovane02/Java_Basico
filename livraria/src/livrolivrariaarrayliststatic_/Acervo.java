package livrolivrariaarrayliststatic_;

import java.util.ArrayList;

public class Acervo {

	private static  ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	
	
	//metodo GET
	public static ArrayList<LivroLivraria> getListaLivros() {
		return listaLivros;
	}
	
	//adicionar objeto na lista
	static public void adicionar(LivroLivraria l) {
		listaLivros.add(l);
	}
	
	//lista os dados de todos os objetos da lista
	static public String listar () {
		int i=1;
		String saida ="";
		for (LivroLivraria l : listaLivros) {
			saida +="\n ======= LIVRO N° " +(i++)+ "======/N";
			saida += l.imprimir() + "\n";
		}
		return saida;
	}
	
	//pesquisar genero
	static public int pesquisar(String genero) {
		int qtd = 0;
		for(LivroLivraria l : listaLivros) {
			if(l.getGenero().equalsIgnoreCase(genero)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	//pesquisar por faixa de preço
	static public int pesquisar (double vInicial, double vFinal) {
		int qtd = 0;
		
		for (LivroLivraria l : listaLivros) {
			if(l.getPreco() >=vInicial && l.getPreco() <=vFinal) {
				qtd++;
			}
			
		}
		return qtd;
	}
	
	//remove um livro pelo titulo
	
	static public boolean remove (String titulo) {
		for(LivroLivraria l : listaLivros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;
	}
	
	//total do acervo
	static double calcularTotalAcervo() {
		double total = 0;
		for (LivroLivraria l : listaLivros) {
			total += l.getPreco();
		}
		return total;
	}
}
