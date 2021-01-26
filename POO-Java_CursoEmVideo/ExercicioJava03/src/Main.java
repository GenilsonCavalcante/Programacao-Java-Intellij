public class Main {
    public static void main(String[] args) {
        Novo i1 = new Novo();
        i1.setEndereco("Rua Inexistente");
        i1.setPreco(10000);
        i1.setPrecoAdicional(1050);
        i1.status();

        System.out.println("==========X==========");

        Velho i2 = new Velho();
        i2.setEndereco("Rua Logo Alí");
        i2.setPreco(7000);
        i2.setPrecoDesconto(500);
        i2.status();


    }
}
