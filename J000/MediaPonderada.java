class MediaPonderada{


	public static void main(String[] args) {
		
		int peso1 = 4;
		int peso2 = 6;
		float nota1 = 8;
		float nota2 = 10;
		float resultado = 0;

		resultado = ((peso1*nota1) + (peso2*nota2))/(peso1+peso2);
		System.out.println("Media ponderada: " + resultado);



	}

	
}