class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;


	public void rabiscar(){


		if (this.tampada == false) {
			
			System.out.println("to rabiscando");

		} else {

			System.out.println("A caneta esta tampada");

		}
	}
	public void tampar(){

		this.tampada = true;


	}

	public void destampar(){


		this.tampada = false;

	}



}