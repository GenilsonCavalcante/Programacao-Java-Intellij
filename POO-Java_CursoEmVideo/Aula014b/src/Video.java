public class Video implements AcoesVideo{

    //Atributos:
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzido;

    //Métodos Especiais:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);

        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzido() {
        return reproduzido;
    }
    public void setReproduzido(boolean reproduzido) {
        this.reproduzido = reproduzido;
    }

    //Método Construtor:
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzido = false;
    }

    //Implementações
    @Override
    public void play() {
        this.reproduzido = true;
    }
    @Override
    public void pause() {
        this.reproduzido = false;
    }
    @Override
    public void like() {
        this.curtidas++;
    }

    //Sobreeposição:
    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzido=" + reproduzido +
                '}';
    }
}
