public class OQueEViabilidadeEmUmObjeto {
    public static void main(String[] args){

        //UML - Linguagem de Modelagem Unificada.
        //Diaframa de Classes. Representatividade de minhas classes.
        /*Para esse diagrama de classe, é uma forma representativa
        de representar um objeto através de um retângulo, onde que
        no topo desse retângulo colocamos o nome da classe, e dividimos
        o retângulo em duas linhas, uma para colocar os atributos
        referentes a esta classe e a outra parte para colocar os
        métodos desta classe.
         */

        /*
        Modificadores de Visibilidade - Indica o nível de acesso aos
        componentes internos de uma classe. Ou seja, os componentes internos
        de uma classe são os atributos e métodos, logo a visibilidade
        vai dizer o nível de acesso que você tem a eles. E para determinar
        essa visibilidade, uzamos de três símbolos. São eles e seus significados:

        +   --->   Público - DEFINIÇÃO: A classe atual e todas as outras classes.

        -   --->   Privado - DEFINIÇÃO: Somente a classe atual tem acesso.

        #   --->   Protegido - DEFINIÇÃO: Somente a classe atual e todas as suas
        subclasses tem acesso.(*Somente a minha mãe e os filhos dela tem acesso.)

        Com isso, podemos colocar esses nomes na frente dos atributos e métodos.
        OBS: Só podemos atribuir valores aos atributos, quando a classe pe pública,
        existe outras formas mais corretas para atribuir valores a atributos privados
        e públicos.

        **É necessário declararmos atributos e métodos privados, quando não queremos
        que os valores dos objetos sejam modificados. Um exemplo é o controle, onde
        que o usuário só possui acesso a parte frontal do controle e não internamente,
        pois ao ter esse privilégio do acesso interno, o usuário mexeria em seus componentes
        e comprometeria o controle, por isso que ele possui uma cápsula que o protege e
        deixar disponível para o usuário a parte pública. E para atributos protegidos,
        são aqueles que certas pessoas possuem acesso e outras não, exemplo é o chip infra-
        vermelho do controle, onde o usuário não tem acesso mas a televisão sim.



        EX:
        Objeto que pode aceitar esses elementos é o telefone, onde este
        pode ser público(orelhão), privado(celular) ou protegido(telefone de linha
        da minha mãe e os filhos dela).

         */
    }


}
