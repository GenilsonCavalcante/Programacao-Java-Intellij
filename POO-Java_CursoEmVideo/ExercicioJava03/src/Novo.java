public class Novo extends Imovel {
    //Atributos:
    private double precoAdicional;

    //Métodos:
    public double getPrecoAdicional() {
        return precoAdicional;
    }
    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional + getPreco();
    }

    public void status(){
        System.out.println("Edereço: " + this.getEndereco());
        System.out.println("Preço: " + this.getPreco() + " R$");
        System.out.println("Preço + Adicional = " + this.getPrecoAdicional() + " R$");
    }
}

