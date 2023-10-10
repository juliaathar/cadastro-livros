import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Autor autor = new Autor();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Seja bem-vindo ao nosso sebo!");

        do {
            System.out.println("Escolha uma opção: 1 - Livros / 2 - Autores");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    int opcaoLivro;
                    System.out.println("O que deseja fazer? 1 - Cadastrar livros / 2 - Listar livros");
                    opcaoLivro = scanner.nextInt();

                    switch (opcaoLivro){
                        case 1:
                            livro.cadastrarLivro();
                            break;
                        case 2:
                            livro.listarLivros();
                            break;
                    }

                case 2:
                    int opcaoAutor;
                    System.out.println("O que deseja fazer? 1 - Cadastrar autores / 2 - Listar autores");
                    opcaoAutor = scanner.nextInt();

                    switch (opcaoAutor){
                        case 1:
                            autor.cadastrarAutor();
                            break;
                        case 2:
                            autor.listarAutores();
                            break;
                    }
            }

        }while (opcao != 0);
    }
}