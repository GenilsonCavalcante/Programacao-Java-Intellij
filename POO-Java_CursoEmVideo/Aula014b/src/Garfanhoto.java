public class Garfanhoto extends Pessoa {

    //Atributos:
    private String login;
    private int totalAssistindo;

    //Método Super:
    public Garfanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistindo = 0;
    }

    //Métodos Especiais:
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistindo() {
        return totalAssistindo;
    }

    public void setTotalAssistindo(int totalAssistindo) {
        this.totalAssistindo = totalAssistindo;
    }

    //toString:

    @Override
    public String toString() {
        return "Garfanhoto{" +
                "login='" + login + '\'' +
                ", totalAssistindo=" + totalAssistindo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
