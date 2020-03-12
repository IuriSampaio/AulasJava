// Informa se um número é ou não primo

import javax.swing.JOptionPane;

class PrimoVer4 {
  public static void main(String[] args) {
    int numero = 0;
    while (true) {
      numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro maior que [1]: "));
      if (numero > 1) {
        break;
      }
    }
    boolean referencia = true;
    int i = 0;
    String texto = "";
    for ( i=2 ; i < numero/2+1 ; i++) {
      if (numero % i == 0) {
        referencia = false;
        texto += i;
        texto += "  ";
      }
    }
    if (referencia) {
      JOptionPane.showMessageDialog(null, numero + " eh primo.");
    }
    else {
      JOptionPane.showMessageDialog(null, numero + " nao eh primo, pois eh divisivel por:\n" + texto);
    }
  }
}
