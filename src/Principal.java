import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        int opcao = 0 ;
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println(" 1 - Cadastrar pessoa\n 2 - Inserir Contato em Pessoa\n 3 - Imprimir uma Pessoa\n 4 - Imprimir Agenda \n 5 - Excluir \n 0 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1: {

                    //INSTANCIAR
                    Pessoa pe = new Pessoa();
                    System.out.println("Digite o nome da pessoa: ");
                    pe.nome = leitor.next();
                    int opcao2 = 0 , i = 0;

                    do { 
                    System.out.println("Digite o tipo de contato (e-mail, celular, etc): ");
                    String tipo = leitor.next();

                    System.out.println("Digite o "+tipo+" do contato: ");
                    String valor = leitor.next();


                    Contato c = new Contato(tipo, valor);
                    pe.adicionarContato(c);

                    System.out.println("Deseja cadastrar novo contato? 1-SIM - 0-NAO ");
                    opcao2 = leitor.nextInt();
                    i++;
                    if(i==6)
                      System.out.println("Nao existem mais posições para serem cadastradas!");
                    } while ((opcao2!=0) && (i<6));
                    agenda.adicionarPessoa(pe);
                    break;
                }

                case 2:{
                    int posicao = 0;
                    System.out.println("Digite a posicao do vetor de Pessoa");
                    posicao = leitor.nextInt();
                                       // dado    dado     vetor    dado
                    int opcao2 = 0, i = agenda.cardeneta[posicao].contatos.length;

                    do { 
                        System.out.println("Digite o tipo de contato (e-mail, celular, etc): ");
                    String tipo = leitor.next();

                    System.out.println("Digite o "+tipo+" do contato: ");
                    String valor = leitor.next();

                    
                    Contato c = new Contato(tipo, valor);
                    agenda.cardeneta[posicao].adicionarContato(c);
                    System.out.println("Deseja cadastrar novo contato? 1-SIM - 0-NAO ");
                    opcao2 = leitor.nextInt();

                    i++;
                    if(i==6)
                     System.out.println("Nao existem mais posicoes para serem cadastradas!");
                
                    } while ((opcao2!=0) && (i<6));
                    break;
                }

                case 3:{
                    //FORMA 1 - PELA POSICAO
                    System.out.println("Deseja pesquisar pela posicao do vetor ou pelo nome? 1-POSICAO 2-NOME");
                    int opcao2 = leitor.nextInt();
                
                    if(opcao2==1) {
                        int posicao = 0;
                        for(int i = 0; i<agenda.cardeneta.length; i++){
                            if(agenda.cardeneta[i]!=null){
                                System.out.println("Posicao: " + i + " - "+ agenda.cardeneta[i].nome);
                                System.out.println("Digite a posicao do vetor: ");
                                posicao = leitor.nextInt();
                                agenda.cardeneta[posicao].imprimirPessoa();
                        }
                    }
                    
                } else if (opcao2==2) {
                     //FORMA 2 - PELO NOME
                        System.out.println("Digite o nome a ser pesquisado: ");
                        String nome = leitor.next();
                        for( int i = 0; i<agenda.cardeneta.length; i++){
                            if(agenda.cardeneta[i]!=null)
                            // Agenda //Pessoa  //Str //Boolean //Str
                            if(agenda.cardeneta[i].nome.equals(nome)){
                                agenda.cardeneta[i].imprimirPessoa();
                                break;
                            }
                        }
                }
                    break;
                }
                
                case 4:{
                    agenda.imprimirAgenda();
                    break;
                }
            
                case 5:{

                    System.out.println("Digite o nome da pessoa a ser excluida: ");
                    String nome = leitor.next();

                    for(int i = 0; i < agenda.cardeneta.length; i++) {
                        if(agenda.cardeneta[i].nome != null)
                            if(agenda.cardeneta[i].nome.equals(nome)) {
                                agenda.cardeneta[i] = null;
                                break;
                            }
                    }
                    break;
                }
        }
     } while (opcao != 0);

        leitor.close();
    
}
    
}