import javax.swing.JOptionPane;
class Primo3{
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
	         for(int k = 2 ; k < n ; i= i*i){

          JOptionPane.showMessageDialog(null, n + " nao e primo, pois e divisvel por "+ i );
           }
        }}
            JOptionPane.showMessageDialog(null, n + "e Primo");

  }
}
