package br.com.ABC;

public class IMC2 {
	String nome;
	private double peso;
	private double altura;
	private int dia;
	private int mes;
	private int ano;
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public IMC2(String nome, double peso, double altura) {
		this.nome=nome;
		this.altura=altura;
		if(peso< 30) {System.out.println("ta usando crack?");System.exit(0);}
		else{this.peso=peso;}
		return;
	}
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
