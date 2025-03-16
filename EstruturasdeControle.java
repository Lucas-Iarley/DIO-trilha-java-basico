public class EstruturasdeControle{
	public static void main(String[] args) {

		/*
	símbolos de expressões


		*/
		//estrutura IF else
		int a,b;
		a = 5;
		b = 6;

		String resultado = "";

		/*sintaxe if(parametro)
			retorno caso seja verdadeiro;
		else
		  retorno caso seja falso;
	
	*/
		if(a==b){
			resultado = "verdadeiro";
		}
		else{
			resultado = "falso";
		
}

		System.out.println(resultado);		

		//operador ternário do IF é uma forma abreviada 
		//sintaxe: Expressão condicional> ? <caso seja true> : <caso seja false>
		String outroresultado = a==b?"outro verdadeiro" : "outro falso";

		System.out.println(outroresultado);



		//operadores lógicos
		// && operador "E"
		// || operador "OU"
		//ex:
		boolean condicaoTrue = true;
		boolean condicaoFalse = false;

		if (condicaoTrue && condicaoFalse){
			System.out.println("As duas são true");
		}if(condicaoTrue || condicaoFalse){
			System.out.println("Uma das duas é true");
		}else{
			System.out.println("Nenhuma é true");
		}

		







	}
}