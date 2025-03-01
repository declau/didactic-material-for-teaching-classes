package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de um funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println(numerosDeVoos / 2 );
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}

}
