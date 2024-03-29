import java.util.Scanner;// Pacote de classes para métodos de entrada de dados
public class Main {
  public static void main(String[] args) {
    
    System.out.println(""); //Inserir linha em branco
    
    System.out.println("<<Atividade de produção POO - CÓDIGO INICIAL>>\n\n**Aluno: Jeferson da Silveira Rosa - Matrícula: 202221001**\n");
    
    System.out.println("**Link Replit: https://replit.com/@jsrgodoy/AtividadeProducaoPOO#Main.java**\n"); //Inseirir o link para acessar o código
 System.out.println("*****************************************************\n");
                           
    Scanner scan = new Scanner(System.in);// Método de entrada de dados
    System.out.println("Escolha seu personagem: **Estrutura de decisão switch para escolha no menu**\n\n1 - Vilão **Esta opção inicia a instância no Método main e chama a Classe Personagem*\n2 - Dragão **Esta opção inicia a instância no Método main e chama a Classe Dragão**\n3 - Cavaleiro **Esta opção inicia a instância no Método main e chama a Classe Cavaleiro com alteração no ID**\n4 - Mago **Esta opção inicia a instância no Método main e chama a Classe Mago**");
    int escolha = scan.nextInt();

    switch(escolha) { //Declarar uma condicional switch para não usar muitos IFs
      case 1: { 
          Personagem p = new Personagem(1); // Cria uma instância da Superclasse Personagem
    p.imprimeDados();
        p.atuar(0);       
        }
        break;
      case 2:{
          Dragao d1 = new Dragao(2, "Tiamat"); // cria uma instância da classe Dragão
    d1.atuar(0);
        }
        break;
      case 3:{
          int id = 1001; //Altera o id para os 4 digitos finais da minha Matrícula
    Cavaleiro c1 = new Cavaleiro(id, "Eric"); // cria uma instância da classe Cavaleiro
    c1.atuar(0);
        }
        break;
      case 4:{
          
     Mago m1 = new Mago(4, "Presto"); //  cria uma instância da classe Mago
    m1.atuar(0);
        }
        break;
      default: 
        System.out.println("Opção inválida!");
        
    }  }  }
