import java.util.Scanner;
class Euler{
  public static void main(String[] args){
    Scanner ler =new Scanner(System.in);

    System.out.println("\t Determine um numero para o valor do euler equivalente:");
    double x = ler.nextDouble();

    double n = 1 + (1 / x)  ;
    double e = Math.pow(n,x);

    System.out.println("\t O valor de e equivalente: "+ e);
  }
}
