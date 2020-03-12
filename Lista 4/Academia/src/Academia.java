import java.util.Scanner;
public class Academia {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("qual seu nome ?");
		String nome = ler.nextLine();
		IMC3 pessoa = new IMC3(nome);
		System.out.println("Qual o seu peso?");
		double peso = ler.nextDouble();
		IMC3 pesop= new IMC3(peso);
		System.out.println("qual sua altura ?");
		double altura = ler.nextDouble();
		IMC3 alturaa= new IMC3(altura);
		
		System.err.println("Nome:"+ pessoa.getNome());
		System.out.println("Data do nascimento:"+ pessoa.getDia()+"/"+pessoa.getMes()+"/"+pessoa.getAno());
		System.out.println("peso: "+ pessoa.getPeso());
		System.out.println("Altura: "+ pessoa.getAltura());
		if(pessoa.verifica()) {
			System.err.println("ta a pamapa ");
		}else {
			System.err.println("CUIDE-SE");
		}
	}
} 