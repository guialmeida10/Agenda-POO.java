public class Contato {
    
    public String tipoContato;
    public String informacao;


    //Construtor é sempre publico
    public Contato(String tipoContato, String informacao){
        this.tipoContato = tipoContato;
        this.informacao = informacao;
    }

    // Método
    public String retornaDados(){
        String retorno = " Contato "+tipoContato +"\n - " + informacao;
        return retorno;
    }
}
