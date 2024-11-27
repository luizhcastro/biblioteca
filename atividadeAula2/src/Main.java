import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoDePublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponibilidade = disponibilidade;
    }
}

class Usuario {
    private String nome;
    private int id;
    private String[] livrosEmprestados;

    public Usuario(String nome, int id, String[] livrosEmprestados){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }
}

public class Main {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar novo livro");
            System.out.println("2. Remover um livro");
            System.out.println("3. Listar  livros cadastrados");
            System.out.println("4. Buscar um livro");
            System.out.print("5. Emprestar livro ");
            System.out.print("6. Devolver livro ");
            System.out.print("7. Adicionar um novo usuário ");
            System.out.print("8. Listar usuários ");
            System.out.print("9. Encerrar aplicação ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                   ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }


}
