public class UltraEmojiCombat {
    public static void main(String[] args){
        /*
            Lutador 1: nome: Pretty Boy; Nacionalidade: França; Idade: 31; altura: 1.75 m; Peso: 68.9 kg; categoria: leve; Vitórias: 11; derrotas: 2; empates: 1;
            Lutador 2: nome: Putscript; Nacionalidade: Brasil; Idade: 29; altura: 1.68 m; Peso: 57.8 kg; categoria: leve; Vitórias: 14; derrotas: 2; empates: 3;
            Lutador 3: nome: Snapshadow; Nacionalidade: EUA; Idade: 35; altura: 1.65 m; Peso: 80.9 kg; categoria: Médio; Vitórias: 12; derrotas: 2; empates: 1;
            Lutador 4: nome: Dead Code; Nacionalidade: Austrália; Idade: 28; altura: 1.93 m; Peso: 81.6 kg; categoria: Médio; Vitórias: 13; derrotas: 0; empates: 2;
            Lutador 5: nome: Ufocobol; Nacionalidade: Brasil; Idade: 37; altura: 1.70 m; Peso: 119.3 kg; categoria: Pesado; Vitórias: 5; derrotas: 4; empates: 3;
            Lutador 6: nome: Nerdaard; Nacionalidade: EUA; Idade: 30; altura: 1.81 m; Peso: 105.7 kg; categoria: Pesado; Vitórias: 12; derrotas: 2; empates: 4;
         */

        Lutador l[] = new Lutador[6];//Um vetor para criar os seis objetos, ou seja os seis Lutadores.

        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        l[0].aprensentar();

        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        l[1].aprensentar();

        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        l[2].aprensentar();

        l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93f, 81.6f);
        l[3].aprensentar();

        l[4] = new Lutador("Ufocobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        l[4].aprensentar();

        l[5] = new Lutador("Nerdaard", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        l[5].aprensentar();

    }
}
