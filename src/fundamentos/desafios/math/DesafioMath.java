package fundamentos.desafios.math;

public class DesafioMath {

	public static void main(String[] args) {
		double num1 = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double num3 = num1 / denA;
		
		double num4 = Math.pow(((1 - 5) * ( 2 - 7)) / 2, 2);
		
		double num5 = Math.pow(num3 - num4, 3);
		double inferior = Math.pow(10, 3);
		
		double result = num5 / inferior;
		System.out.println(result);
		
	}

}
