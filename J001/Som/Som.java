class Som {
	
	int volume;
	boolean interferencia;
	boolean ligado;

	public void Tocar(){

		if (this.ligado == true) {
			
			if (this.interferencia == true) {
				
				System.out.println("O audio esta tocando com interferencia");

			}else{

				System.out.println("O audio esta tocando mas nao tem interferencia");

			}

		}


	}


}