import java.util.Scanner;
  class Autenticacao{
    public static void main(String[] args) {
    Scanner ler =new Scanner(System.in);

    String usuario = "iuri";
    String senha1 = "123";

    int tentativas = 3;

    while(true){
      System.out.println("\n Usuario: ");
      String usu = ler.next();
      System.out.println("\n Senha: ");
      String senha = ler.next();

      if(usu.equals( usuario ) && senha.equals(senha1)){
        System.out.println("\nSEJA BEM VINDO " + usuario + "!!!");
        System.exit(0);//tambem poderia ser break para encerrar o programa //mas essa é melhor pra acabar com tduo///
      }
      else{
        tentativas -- ;
        if(tentativas == 2 ){
          System.out.println("\n ************* VOCE ERROU PORAAAAAA, TEM MAIS " +  tentativas + " tentativas *******************");
        }
        else{
          if(tentativas == 1){
            System.out.println("\n ************* VOCE ERROU PORAAAAAA, TEM MAIS " +  tentativas + " tentativa *******************");
          }
          else{
            System.out.println("\n SE FUDEU OTARIO");
            break;
          }
        }
        }
      }
    }
  }
