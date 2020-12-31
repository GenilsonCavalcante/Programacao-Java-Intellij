public class Aluno extends Pessoa{ //Caso eu colocasse essa classe como sendo final, a classe Bolsista não poderia mais herdar nada desta classe projeritora, pois uma classe final não pode ser herdada, ou seja, uma classe final não pode ter filhos. exemplo de classe final: public final class Aluno extends Pessoa { ... }

    //Atributos:
    private int matricula;
    private String curso;

    //Métodos:
    public void pagarMensalidade(){//Caso eu coloque como sendo um método final, eu não posso sobrepor, pois um método final não pode ser mais sobreposto. exemplo de método final: public final void pagarMensalidade(){}
        System.out.println("Pagando mensalidade do aluno "+this.getNome());
    }

    //Métodos Especiais:

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + '\'' +
                ", sexo=" + sexo + '\'' +
                ", matricula=" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
