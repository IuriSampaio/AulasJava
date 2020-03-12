class Exercicio9 {
  public static void main(String[]args) {
    double valor=150;//$
    double desconto=20;//%
    double valordesc=(valor*desconto)/100;//$
    double total= valor-valordesc;//$

      System.out.println("\n\tCompra: R$" + valor);
       System.out.println("\n\tDesconto[%]:" + desconto+"%" );
       System.out.println("-----------------------------------------");
       System.out.println("\n\tTotal a pagar: R$" + total);


  }
}
