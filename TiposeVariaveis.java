public class TiposeVariaveis {
	public static void main(String[] args) {

		/*
		existem dois tipos de dados
		byte - 1 byte de memória
		short - 2 byte de memoria
		int 4 bytes de memoria
		long - 8 bytes de memoria

		o JDK sempre tenta converter para int dos dados de 2 ou menos de bytes

	*/
		byte idade = 26;
		short ano = 2025;
		int cep = 21070333;
		long cpf = 987632109;
		float pi = 3.14F;
		double salario = 1275.33;

		System.out.println(pi);


		//variaveis constantes
		// por convenção, essas varivaies são feitas em CAIXA ALTA, ex:
		final String nome = "Lucas";

		System.out.println(nome);
		// nome = "Iarley"; dará um erro, error: cannot assign a value to final variable nome
		System.out.println(nome);


		
	}



}
