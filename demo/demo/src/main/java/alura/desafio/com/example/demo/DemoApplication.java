package alura.desafio.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.gson.Gson;
import alura.desafio.com.example.demo.modelo.ListadadosAutores;
import alura.desafio.com.example.demo.modelo.Listadados;
import alura.desafio.com.example.demo.modelo.Modelo;

import java.util.*;


@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		Scanner leitura = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("\n\n");
			System.out.println(
					        "1-Buscar livro pelo título\n" +
							"2-Listar livros registrados\n" +
							"3-Listar autores registrados\n" +
							"4-Listar autores vivos em um determinado ano\n" +
							"5-Listar livros em um deteminado idioma\n" +
							"6-Sobre o livro\n"	+
							"0-sair");


			opcao = leitura.nextInt();

			switch (opcao) {
				case 1:
					record Livro(String titulo,String autor,int ano){}

					System.out.println("\n------Título------\n");
					String jsonlivro = "{\"titulo\":\"Dom Casmurro\",\"autor\":\"Machado de Assis\",\"ano\":\"1899\" }";
					Gson gsonP = new Gson();
					Livro livro = gsonP.fromJson(jsonlivro, Livro.class);
					System.out.println(livro);



					break;

				case 2:
					System.out.println("\n------Livros Registrados-----\n");

					ArrayList<Listadados> lista = new ArrayList<>();

					System.out.println("\n\n");

					lista.add(new Listadados("Dom Casmurro"));


					Collections.sort(lista);

					for (Listadados listadadosLivro : lista) {
						System.out.println(listadadosLivro.dadolivro);


					}

					break;

				case 3:
					System.out.println("\n------Autores Registrados------\n");


					ArrayList<ListadadosAutores> listaautores = new ArrayList<>();

					System.out.println("\n\n");

					listaautores.add(new ListadadosAutores("Machado de Assis"));


					Collections.sort(listaautores);

					for (ListadadosAutores listadadosautores : 	listaautores) {
						System.out.println(listadadosautores.dadoautores);

					}
					break;

				case 4:
					System.out.println("\n------ Autores Vivos------\n");

					System.out.println("Informe o ano");
					int anoAutor=leitura.nextInt();
					System.out.println("\n");

                    if(anoAutor==1890){

						String mensagem="Autor Machado de Assis estava  vivo";

						System.out.println(mensagem);

					}else{

						System.out.println("Não encontrado!");
					}
					break;

				case 5:
					System.out.println("\n------Idiomas de Livros------\n");

						String idiomadoLivro="Português-Brasileiro";

						System.out.println(idiomadoLivro);

					break;

                case 6:

                    System.out.println("\n------Sobre o Livro------\n");

                    Modelo dado=new Modelo();

					dado.setSobre("O romance é narrado pelo próprio Bento Santiago, conhecido como Bentinho. Ele é um homem por volta dos seus 60 anos e que está disposto a contar sua história de amor por sua vizinha: Capitu. A trama tem como local a cidade do Rio de Janeiro durante o período do Segundo Império.");

					System.out.println(dado.getSobre());


					break;

				case 0:

					System.out.println("\n------Sair------\n");

				default:

			}
		}


	}
}








