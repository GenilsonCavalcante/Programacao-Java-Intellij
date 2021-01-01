public class PolimorfismoSobrecargaPart2 {
    public static void main(String[] args){

        Mamifero gato = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        gato.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();

        System.out.println();

        //Diferentes formas de reagir através do polimorfismo de sobrecarga
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar!");
        cachorro.ragir(11, 45);
        cachorro.ragir(19, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);

    }
}
