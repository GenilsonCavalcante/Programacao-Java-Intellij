public class OQueEUmObjeto {
    public static void main(String[] args){

        //O que é um objeto?
        /*
        DEFINIÇÃO: Coisa material ou abstrata que pode ser
        percebida pelos sentidos e descrita por meio das suas
        características, comportamentos e estado atual.

        EX: 'Controle Remoto' - Características: ter uma minitela
        e dois botões, modelo RTX64, etc; Comportamentos: Posso usar
        o objeto para ligar, gravar, pausar, desligar; Estado: o
        objeto se encontra desligado, estado novo, bateria nova.
        -Outro exemplo de objeto é o compromisso. Pois o mesmo possui
        características, comportamentos e estado.


        Todos os objetos em POO são classificados segundo as suas
        características, métodos e estado. Para determinarmos melhor a
        definição de um objeto, devemos fazer três perguntas:

        OBS: Objeto - Caneta. Sempre fazer essas três perguntas para um objeto:

        -Coisas que eu tenho?(ATRIBUTOS) Modelo; Cor; Ponta; Carga; Tampada.

        -Coisas que eu faço?(MÉTODOS) Escrever; Rabiscar; Pintar; Tampar; Destampar.

        -Como eu estou agora?(ESTADO) Nesse momento a caneta está com 50% de carga,
        ela é azul, está destampada e escrevendo.

        Ou seja:

        ATRIBUTOS - CARACTERÍSTICAS, PROPRIEDADE, DADOS
        MÉTODOS - COMPORTAMENTOS, PROCEDIMENTOS, ROTINAS INTERNAS DO OBJETO
        ESTADO - CARACTERÍSTICAS ATUAIS NO MOMENTO EM QUE ESTOU ANALIZANDO O OBJETO.

        OBS: Esses são os fundamentos que todos os objetos devem ter. Sendo que
        todo objeto vem apartir de uma classe, vem apartir de um molde.

        Para eu criar uma caneta eu devo criar um molde dessa caneta, ou seja, eu
        devo criar uma classe.

        EX:

        Classe Caneta{
            modelo: Caractere = BIC Cristal;
            cor: Caractere = Azul;
            ponta: Real = 0.5;
            carga: Inteiro = 90;
            tampada: Lógico = falso;

            Metodo rabiscar(){
                Se(tampada)então:
                    Escrever("ERRO");
                Senão:
                    Escreva("Rabisco");
                FimSe;
            FimMetodo;

            Metodo tapar(){
                tampada = verdadeiro;
            FimMetodo;
            }
            FimClasse;
            }

        }

        Quando eu pego uma classe e quero tranformá-la em um objeto,
        eu instâncio essa classe, e dou origem a tal objeto.
        INSTÂNCIAR - É quando eu pego uma classe e consigo gerar um
        objeto través dela. Eu não posso transformar uma classe em um
        objeto! Para instanciar uma classe é simples:

        c1 = new Caneta; //O que vem antes do new é o objeto, o que vem
        em seguida é a classe que estou instanciando.

        Podemos atribuir objetos diferentes a uma mesma classe, só que com
        seus atributos diferentes, ainda mesmo sem interferir nos outros objetos

        CLASSE: Define os atributos e métodos comuns que serão compartilhados
        por um objeto.

        OBJETO: É uma instância de uma classe. Quando eu instâncio uma classe eu
        crio um objeto.

        Outro Exemplo:

        Tendo uma forma de fazer bolinhos no formato de uma estrela, percebemos que
        apartir dessa forma podemos criar muitos objetos, logo, essa forma é o molde
        para fabricar tais objetos, ou seja, ela é a classe que instância objetos. Importante, todos os objetos
        dessa mesma classe vão possuir os mesmos atributos, só que com valores diferentes. Os bolinhos possuem os
        mesmos atributos, mas estados diferentes.

        Outro conceito importante é o de:

        ABSTRAÇÃO: Que é através de uma complexidade de atributos que um objeto
        possui, eu pego apenas aqueles que são mais relevantes para o uso, ou seja, eu abstraio
        de todas as características existentes, somente aquelas que irei utilizar.

         */



    }
}
