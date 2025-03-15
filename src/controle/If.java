package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = entrada.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aluno aprovado!");
			System.out.println("Parabés!");
		} else if (media >= 5.0 && media < 7) {
			System.out.println("Aluno em recuperação!!!");
			
		} else 
			System.out.println("Aluno reprovado!!!!");
		entrada.close();
		

	}

}
