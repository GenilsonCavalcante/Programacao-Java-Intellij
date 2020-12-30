public class ProjetoPessoas {
    public static void main(String[] args){

        //OBS: Quem está antes da extends é a filha, e quem vem depois é mãe;

        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p1.setIdade(23);
        p2.setIdade(20);
        p3.setIdade(29);
        p4.setIdade(25);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p1.recebeAumento(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelaMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
