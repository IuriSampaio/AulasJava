import javax.swing.JOptionPane;
class Primo{
  public static void main(String [] args ){
    //dizer se um numero e ou nao primo//
    int n = 0;
    while(true){
      n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro maior que 1: "));
      if(n > 1){
        break;
      }
    }
      for(int i =2 ; i < n / 2+1 ; i++){
        if(n % i == 0){
          JOptionPane.showMessageDialog(null, n + " nao é primo");
          System.exit(0);
        }}
            JOptionPane.showMessageDialog(null, n + "e Primo");

  }
}
