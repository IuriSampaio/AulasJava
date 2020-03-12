package br.com.ABC;

public class Academia2 {
	public static void main(String[] args) {
		IMC2 pessoa = new IMC2("piroquinha", 80, 1.80);
		pessoa.setDia(20);
		pessoa.setMes(9);
		pessoa.setAno(2010);
		System.out.println("NOME:"+ pessoa.nome );
		System.out.println("Data de Nascimento:"+pessoa.getDia()+"/"+pessoa.getMes()+"/"+pessoa.getAno());
		System.out.println("IMC:"+pessoa.cauculaimc());
		if(pessoa.estadopessoa()) {
			System.out.println("continua seu treino normalmente");
		}else{
			System.out.println("acima do peso, converse com seu nuticionista..");
		}
	}
}
