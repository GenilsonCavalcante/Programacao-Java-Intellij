import java.util.Random;

public class Luta {

    //Atributos:
    private Lutador desafiado; //Tipo abstrato, ou seja, desafiado e desafiante são suas instâncias da classe Lutador.
    private Lutador desafiante; //Ou seja, cria-se uma relação entre esses tipos abstratos e entre a classe instânciada.
    private int rounds;
    private boolean aprovado;

    //Métodos:
    public void marcarLuta(Lutador l1, l2) {
        if (l1.getCategoria() = l2.getCategoria() && (l1 != l2)){
            aprovado = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovado = false;
            desafiante = null;
            desafiado = null;
        }
    }
    public void lutar() {
        if (aprovado){
            desafiado.aprensentar();
            desafiante.aprensentar();
            vencedor = Random(0,2);
            switch (vencedor){
                case 0://Empatou
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1://Ganhou Desafiado
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2://Ganhou Desafiante
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

    //Métodos Especiais:
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
