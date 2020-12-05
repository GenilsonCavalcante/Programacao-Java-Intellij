public class Classes {
    public static void main(String[] args) {
        /*
        CLASSE: Projeto de como construir um determinado objeto
        As classes servem tanto para encapsular informações, e até
        mesmo para modularizadas
         */

        class MinhaClasse extends Object implements xyz {
            //OBS: Exemplo de interface 'xyz' para fins didáticos.

            //Definição mínima de uma classe. E que dentro dela temos:

            //Campo-ou seja-Atributos
            //Construtores
            //Métodos-ou seja-Ações

        /*
        Para que possamos herdar as características de uma outra classe
        devemos utilizar a palavra 'extends', ou seja, estamos dizendo que
        queremos estender a classe. Em seguida, inserimos o nome da classe
        na qual queira extender, exemplo: 'Object'.

        OBS: Por padrão, se definirmos ou não uma classe, ela vai ser herdeira da
        classe principal de todas as outras classes, que é a classe 'object'. Essa
        é a classe mãe de todas as classes do java.

        OBS: Uma classe só pode extender apenas uma única classe, porém ela pode
        interpletar quantas interfaces necessárias. Como o exemplo acima, onde
        implementamos a interface xyz, com o comando: 'implements xyz'.


        Uma Classe no Java pode ser declarada até 5 formas distintas, são elas:

            1) Modificadores de acesso:
                a) public
                b) private
                c) protected
                d) sem modificador (neste exemplo de classe utilizada)
            2) Atribuir um nome a classe (letra maiúscula)
            3) Extender de outra classe com (extends)
            4) Interface que a nossa classe irá implementar (implements), pode ser declarada várias
            5) Corpo de uma classe, onde todo o conteúdo de uma classe está limitada por duas chaves{}

         */
        }
    }
}
