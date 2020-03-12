package br.com.ABC;

public class Academia {
	public static void main(String []args) {
		IMC pessoa1 = new IMC("luqinhas", 100, 1.80);
		
		System.out.println("Nome:"+ pessoa1.nome);
		System.out.println("IMC:"+pessoa1.cauculaimc());
		if(pessoa1.estadopessoa()) {
			System.out.println("Ta tranks quebrada");
		}else {
			System.out.println("vai treinar a noite toda hoje pra emagrecer seu otario");
		} 
		
	}
}
