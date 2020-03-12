import java.util.Scanner;
class Fibonachi{
  public static void main(String[] args){
    Scanner ler =new Scanner(System.in);
      System.out.println("\t determinar fibonachi quantas vezes: ");
      int qnt= ler.nextInt();
      int n1 = 1;
      int n2 = 1;
      System.out.println(n1);
      System.out.println(n2);
      for (int i = 2 ; i<qnt ; i++) {
        int n3 = n2+n1;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
      }
}}
