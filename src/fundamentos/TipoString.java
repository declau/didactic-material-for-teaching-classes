package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Hello people".charAt(0));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.substring(4, 9));

	}

}
