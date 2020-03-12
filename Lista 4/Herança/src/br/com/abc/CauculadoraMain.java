package br.com.abc;

public class CauculadoraMain {
	public static void main(String[]args) {
		Base calc = new Base();
		calc.setN2(5);
		calc.setN1(10);
		System.out.println(calc.getN1()+"+"+calc.getN2()+"="+calc.soma());
		System.out.println(calc.getN1()+"-"+calc.getN2()+"="+calc.subtracao());
		System.out.println(calc.getN1()+"."+calc.getN2()+"="+calc.multiplicacao());
		System.out.println(calc.getN1()+"/"+calc.getN2()+"="+calc.divisao());
		Avancada calca= new Avancada();
		calca.setN1(49);
		calca.setN2(2);
		System.err.println("***************************************Avancado**************************************************************************************************************************");
		System.out.println(calca.getN1()+"+"+calca.getN2()+"="+calca.soma());
		System.out.println(calca.getN1()+"-"+calca.getN2()+"="+calca.subtracao());
		System.out.println(calca.getN1()+"."+calca.getN2()+"="+calca.multiplicacao());
		System.out.println(calca.getN1()+"/"+calca.getN2()+"="+calca.divisao());
		System.out.println(calca.getN1()+"^"+calca.getN2()+"="+ calca.potencia());
		System.out.println("sqrt("+calca.getN1()+") ="+ calca.raiz());
	}
}
