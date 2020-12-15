import java.util.Scanner;


public class GetESet {
    public static void main(String[] args){

        /*
            métodos get e set.
            Usamos get e set, pois são métodos que atendem ao encapsulamento do código, onde
            podemos manipular valores de atributos privados de uma forma segura. Faz com que
            impessa a qualquer pessoa o acesso a certos atributos privados, para que não sejem
            alterados.

            get - significa obter, ele obtem o valor armazenado em um atributo de uma classe.
            ou seja, ele acessa os valores dos atributos indiretamente.

            set - método que consegue modificar/gravar um valor em um atributo de uma classe.
            (Geralmente um atributo privado e que não possua acesso diretamente.)

         */

        String time;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Para que time você torce? ");
        time = texto.nextLine();//OBS: para chamar o Scanner com valor de uma String, usamos o Line;

        torcida.setTime(time);
        torcida.mostraTime();;

    }
}
