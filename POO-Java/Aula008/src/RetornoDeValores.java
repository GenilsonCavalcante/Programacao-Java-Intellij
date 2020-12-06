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

public class RetornoDeValores {
    public static void main(String[] args) {

        /*
        tipoRetorno nome() {
            return valor;
        }
        OBS: Retornando os valores do mesmo tipo para a função na qual está chando essa.
         */

        Retangulo quadrado = new Retangulo();
        quadrado.width = 100;
        quadrado.height = 120;

        System.out.println(quadrado.areaTotal());//Retornando o valor da função areaTotal
        System.out.println(quadrado.isQuadrado());//Retornando o valor da função isQuadrado

        //Invocação das funções para outra variável

        Retangulo quadrado2 = new Retangulo();
        quadrado2.width = 100;
        quadrado2.height = 100;

        System.out.println(quadrado2.areaTotal());//Retornando o valor da função areaTotal
        System.out.println(quadrado2.isQuadrado());//Retornando o valor da função isQuadrado


    }
}
