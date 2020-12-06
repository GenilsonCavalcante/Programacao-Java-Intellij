class Calculo{
    void soma(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

public class ParametrosEArgumentos {
    public static void main(String[] args){
        //Parâmetros são valores recebidos e que dizem o que os métodos precisara para o processamento de informações.
        /*tipo nome(tipo parametro1; tipo parametro2){
            //corpo();
        }

        nome(argumento1, argumento2);

        OBS: Um método recebe parâmetros, e quando se invoca esses, devemos passar os argumentos.

         */
        Calculo cal = new Calculo();//Declarada uma variável com nome cal do tipo Calculo instalciando a função Calculo
        cal.soma(5, 25);//Passado dois argumentos para a função Calculo.
    }
}
