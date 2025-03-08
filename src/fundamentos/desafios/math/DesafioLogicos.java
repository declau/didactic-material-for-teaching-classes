package fundamentos.desafios.math;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50 polegadas? " + comprouTv50); 
		System.out.println("Comprou TV de 32 polegadas? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		System.out.println("Mais Saudável? " + maisSaudavel);
		
		

	}

}
