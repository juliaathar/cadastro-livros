import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Livro {
    public String titulo;
    public float preco;
    public LocalDate dataLancamento;

    Scanner scanner = new Scanner(System.in);
    ArrayList<Livro> listaDeLivros = new ArrayList<>();

    Autor autor = new Autor();

    public void cadastrarLivro() {

        Livro livro = new Livro();

        System.out.println("Digite o título do livro: ");
        livro.titulo = scanner.next();

        System.out.println("Informe o nome do autor ou autora do livro: ");
        autor.nome = scanner.next();

        System.out.println("Informe o local de nascimento do autor ou autora do livro: ");
        autor.localNasc = scanner.next();

        System.out.println("Informe o preço do livro: ");
        livro.preco = scanner.nextFloat();

        System.out.println("Informe a data de lançamento do livro (dd/mm/aaaa): ");
        LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodo = Period.between(date, LocalDate.now());

        livro.dataLancamento = date;

        if(periodo.getYears() >= 5){
            System.out.println("O livro pode ser cadastrado pois tem mais de 5 anos de lançamento");

            listaDeLivros.add(livro);
        } else{
            System.out.println("O livro não pode ser cadastrado porque não tem 5 ou mais anos de lançamento.");

        }
    }

    public void listarLivros(){

            for (Livro cadalivro : listaDeLivros){
                System.out.println();
                System.out.println("Título: " + cadalivro.titulo);
                System.out.println("Autor: " + cadalivro.autor);
                System.out.println("Preço: " + cadalivro.preco);
                System.out.println("Data de Lançamento: " + cadalivro.dataLancamento);
                System.out.println();
            }
    }

//    public int verificarTempoLanc(Livro livro){
//
//    }
}
