class Mobile {
    //public Object volume;
    public boolean ligado;  //Atributo private só pode ser acessado dentro do escopo da classe
    private boolean displayLigado;  //Esse atributo private está encapsulado dentro dessa classe, não podendo ser acessível a outra classe, somente manipulado nesta.
    public int volume = 0;  //Esse como é um atributo público, pode ser acessado para outras classes

    //[modificador] [tipo] nome = [valor]; //Declaração do atributo
}
