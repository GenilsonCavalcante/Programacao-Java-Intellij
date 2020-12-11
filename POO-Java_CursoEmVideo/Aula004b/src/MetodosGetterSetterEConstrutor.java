public class MetodosGetterSetterEConstrutor {
    public static void main(String[] args){

        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);//Parâmetros informados para o método construtor.
        c1.status(); //Apenas com essa linha de comando eu já posso definir os valores dos elemento padrões do método construtor.


        c1.setModelo("BIC");
        //c1.modelo = "BIC";//Não há nenhum problema de atribuit os valores diretemente, já que se trata de um atributo público.

        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;//Note que dá erro, pois é um atributo privado, caso não seja trabalado com
        //o método set, ele nçao permiti a execução. Com o método set sim, pois ele dá a segurança ao
        //atributo.

        //c1.status(); ou podemos ainda fazer da seguinte forma:
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

    }
}
