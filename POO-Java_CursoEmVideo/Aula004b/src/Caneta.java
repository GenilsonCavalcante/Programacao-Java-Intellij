public class Caneta {

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Todo método get e set deve ser público.

    public Caneta(String m, String c, float p){ //Este é o método Contrutor, os métodos construtores possuem o mesmo nome da classe
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();   //Atributos padrões do método construtor.
    }


    public String getModelo(){ //Não pode retornar void, mas sim String, pois o atributo é String;
        return this.modelo;
    }
    public void setModelo(String m){ //void --- Vazio;
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }

}
