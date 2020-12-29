public class UltraEmojiCombat {
    public static void main(String[] args){
        //Agregacao Entre Objetos Com Java.
        /*
            Criar uma classe para fazer com que os lutadores lutem.

            Atributos:
            - desafiante
            - desafiado
            - rounds
            - aprovada

            Métodos:
            + marcarLuta();
            + lutar();


            //REGRAS PARA A LUTA DA UEC:
            * Só pode ser marcada entre lutadores da mesma categoria;
            * Dasafiado e desafiante devem ser lutadores diferentes;
            * Só pode acontecer se estiver aprovada;
            * Só poode ter como resultado a vitória de um dos lutadores ou empate;

         */

        Lutador l[] = new Lutador[6];//Um vetor para criar os seis objetos, ou seja os seis Lutadores.

        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        //l[0].aprensentar();

        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        //l[1].aprensentar();

        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        //l[2].aprensentar();

        l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93f, 81.6f);
        //l[3].aprensentar();

        l[4] = new Lutador("Ufocobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        //l[4].aprensentar();

        l[5] = new Lutador("Nerdaard", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        //l[5].aprensentar();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();


    }
}
