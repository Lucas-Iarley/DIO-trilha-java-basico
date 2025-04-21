

public class EstruturadeRepeticao{

	public static void main(String[] args) {
		
		//laço For
		//sintaxe: for(condição){expressão};

		//teste: Contador de carneirinhos, joão precisa contar ate 20 carneiros para dormir

		for (int carneiros = 0;	carneiros <=20; carneiros++){
			System.out.println("são "+carneiros+" carneirinhos");
		};

		//outro exemplo interagendo com arrays e coleções

		String alunos[] =  {"felipe","jonas", "julia","marcos"};

		for(int x =0; x < alunos.length; x++){
			System.out.println("O aluno no indice x="+x+" é "+ alunos[x]);
			//o laço irá percorrer cada item do array de acordo com o valor x e printar a tela
		}




	}
}