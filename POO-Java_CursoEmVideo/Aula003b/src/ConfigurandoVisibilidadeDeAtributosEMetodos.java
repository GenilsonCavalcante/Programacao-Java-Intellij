public class ConfigurandoVisibilidadeDeAtributosEMetodos {
    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; - Isso gera um erro, pois o atribuo está declarado na classe Caneta como privado.
        c1.carga = 80; //Neste caso, como o atributo carga é protegido e está dentro da classe que o chama a classe Caneta, ele não dá erro.
        //c1.tampada = false;
        c1.status();
        c1.destampar(); //Este código dá certo, porque embora o atributo tampada seja provado, ele é executado na classe caneta pelas funções
        //tampar() e destampar() que são públicos, os atributos privados só podem ser executados dentro da classe a qual forem declarados.
        c1.rabiscar();

    }
}
