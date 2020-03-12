class IMC{
	public static void main (String[]args){
		double peso = 75;
		double altura= 1.70;
		
		double Imc= peso/ Math.pow(altura,2);
		System.out.println("\n\t seu indicie de massa corporal:" + Imc);
		
		if(Imc < 17){
			System.out.println("\n\t vai comer caraio");
		}else{
			if((Imc >= 17) && (Imc < 18.5)){
				System.out.println("\n\t pode comer BEEM");
			}else{
				if((Imc>=18.5) && (Imc<25)){
					System.out.println("\n\t MAntem irmao, vai tranquilo");
				}else{
					if((Imc>=25) && (Imc < 30)){
						System.out.println("\n\t Da uma segurda irmao");
					}else{
						if((Imc>=30) && (Imc < 35)){
						System.out.println("\n\t Da uma segurda irmao, voce ta obeso nivel1");
					}else{
						if((Imc>=35) && (Imc < 40)){
							System.out.println("\n\t da uma segurada truta, Voce va morer porra");
						}else{
							System.out.println("\n\t Voce va morer porra, para de comer caraio");
						}
					}
				}
			}
		}
	}
}
}