import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();

        try {
            System.out.println("Informe o seu nome: ");
            String nome = scanner.nextLine();
            usuario.setNome(nome);

            System.out.println("Informe a sua idade: ");
            int idade = scanner.nextInt();
            usuario.setIdade(idade);

            System.out.println(nome + " foi cadastrado(a) com sucesso!");
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
