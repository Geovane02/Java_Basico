package livrolivrariaarrayliststatic_;

import java.util.Scanner;

public class AppLivroLivraria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner (System.in);
		
		int menu;
		double vInicial, vFinal;
		LivroLivraria objLivro;
		
		String titulo, autor, genero;
		float preco;
		int isbn;
		
		do {
			exibirMenu();
			menu = entrada.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("======> CADASTRAR LIVRO ");
				System.out.println("Digite o titulo : ");
				titulo = entradaString.nextLine();
				System.out.println("Digite o autor : ");
				autor = entradaString.nextLine();
				System.out.println("Digite o genero : ");
				genero = entradaString.nextLine();
				System.out.println("Digite o ISBN: ");
				isbn = entradaString.nextInt();
				System.out.println("Digite o preço : ");
				preco = entrada.nextFloat();
				
				objLivro = new LivroLivraria(titulo, autor, isbn, genero, preco);
				Acervo.adicionar(objLivro);
				break;
			case 2 : 
				System.out.println("======> LISTAGEM DE LIVRO ");
				System.out.println(Acervo.listar());
				break;
			case 3 : 
				System.out.println("=====> EXCLUSAO DE LIVRO");
				System.out.println("Digite o titulo do livro");
				titulo = entradaString.nextLine();
				if (! (Acervo.getListaLivros().isEmpty())) {
					if(Acervo.remove(titulo)) {
						System.out.println("Livro removido com sucesso");
					}else {
						System.out.println("Titulo não encontrado");
					}
				}else {
					System.out.println("Não tem livro no acervo");
				}
				break;
			case 4 :
				System.out.println("=====> PESQUISAR PELO GENERO");
				System.out.println("Digite o genêro: ");
				genero = entradaString.nextLine();
				System.out.println("Existem "+Acervo.pesquisar(genero) + " livro(s) do genero "+genero);
				break;
			case 5 :
				System.out.println("=====> PESQUISAR POR FAIXA DE PREÇO");
				System.out.println("Digite a faixa inicial e final");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				System.out.println("Existem "+ Acervo.pesquisar(vInicial, vFinal)+ "Livro com preço entre "+String.format("R$ %.2f \n", vInicial, vFinal));
				break;
			case 6 :
				System.out.println("=====> TOTAL DE R$ de livros");
				System.out.println("O total é de "+String.format("R$ %.2f \n",Acervo.calcularTotalAcervo()));
				break;
			case 7 :
				System.out.println("Saindo do programa");
				break;
				default :
					System.out.println("Opção Invalido");
			}
		}while(menu != 7);
	}

	static void exibirMenu() {
		System.out.println("====== LIVRO LIVRARIA ======");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXCLUIR LIVRO");
		System.out.println("4 - PESQUISAR POR GENERO");
		System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
		System.out.println("6 - CALCULAR POR TOTAL DE ACERVO");
		System.out.println("7 - SAIR");
		System.out.println("");
		System.out.println("=====> ESCOLHA UMA DAS OPÇÕES");
	}
}
