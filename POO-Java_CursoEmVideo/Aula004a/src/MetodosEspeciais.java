public class MetodosEspeciais {
    public static void main(String[] args){

        Estante e = new Estante();//Instânciei um novo objeto, ou seja, criei um novo objeto chamado e.
        e.cor = "VERMELHO";
        e.fabricante = "magalu";
        e.gavetas = 4;
        e.modelo = "RTX-49";
        e.portas = 2;
        e.tamanho = 1.20;
        e.totDoc = 10;
        e.retiraDoc = 2;
        e.colocaDoc = 5;

        e.guardarCoisas();
        e.retirarCoisas();
        e.totalDocumetos();





        //Métodos Acessores, são métodos que dão acesso a uma determinada coisa. EX:
        /*
            Esses métodos acessores, são métodos que vão dar acesso a algo, um exemplo é quando
            você vai ao caixa depositar 100 reais, ao fazer isso, existe uma pessoa que vai estar
            responsável por fazer esse depósito, pois como sabemos muito bem, uma pessoa não pode
            simplesmente ir ao caixa e colocar individualmente o seu dinheiro. Existe esse método
            para dar mais segurança as ações. Outro exemplo é quando temos uma instante que guarda
            muitos documentos de muitas pessoas em uma empresa, logo, deve existir algum responsável
            por fazer a entrega dos documentos certos as pessoas certas, evitando assim que pessoas
            não peguem dicumentos de outras pessoas.

            Esses métodos acessores são conhecidos como 'getters' que siginifica acessar algo ou pegar algo.

            Logo, existe esse método para pegar/consultar uma informação de uma função! EX:
            t = e.getTotDoc();   --->   Onde armazenamos o tatal de valores do método na variável t.

            Então o nosso 1° Método Especial faz com que temos acesso a informações de uma forma mais
            segura.

            2° Método Especial: Métodos Modificadores ou 'seterrs'.
            Imaginando a mesma situação, quando um cliente quiser ir a estante e colocar um documento
            seu lá, e outras pessoas fizerem o mesmo, concordamos que tudo vai ficar bagunçado e
            desorganizado. E para que isso se resolva, devemos fazer a mesma coisa, coloar uma mesa e
            um responsável para atender as pessoas e colocar os documentos das mesmas nos seus devidos
            locais.

            e.setTotDoc(doc);   --->   Este parâmetro faz com que seja adicionado um valor ao médoto,
            normalmente este método set precisa de um parâmetro a ser passado no exemplo o 'doc'.

            Normalmente quando atribuimos os atributos, para cada um deles definimos os métodos getters
            e setters.

            3° Método Construtor ou 'Construct' : Método que define os atributos padrões no código.

         */


    }


}
