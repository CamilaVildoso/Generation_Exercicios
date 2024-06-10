package ExerciciosForWhile;

import java.util.Scanner;

public class Lista02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, contMenor=0, contMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if(idade < 22) {
				contMenor++;
			}else if(idade > 50) {
				contMaior++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contMaior);

	}

}
