import java.util.Scanner;

public class Jogo {

    Scanner in = new Scanner(System.in);

    //Atributos
    String nome;
    int escolha;

    //Métodos Especiais
    public void setNome(String nome) {
        System.out.println("Digite seu nome: ");
        this.nome = in.next();
    }
    public void setEscolha(int escolha) {
        System.out.println("Digite '1', '2' ou '3'");
        this.escolha = in.nextInt();
    }
    public String getNome() {
        return nome;
    }
    public int getEscolha() {
        return escolha;
    }

    //Estatus
    public void status(){
        System.out.println("=====MENU=====");
        System.out.println("Nome: "+this.nome);
        System.out.println("Número: "+this.escolha);
        System.out.println("==============");
    }

    public void jogadores(){
        String escolha;
        switch(this.escolha){
            case 1 : escolha = "PEDRA";break;
            case 2 : escolha = "PAPEL";break;
            case 3 : escolha = "TESOURA";break;
            default : escolha = "NÚMERO INVÁLIDO";break;
        }
        System.out.println(escolha);
    }
}

