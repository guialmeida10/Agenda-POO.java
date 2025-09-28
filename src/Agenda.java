public class Agenda {
    public Pessoa[] cardeneta;


    // Método
    public Agenda(){
        cardeneta = new Pessoa[50];

    }

    // Método
    public void adicionarPessoa(Pessoa p){
        for(int i = 0; i<50; i++){
            if(cardeneta[i]==null){
                cardeneta[i] = p; // p = objeto que está como parâmetro
                break;
        }
    }
}

    // Método
    public void imprimirAgenda(){
        for(Pessoa p: cardeneta){
            if(p!=null){
                p.imprimirPessoa();
            }
        }
    }

}
