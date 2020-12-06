class Janela{
    int largura, altura;
    Janela(int l, int a){   //Note que o construtor possui o mesmo nome da classe, mas essa é diferenciada pelos parênteses.
        largura = l;
        altura = a;
    }

    void imprimir(){
        System.out.println("Altura = "+altura+", a largura = "+largura);
    }

}



public class Construtores {
    public static void main(String[] args) {

        //Construtores sempre devem ter o mesmo nome da classe.
        /*
        Nome do bloco de instrução que é executado quando um objeto é criado

        */
        Janela J = new Janela(250, 250);
        J.imprimir();
    }
}
