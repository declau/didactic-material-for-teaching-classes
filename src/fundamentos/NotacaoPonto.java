package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		// String não é um tipo primitivo como exemplos anteriores(double)
		String s = "palavra";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("palavra", "palavrinha");
		System.out.println(s);
		
		s= s.concat("!!!!");
		System.out.println(s);
		
		System.out.println("DEC".toLowerCase());
		
		//Tipos primitivos não tem o operador "."

	}
}
