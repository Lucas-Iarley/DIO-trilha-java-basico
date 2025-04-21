import java.util.Locale;
import java.util.Scanner;




public class ContaBancaria{

	public static void main(String[] args) {

		
	double saldo = 10.0;// definindo um saldo inicial
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);// definindo a variavel para capturar o input do usuario




	//informando as opção para o usuario
	System.out.println("Olá! Bem vindo ! Digite o deseja fazer ?: \n-1: Ver Saldo \n-2 Sacar \n-3 Depositar ");


	int opcao = scanner.nextInt();//incluindo a opção do usuario na variavel

		System.out.println("Ok!Você escolheu a opção "+opcao);//informando ao usuario a opção escolhida


	if(opcao == 1){
			System.out.println("Seu saldo é: "+saldo);
			//imprimindo o saldo de acordo com a opção escolhida

	}else if(opcao == 2){
		
			System.out.println("Digite o valor a sacar...");
			double valor = scanner.nextDouble();




			if(valor < saldo){
				double novoSaldo = saldo - valor;
			System.out.println("Seu novo saldo é: "+novoSaldo);

			}else{ System.out.println("Saldo insuficiente para sacar, por favor realize um deposito");};
			
		}else if(opcao ==3){
			System.out.println("Digite um valor que deseja depositar");
			double deposito = scanner.nextDouble();

			 saldo =  saldo+deposito;
			System.out.println("Seu novo saldo é: "+saldo);

		}else {System.out.println("Nenhuma das alternativas acima foi selecionada, por favor tente novamente");};


	}
	

	





	}
