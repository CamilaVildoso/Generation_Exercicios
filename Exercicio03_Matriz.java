package ExerciciosVecMatriz;

public class Exercicio03_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] diagonal = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int linha, coluna, somaPrimaria = 0, somaSecundaria = 0;
		
		System.out.println("\nElementos da Diagonal Principal: ");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					somaPrimaria += diagonal[linha][coluna];
					System.out.print(diagonal[linha][coluna]+" ");
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("\nElementos da Diagonal Secundaria: ");
		
		for (linha = 0; linha < 3; linha++) {
	        for (coluna = 0; coluna < 3; coluna++) {
	            if (linha + coluna == 2) {
	                somaSecundaria += diagonal[linha][coluna];
	                System.out.print(diagonal[linha][coluna]+" ");
	            }
	        }
	    }
		
		System.out.println(" ");
		System.out.println("\nSoma dos Elementos da Diagonal"
				+ "\nPrincipal: ");
		System.out.println(somaPrimaria);
		
		System.out.println("\nSoma dos Elementos da Diagonal"
				+ "\nSecundária: ");
		System.out.println(somaSecundaria);
	}

}
