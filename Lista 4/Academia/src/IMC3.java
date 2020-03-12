
public class IMC3 {
	
	private String nome;
	private double peso, altura;
	private int dia, mes, ano;
		public IMC3(String nome, int dia, int mes, int ano) {
			this.nome = nome;
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
		}
		public IMC3(String nome) {this.nome=nome;}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
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

		public double getPeso() {
			return peso;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double cauculaimc() {
			return(peso/ Math.pow(altura,2));
		}
		public boolean verifica() {
			if(cauculaimc() < 25) {
				return true;
			}else {
				return false;
			}
		}
}
