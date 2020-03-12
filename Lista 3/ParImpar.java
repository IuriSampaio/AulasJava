import java.util.Scanner;
class ParImpar{
	public static void main (String[] args){
  Scanner ler = new Scanner(System.in);
	while(true){
	System.out.println("digite um numero: ");
	int n=ler.nextInt();

	if(n % 2 != 0){
	System.out.println(n + " e impar");
	} else{
	System.out.println(n + " e par");
	}

	System.out.println("continuar? [s/N]");
		String op = ler.next();
	if(! (op.equals( "s" ))) {
	break;
	}
	}
	}
	}
