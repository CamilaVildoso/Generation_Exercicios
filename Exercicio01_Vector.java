package ExerciciosVecMatriz;

import java.util.Scanner;

public class Exercicio01_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int x, num;
		boolean valorVector = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que voce deseja encontrar: ");
		num = leia.nextInt();
		
		for(x=0; x < 10; x++) {
			
			if (num == vetor[x]) {
				System.out.println("\nO número "+num+" está localizado na posicao: "+x);
				valorVector = true;
			} 
			
		}
		if (valorVector == false) {
			System.out.println("\nO numero "+num+" nao foi encontrado!");
		}

	}

}
