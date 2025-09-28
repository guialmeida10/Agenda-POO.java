public class Pessoa { // Vetor de objetos
    public String nome;
    public Contato[] contatos;


    // Método
    public Pessoa(){
        nome = "";
        contatos = new Contato[6];
    }

    //Método                     //Objeto
    public void adicionarContato(Contato c){
        for(int i = 0; i<6; i++){
            if(contatos[i] == null){
                contatos[i] = c;
                break;
            }
        }
    }

    //Método
    public void imprimirPessoa(){
        System.out.println("Nome:" + nome);
        for(int i = 0; i<6; i++){
            if(contatos[i] != null){
                System.out.println(contatos[i].retornaDados());
                
            }
        }
    }




}
