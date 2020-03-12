import java.util.Scanner;
class DS1M2{
  public static void main(String[]args){
  Scanner ler =new Scanner(System.in);
  System.out.println("\n Escreva um frase: ");
  String texto = ler.nextLine();

   char ch = '\u2588';

   for (int i = 0 ; i < texto.length()+13 ; i++){
   System.out.print(ch);
   }
    System.out.println("\n" + ch +"      "+ texto +"     "+ ch);

      for (int i = 0 ; i < texto.length()+13 ; i++){
        System.out.print(ch);
      }
  }
}
