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

public class Instancia {
    public static void main(String[] args){

        //Retangulo r1; //Criada a variável r1 do tipo retângulo
        //r1.isQuadrado();//OBS: Como a nossa variável não foi extanciada, sem receber nenhuma parâmetro, isso fazerá acontecer um erro de excessão.
        //Fazendo om que seja executado:

        Retangulo r1=null;
        if(r1!=null){
            r1.isQuadrado();
            //NullPointerException
        }

    }
}
