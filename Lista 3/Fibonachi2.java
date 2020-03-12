import java.util.Scanner;
class Fibonachi2{
  public static void main(String[] args){
    Scanner ler =new Scanner(System.in);
      System.out.println("\t determinar fibonachi quantas vezes: ");
      int qnt= ler.nextInt();
      int n1 = 1;
      int n2 = 1;
      double n3 = n2/n1;
      System.out.println(n1);
      System.out.println(n2);
      for (int i = 2 ; i<qnt ; i++) {
        int n4 = n2+n1;
        double n5 = 1.618;
      System.out.println(n2);
      System.out.println(n4);
      System.out.println(n5);
      n1 = n2;
      n2 = n4;
      }
}}
