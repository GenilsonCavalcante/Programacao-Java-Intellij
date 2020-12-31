public class HerancaPart2Pratica {
    public static void main(String[] args){

        //Pessoa p1 =  new Pessoa(); ---> Note que dá erro, pois não podemos instanciar um objeto de uma classe abstrata.

        Visitante v1 = new Visitante(); //Herança de implementação, mesmo não existindo nenhum atributo, ele consegue trazer algumas informações graças ao poder da herança.
        v1.setIdade(54);
        v1.setNome("Genival");
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println();

        Aluno a1 = new Aluno(); //Herança para Diferença.
        a1.setNome("Cláudio");
        a1.setMatricula(11111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        System.out.println();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(22222);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setIdade(23);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();//Método sobreposto
    }
}
