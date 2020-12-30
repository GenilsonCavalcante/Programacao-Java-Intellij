public class HerancaParte1 {
    public static void main(String[] args){
//HerancaParte1
        /*
            2° Pilar da POO:
            - HERANÇA: Puxar características e comportamentos da mãe. EX: mãe e sua filha,
            a filha possui algumas características semelhantes a sua mãe,
            como exemplo os seus olhos e sua boca.
            Ou seja, a classe mãe pode gerar filhas, onde essas podem "puxar"/herdar
            algumas de suas características e comportamentos.

            Definição mais formal:
            HERANÇA: Permite basear uma nova classe na definição de uma outra classe
            previamente existente.

            Um exemplo, podemos pegar uma caneta onde esta possui suas características
            básicas, mas eu desejo acrescentar algo novo a essa caneta, como por exemplo
            uma funcionalidade, em que ela acenda uma luz para escrever no escuro. Para
            eu poder criar essa nova caneta de forma eficiente, eu pego essas características
            da caneta comum, ou seja, a caneta mãe, e herdo todas elas juntamente com seus
            comportamentos e acrescento a essa nova caneta, a nova funcionalidade de acender
            uma luz. Resumidamente, a caneta nova herdou as características da caneta mãe.

            OBS: Toda classe mãe possui características e comportamentos. A herança será
            aplicada tanto para as características quanto para os comportamentos.

            Não somos obrigados a inserirmos os dois pilares da POO nos programas, referindo-se
            ao pilares, herança e encapsulamento. Mas se quisemos um excelente software, devemos usa-lás.

            Enquanto aos termos designados a essas classes trabalhadas, temos que a classe herdadora
            é chamada Mãe/Progenitora/Superclasse, e as que vão herdar as características são as
            Filhas/Subclasse.
         */

        //Instanciando os Objetos:
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        

    }
}
