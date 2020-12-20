import org.w3c.dom.ls.LSOutput;

public class JogoJoKenPo2 {
    public static void main(String[] args){

        System.out.println("==========JOKENPÓ==========");
        System.out.println("1 - PEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TESOURA");
        System.out.println("===========================");
        System.out.println();

        Jogo jog1 = new Jogo();
        jog1.setNome("");
        jog1.setEscolha(0);
        //jog1.status();

        Jogo jog2 = new Jogo();
        jog2.setNome("");
        jog2.setEscolha(0);

        System.out.print("Jogador "+ jog1.getNome() + " escolheu ");
        jog1.jogadores();
        System.out.println();
        System.out.print("Jogador "+ jog2.getNome() + " escolheu ");
        jog2.jogadores();

        String ganhador = (jog1.getEscolha() == jog2.getEscolha()) ? "EMPATE" :
        (jog1.getEscolha() ==  1 && jog2.getEscolha() == 3)    ? "O jogador "+jog1.getNome()+" Ganhou!!!" :
        (jog1.getEscolha() ==  1 && jog2.getEscolha() == 2)    ? "O jogador "+jog2.getNome()+" Ganhou!!!" :
        (jog1.getEscolha() ==  3 && jog2.getEscolha() == 1)    ? "O jogador "+jog2.getNome()+" Ganhou!!!" :
        (jog1.getEscolha() ==  3 && jog2.getEscolha() == 2)    ? "O jogador "+jog1.getNome()+" Ganhou!!!" :
        (jog1.getEscolha() ==  2 && jog2.getEscolha() == 1)    ? "O jogador "+jog1.getNome()+" Ganhou!!!" :
        (jog1.getEscolha() ==  2 && jog2.getEscolha() == 3)    ? "O jogador "+jog2.getNome()+" Ganhou!!!" : "ERRO!!!";
        System.out.println("==========PARABÉNS==========");
        System.out.println(ganhador);
        System.out.println("============================");
    }
}
