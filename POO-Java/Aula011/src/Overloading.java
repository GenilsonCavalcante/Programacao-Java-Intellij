class Sobrecarga {
    void imprime(String s){
        System.out.println(s);
    }
    void imprime(String s1, String s2){
        System.out.println(s1+" - "+s2);
    }
    void imprime(String s1, int i1){
        System.out.println(s1+" - "+i1);
    }
}


public class Overloading {
    public static void main(String[] args){
        //OVERLOADING - Sobre carga de métodos.
        /*
        Essa sobrecarga se dá apartir do grande volume de parâmetros,
        e que os mesmos não podem ser iguais. A sobre carga de parâmetros
        exige que a lista de parâmetros sejam diferentes ou mesmo possuam
        tipos diferentes. Ou seja, podemos ter uma lista muito grande de
        parâmetros, desde que os mesmos sejam diferentes, possuam tipos
        diferentes em um número orgdenado.

        VEJA DIFERENTES MÉTODOS COM NOMES IGUAIS, MAS COM TIPOS DE DADOS DIFERENTES:

        int meuMetodo(int){
        }
        int meuMetodo(float){
        }
        int meuMetodo(int, float){
        }
        OBS: O que vai diferenciar esse métodos, é que os mesmos
        possuem parâmetros diferents. Embora sejam métodos com os
        mesmos nomes, eles são diferentes entre si.


         */

        new Sobrecarga().imprime("Um parametro do tipo String"); //1°método
        new Sobrecarga().imprime("Primeiro parâmetro", "Segundo parâmetro"); //2°método
        new Sobrecarga().imprime("A idade é:", 22); //3°método
    }
}
