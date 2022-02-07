import java.util.Scanner;

class VolumeCubo {
	
	public static void main(String[] args) {
		
		float lado;
		float resposta;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Informe o lado: ");
		lado = scan.nextFloat();
		
		resposta = (lado * lado * lado);
		System.out.println("O volume do cubo: " + resposta); 
	}

}