package fundamentos;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.12345; // conversão explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.0;
		int f = (int) e; // conversão explícita (CAST)
		System.out.println(f);
		

	}

}
