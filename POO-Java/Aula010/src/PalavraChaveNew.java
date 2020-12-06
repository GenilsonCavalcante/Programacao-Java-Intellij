class Retangulo{
    public int width, height;

    public int areaTotal(){
        return width * height;
    }
    public boolean isQuadrado(){
        if(width==height)
            return true;
        return false;
    }
}

public class PalavraChaveNew {

    //Introdução - new

    /*
    Quando quisermos instânciar uma nova função
    sempre devemos utilizar a palavra reservada new.

    ex: tipo nomw = new tipo();

    Instanciar uma classe, é criar um novo objeto para uma classe,
    ou seja, quando falamos criar um objeto ou instanciando um objeto,
    estamos falando da mesma coisa.
     */

    Retangulo r1 = new Retangulo();
    Retangulo r2;

    r2 = r1; //Ambas as variáveis estão compartilhando o mesmo local na memória
    r1.width = 1000;

    System.out.println(r1.width);
    System.out.println(r2.width);

}
