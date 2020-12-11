public class Estante {

    int gavetas;
    int portas;
    int retiraDoc;
    int colocaDoc;
    int totDoc;
    double tamanho;
    String cor;
    String modelo;
    String fabricante;

    void guardarCoisas(){
        totDoc = colocaDoc + totDoc;
        System.out.println("Você adicionou mais "+ colocaDoc+" Documetos a estante.");
    }

    void retirarCoisas(){
        totDoc = totDoc - retiraDoc;
        System.out.println("Removido "+retiraDoc+" Documentos.");
    }


    void totalDocumetos(){
        System.out.println("Total de Documentos: "+totDoc);
    }
}
