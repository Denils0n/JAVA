class PerimetroCirculo {
	
	public static void main(String[] args) {
		
		float pi = 3.14f;
		float raio = 5;
		float perimeto = 0;

		perimeto = Math.round((2*pi)*raio);

		System.out.println("O perimetro: " + perimeto);

	}

}