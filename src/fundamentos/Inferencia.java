 package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; //declaração e inicialização da variável
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		double d; // variável declarada
		d = 123.456; // variável inicializada
		System.out.println(d); // variável usada
		
		var e = 123.456;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01;  // erro pois não se trata de um inteiro
		System.out.println(f);
	}

}
