public class CriandoClassesEObjetos {
    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c2.modelo = "Genilson";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

        /*
        OBS: Todos os objetos de uma mesma classe possui os mesmos
        atributos e métodos, mas não os mesmos valores de atributos,
        ou seja, eles não possuem o mesmo status.
         */
    }
}
