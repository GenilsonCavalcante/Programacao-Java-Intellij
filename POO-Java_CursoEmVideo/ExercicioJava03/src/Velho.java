public class Velho extends Imovel{
    //Atributos:
    private double precoDesconto;

    //Métodos:
    public double getPrecoDesconto() {
        return precoDesconto;
    }
    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = getPreco() - precoDesconto;
    }

    public void status(){
        System.out.println("Edereço: " + this.getEndereco());
        System.out.println("Preço: " + this.getPreco() + " R$");
        System.out.println("Preço - Desconto = " + this.getPrecoDesconto() + " R$");
    }
}
