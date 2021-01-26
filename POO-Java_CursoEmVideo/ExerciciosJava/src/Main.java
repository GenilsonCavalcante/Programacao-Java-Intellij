public class Main {
    public static void main(String[] args){

        Aluno a1 = new Aluno();
        a1.setNome("Genilson Cavalcante");
        a1.setIdade(19);
        a1.setTurma("2° Ano - I");
        a1.setCpf("000.000.000-00");//OBS: Valor de uma String para ficar no modelo do n° do CPF;

        System.out.println(a1.toString());

    }
}
