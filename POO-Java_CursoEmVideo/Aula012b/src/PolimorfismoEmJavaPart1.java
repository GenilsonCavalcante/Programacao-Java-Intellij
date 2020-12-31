public class PolimorfismoEmJavaPart1 {
    public static void main(String[] args){

        //Animal n = new Animal(); Animal não pode ser instanciado, pois a classe Animal é abstrata.
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.4f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println();

        a.locomover();
        p.locomover();
        r.locomover();

        System.out.println();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();//Usando a sobreposição
        k.locomover();//Resultado diferente de Canguru
        k.emitirSom();//Usando a sobreposição
    }
}
