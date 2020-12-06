class Janela{
    int largura, altura;

    Janela(int largura, int altura){   //Note que o construtor possui o mesmo nome da classe, mas essa é diferenciada pelos parênteses.
        this.largura = largura;
        this.altura = altura;
    }

    Janela(){
        this(100, 100);
        System.out.println("Int = "+largura);

    }


    void imprimir(){
        System.out.println("Altura = "+altura+", a largura = "+largura);
    }

}

public class PalavraChaveThis {
    public static void main(String[] args) {

        Janela J = new Janela();
        J.imprimir();

        /*
        Por definição na linguagem Java, todo o objeto terá
        a palavra chave this implícita. Está é utilizada para
        fazer referência a si próxima.

        A palavra this em português significa este, está; Onde
        esta faz referência ao objeto que estamos utilizando.
         */

    }
}

