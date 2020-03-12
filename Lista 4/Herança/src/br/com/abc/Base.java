package br.com.abc;

public class Base {
	public double n1;
	public double n2;
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double soma(){
		return n1+ n2;
	}
	public double subtracao() {
		return n1-n2;
	} 
	public double multiplicacao() {
		return n1*n2;
	}
	public double divisao() {
		if(n2 == 0) {
			return 0;
		}
		return n1/n2;
	}
	
	}