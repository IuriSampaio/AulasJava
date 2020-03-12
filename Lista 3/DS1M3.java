import java.util.Scanner;
class DS1M3{
  static char ch = '\u2588';
  public static void main(String[]args){

  Scanner ler =new Scanner(System.in);
  System.out.println("\n Escreva um frase: ");
  String frase = ler.nextLine();
   escrevecarai(frase);
  }
  //metodo para criar uma barra para moldura de uma farse
  public static void criarbarra(String frase){
    for (int i = 0 ; i< frase.length()+17 ; i ++){
      System.out.print(ch);
    }
  }
  //metodo para frase
  public static void escrevecarai(String frase){
      criarbarra(frase);
      System.out.println();
      System.out.println(ch + "       "+ frase +"        "+ ch);
      criarbarra(frase);
  }
}
