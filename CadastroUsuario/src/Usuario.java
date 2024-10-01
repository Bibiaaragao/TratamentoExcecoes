public class Usuario {
    private String nome;
    private int idade;

    public void setNome(String nome) throws NomeInvalidoException{
        if (nome == null || nome.trim().equals("")){
            throw new NomeInvalidoException("0 nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public void setIdade(int idade)throws IdadeInvalidaException{
        if (idade < 18 || idade > 100){
            throw new IdadeInvalidaException("A idade é inválida. Só é válida de 18 a 100 anos.");
        }
        this.idade = idade;
    }
}