public class Pessoa {

    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos Públicos
    public void fazerAniversario(){
        this.idade++;//Ou seja, idade = idade + 1
    }

    //Métodos Especiais
    public Pessoa(String nome, int idade, String sexo){//Método Construtor
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
