public class Aluno {

    //Atributos:
    private String nome, turma, cpf;
    private int idade;

    //Métodos Especiais:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}
