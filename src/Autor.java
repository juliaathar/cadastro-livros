import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Autor {
public String nome;
public String localNasc;
Scanner scanner = new Scanner(System.in);
ArrayList<Autor> listaDeAutores = new ArrayList<>();
public void cadastrarAutor(){

    Autor autor = new Autor();

    System.out.println("Digite o nome do autor ou autora: ");
    autor.nome = scanner.next();

    System.out.println("Digite o local de nascimento do autor ou autora: ");
    autor.localNasc = scanner.next();

    listaDeAutores.add(autor);
}
    public void listarAutores(){

        for (Autor cadaAutor : listaDeAutores){
            System.out.println();
            System.out.println("Nome: " + cadaAutor.nome);
            System.out.println("Local de nascimento: " + cadaAutor.localNasc);
            System.out.println();
        }
    }

}
