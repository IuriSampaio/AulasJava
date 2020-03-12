class Exercicio8 {
  public static void main(String[] args) {
    int numero1 = 4;
    int numero2 = 9;
    System.out.println("1 variavel= " + numero1);
    System.out.println("2 variavel= " + numero2);
    int variavelAuxiliar = 0;
    variavelAuxiliar = numero1;
    numero1 = numero2;
    numero2 = variavelAuxiliar;
    System.out.println("1 variavel= " + numero1);
    System.out.println("2 variavel= " + numero2);
  }
}
