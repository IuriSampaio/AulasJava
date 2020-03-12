package br.com.ABC;

public class IMC {
	String nome;
	private double peso;
	private double altura;
	//*********************COM CONSTRUTOR*****************************
	public IMC(String nome, double peso, double altura) {
		this.nome=nome;
		this.altura=altura;
		if(peso< 30) {System.out.println("ta usando crack?");System.exit(0);}
		else{this.peso=peso;}
		return;
	}
	//********************** AQUI ACABA O CONTRUTOR NOIA*************
	public double cauculaimc() {
		return(peso/ Math.pow(altura,2));
	}
	public boolean estadopessoa() {
		boolean estado =true;
		if(cauculaimc() < 25) {
		}else {
			estado=false;;
		}
		return estado;
	}
}
	// MESMO PROGRAMA MAS ESSE AQUI FOI FEITO COM GET´S E SET´S ********
	
	//public String getNome() {
		//return nome;
	//}
	//public void setNome(String nome) {
	//	this.nome = nome;
	//}
	//public IMC(String nome) {
	//	this.nome = nome;
	//}
	//public double getPeso() {
		//return peso;
	//}
	//public void setPeso(double peso) {
		//if(peso>=30) {
		//this.peso = peso;
//	}else {
	//	System.out.println("POR FAVOR PARE DE USAR CRACK");
		//System.exit(0);;
//	}}
	//public double getAltura() {
		//return altura;
	//}
	//public void setAltura(double altura) {
		//this.altura = altura;
	//}
	
