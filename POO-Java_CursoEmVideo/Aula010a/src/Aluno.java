public class Aluno extends Pessoa{//Para que aluno se torne filha de uma classe usamos a palavra 'extends', assim, a classe Aluno herda as características e comportamentos de Pessoa

    //Atributos:
    private int matr;
    private String curso;

    //Métodos:
    public void cancelarMatr(){

    }

    //Métodos Especiais:

    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
