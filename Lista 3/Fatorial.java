import java.util.Scanner;
class Fatorial{
  public static void main(String[] args){
    Scanner ler =new Scanner(System.in);

    int n =0;

      while (true){
          System.out.println("\t determinar o fatorial de: ");
           n = ler.nextInt();
        if(n >=0) {
          break;
        }
      }
      long fatorial = 1L;

      for (int i=2; i <= n ; i++){
      fatorial *= i;

    }System.out.println(n +"! ="+ fatorial);
    }
    }
