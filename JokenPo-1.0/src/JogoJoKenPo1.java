
import java.util.Random;
import java.util.Scanner;

public class JogoJoKenPo1 {

        public static void main(String[] args) {

            //###Máquina###
            Random sorteio = new Random();
            int sorteio1 = sorteio.nextInt(3)+1;
            //System.out.println(escolha1);//Resultado da máquina.

            System.out.println();
            System.out.println("==================Jogo-JoKenPo==================");
            System.out.println();

            String escolha1;
            switch (sorteio1) {
                case 1 : escolha1 = "PEDRA";break;
                case 2 : escolha1 = "PAPEL";break;
                case 3 : escolha1 = "TESOURA";break;
                default : escolha1 = "NÚMERO INVÁLIDO";break;
            }

            //###Humano###
            Scanner in = new Scanner(System.in);
            System.out.println("=========== ESCOLHA UM NÚMERO ABAIXO ===========");
            System.out.println("1 - PEDRA");
            System.out.println("2 - PAPEL");
            System.out.println("3 - TESOURA");
            System.out.println("QUAL ESCOLHE . . .");
            int sorteio2 = in.nextInt();

            String escolha2;
            switch (sorteio2) {
                case 1 : escolha2 = "PEDRA";break;
                case 2 : escolha2 = "PAPEL";break;
                case 3 : escolha2 = "TESOURA";break;
                default : escolha2 = "NÚMERO INVÁLIDO";break;
            }

            System.out.println("A máquina escolheu: "+escolha1);//Resultado da máquina.
            System.out.println("Você escolheu: "+escolha2);//Resultado do usuário.

            String ganhador =   (escolha1 == escolha2) ? "EMPATE" :
            (escolha1 == "PAPEL"   && escolha2 == "TESOURA")  ? "JOGADOR-GANHOU" :
            (escolha1 == "PAPEL"   && escolha2 == "PEDRA")    ? "JOGADOR-PERDEU" :
            (escolha1 == "TESOURA" && escolha2 == "PAPEL")    ? "JOGADOR-PERDEU" :
            (escolha1 == "TESOURA" && escolha2 == "PEDRA")    ? "JOGADOR-GANHOU" :
            (escolha1 == "PEDRA"   && escolha2 == "PAPEL")    ? "JOGADOR-GANHOU" :
            (escolha1 == "PEDRA"   && escolha2 == "TESOURA")  ? "JOGADOR-PERDEU" : "ERRO!!!";

            System.out.println(ganhador);
        }

    }

