class Janela{
    int largura, altura;
    boolean b;
    float f;
    double d;
    Janela(int l, int a){   //Note que o construtor possui o mesmo nome da classe, mas essa é diferenciada pelos parênteses.
        largura = l;
        altura = a;
    }

    Janela(){

        System.out.println("Int = "+largura);
        System.out.println("Bool = "+b);
        System.out.println("float = "+f);
        System.out.println("Double = "+d);

    }


    void imprimir(){
        System.out.println("Altura = "+altura+", a largura = "+largura);
    }

}

public class InicializacaoDeObjetos {
    public static void main(String[] args) {

        /*
        Toda classe sempre terá um método construtor, assim o
        método construtor deve ser o mesmo do qua a classe.
         */

        //Janela J = new Janela(250, 250);
        Janela J = new Janela();
        J.imprimir();

        //OBS: É importande definirmos os valores para as variáveis, muitas das fezes, embora o java já atribua um valor padrão, pode acontecer erros em outras ocasiões.

    }
}
