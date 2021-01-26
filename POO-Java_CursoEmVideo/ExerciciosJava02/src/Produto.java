public class Produto {

    //Atributos:
    private String nome;
    private double precoCusto, precoVenda, margemLucro;

    //Métodos Especiais:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda < this.precoCusto) {
            System.out.println("O preço da venda é inferior ao custo!!!");
        }else{
            this.precoVenda = precoVenda;
        }
    }
    public double getMargemLucro() {
        return margemLucro;//this.getPrecoVenda() - this.getPrecoCusto()
    }
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = getPrecoVenda() - getPrecoCusto();
    }

    public void status(){
        System.out.println("Nome do Produto: " + this.getNome());
        System.out.println("Custo: " + this.getPrecoCusto() + " R$");
        System.out.println("Venda: " + this.getPrecoVenda() + " R$");
        System.out.println("Lucro Adquirido: " + this.getMargemLucro() + " R$");
    }
}
