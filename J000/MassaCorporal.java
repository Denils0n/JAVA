//Índice de Massa Corporal (peso dividido pelo quadrado da altura)
class MassaCorporal {
	
	public static void main(String[] args) {
		
		float peso = 65;
		float altura = 1.66f;
		float resultado = 0;

		resultado = peso/(altura*altura);

		if (resultado < 18.5 ) {
			
			System.out.println("Magreza");

		}else if (resultado >= 18.5 && resultado < 24.9) {
			
			System.out.println("Normal");

		}else if (resultado >= 25 && resultado < 29.9) {
			
			System.out.println("Sobrepeso");

		}else if (resultado >= 30 && resultado < 39.9 ) {
			
			System.out.println("Obesidade");

		}else{

			System.out.println("Obesidade Grave");
		}

	}

}