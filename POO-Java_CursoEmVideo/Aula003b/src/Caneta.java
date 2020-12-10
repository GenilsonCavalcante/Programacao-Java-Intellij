public class Caneta{


    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar.");
        }else{
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar(){
        this.tampada = true;  //OBS: this é o nome do objeto que o chamou, neste caso: c1.
    }//Sempre que quizermos referenciar o próprio atributo, usamos o this e o nome desse atributo.

    public void destampar(){
        this.tampada = false;
    }


}
