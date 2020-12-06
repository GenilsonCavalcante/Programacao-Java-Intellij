class Fatorial{
    int fat(int n){
        if(n<=1){//a nossa condição básica.
            return 1;
        }
        int r = fat(n-1)*n;
        return r;
    }
}


public class Recursividade {
    public static void main(String[] args){
        /*Recursividade é um método que chama a si mesmo. É uma
        situação onde uma rotina invoca a si mesma.

        Esse tipo trabalha como uma pilha, vai empilhando os códigos
        conforme vai proceguindo o código, sendo que o primeiro a
        entrar é o último a sair.
         */
        System.out.println(new Fatorial().fat(5));
    }
}
