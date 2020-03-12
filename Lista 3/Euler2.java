import java.util.Scanner;
class Euler2{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    while(true){
    System.out.println("\t Determine um numero para o valor do euler equivalente:");
    double x = ler.nextDouble();

    double n = 1 + (1 / x)  ;
    double e = Math.pow(n,x);

    System.out.println("\t O valor de e equivalente: "+ e);

    System.out.println("\t Quer realizar outro cauculo amiginho [s/N]? ");
    String cont= ler.next();

    if(! (cont.equals( "s" ))){
      break;
    }
  }
  }
}
