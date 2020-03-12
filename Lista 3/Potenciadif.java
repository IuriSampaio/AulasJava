import java.util.Scanner;
class Potenciadif{
  public static void main(String[] args){
    Scanner ler =new Scanner(System.in);
      System.out.println("\t base: ");
      int base = ler.nextInt();
      System.out.println("\t exp: ");
      int exp = ler.nextInt();

    int pot = 1;

    if(exp == 0){
      System.out.println( base + "^" + exp + "= 1");
      System.exit(0);//para acabar com o teste//
    }else{

      for(int expo=0; expo < exp; expo++){
        pot *= base;

    }  System.out.println( base + "^" + exp + "=" + pot);

    }

  }
}
