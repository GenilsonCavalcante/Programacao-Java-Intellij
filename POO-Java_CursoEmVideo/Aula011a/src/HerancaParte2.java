public class HerancaParte2 {
   public static void main(String[] args) {

       //NAVEGAÇÃO PELA HERANÇA;

       /* \ \|
                                       A
                                       *
                                       |
                                       |
             --------------------------|--------------------------
             |                         |                         |
             |                         |                         |
            AA                        AB                        AC
             *                         *                         *
             |                         |                         |
             |                         |                         |
            AAA                -----------------                ACA
                               |               |
                               |               |
                              ABA             ABB
                               *
                               |
                               |
                        ---------------
                        |             |
                        |             |
                      ABAA          ABAB

         obs: Tudo que for de A será herdado por AA, AB, AC.
              Tudo que for de AA será herdado por AAA.
              Tudo que for de AB será herdado por ABA, ABB.
              Tudo que for de AC será herdado por ACA.
              Tudo que for de ABA será herdado por ABAA, ABAB

              - Toda superclasse pode se tornar uma subclasse, dependendo do ponto referencial
              tudo que está acima é superclasse, o que está abaixo é subclasse.

              Notamos que A não possui uma superclasse, logo ela é a classe RAIZ!!!
              É como fosse uma árvore representado de cabela para baixo.
              E para essas classes que não possuem filhas, são denominadas de FOLHA, como exemplo: ABAA, ABAB, ACA, ABB, AAA.
              São denominados de DESCENDENTES, aquelas classes que possuem uma avô ou um ente mais antigo, mas nunca apenas a mãe. Ex de Descendentes: ABAA, ABAB, ACA, AAA, ABA, ABB.
              Na mesma linha de raciocício de Descendente, temos os ANCESTRAIS, onde que os entes mais antigos são os acentrais de seus entes mais novos, neto, bizneto... Nunca a filha.
              OBS: Quando percorremos a árvore de cima para baixo, estamos fazendo uma ESPECIALIZAÇÃO, já o processo inverso, estamos nos referindo de uma GENERALIZAÇÃO.

              TIPOS DE HERANÇA:
              1° - HERANÇA DE IMPLEMENTAÇÃO: Conhecida também como herança pobre. É quando temos uma classe que por si só não possui nenhum atributo ou método, mas que somente os que herda de sua mãe, por isso é conhecida como uma herança pobre.
              2° - HERANÇA PARA DIFERENÇA: Onde que além de possuirmos os atributos e comportamentos herdados de sua mãe, essa classe vai possuir características e métodos adicionais, diferentes das que sua mãe possui.

              CLASSE ABSTRATA: Não pode ser instanciada. Só pode servir como progetora;
              MÉTODO ABSTRATO: Declarado, mas não implementado na progenitora;
              CLASSE FINAL: Não pode ser herdada por outra classe. Obreigatoriamente folha;
              MÉTODO FINAL: Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado.



        */

   }
}
