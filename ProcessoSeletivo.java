/* -- PROJETO PARA TREINO --

CASO 1 - Um processo seletivo que tem como valor base salarial de R$ 2000,00
         e o salário pretendido pelo candidato. Os requisitos são:
         - se o valor base for maior que o valor salario pretendido,
           "Ligar para o candidato", caso não imprima "AGUARDANDO OS DEMAIS CANDIDATOS"
		 - Se o valor base for igual, imprima " Ligar para o candidato com contra proposta"

CASO 2 - Foi solicitado que nosso sistema garanta que diante das inúmeras 
		 candidaturas sejam selecionados apenas 5 candidatos no máximo

CASO 3 - Imprimir a lista de candidatos selecionados para disponbilizar para o RH entrar em contato 

CASO 4 - O RH deverá realizar uma ligação com no máximo 3 tentativas
		para cada candidato selecionado, caso não atenda, deve-se imprimir:
		"CONSEGUIMOS CONTATO COM [CANDIDATO]" APÓS [N° TENTATIVA] TENTATIVA(S)
		do contrário: "NÃO CONSEGUIMOS CONTATO COM O [CADIDATO]"


*/

import java.util.concurrent.ThreadLocalRandom; // PARA GERAR UM N° ALEATORIO

import java.util.ArrayList;// para gerar e manipular lista sem valor fixo
import java.util.Random;

public class ProcessoSeletivo{

	public static void main(String[] args) {
		//caso 1
		analisarCandidato(2000.00);
		analisarCandidato(1000.00);
		analisarCandidato(2500.00);

		//caso 2 e 3
		selecaoCandidatos();

		
		


	}



	// ------ Resolvendo o Case 1 ------

	static void analisarCandidato(double salarioPretendido){
		double salarioBase = 2000.00;

		if(salarioBase > salarioPretendido){

			System.out.println("Ligar para o candidato");

		} else if (salarioBase == salarioPretendido){

			System.out.println("Ligar para o candidato com contra proposta");

		}else{

			System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");

		}
		
		
	}

	// ------ RESOLVENDO O CASE 2 -----------

	static void selecaoCandidatos(){

		String candidatos[] = {"Manoel","Gabriel","Paulo","Raul","Monica","Beatriz", "Carlos", "Ana","livia","Lucas","john"};
		double salarioBase = 2000.00;
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		ArrayList<String> Listadecandidatos = new ArrayList<>();
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
			
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();


			System.out.println("O candidato "+candidato+" solicitou este valor: "+ salarioPretendido);
			
				if (salarioBase >= salarioPretendido){

					System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
				candidatosSelecionados++;
				//adicionando os candidatos selecionados na lista para o RH
				Listadecandidatos.add(candidato);

					}

			candidatosAtual++;
			System.out.println(candidatosSelecionados);
			System.out.println(candidato);
		}

		// Mostrando a lista para o RH
		System.out.println(Listadecandidatos);

		for(String candidato: Listadecandidatos){

			ligacao(candidato);
		}
			

		}

		
	


		//método auxiliar
	static double valorPretendido(){
		//gerando aleatoriamente os valores pretendidos de cada candidato
		return ThreadLocalRandom.current().nextDouble(1800.00, 2500.00);




		

	}



	//----- ATENDENDO O CASO 4 --------

	static void ligacao(String candidato){
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do{
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando){
					tentativasRealizadas++;
			}else{
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}

		}while(continuarTentando && tentativasRealizadas <3);
		if(atendeu){
			System.out.println("CONSEGUIMOS CONTATO COM "+ candidato +" APÓS "+tentativasRealizadas+" TENTATIVA(S)");
		}else{
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O "+candidato);
		}

	}


	static boolean atender(){
		return new Random().nextInt(3)==1;
	}


}