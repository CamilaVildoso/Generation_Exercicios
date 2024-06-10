package ExerciciosForWhile;

import java.util.Scanner;

public class Lista01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contImpar=0, contPar=0;
		int cont;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(cont=1; cont < 11; cont++) {
			System.out.println("\nDigite o "+cont+"° número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		
		System.out.println("\nTotal de números pares: "+contPar);
		System.out.println("\nTotal de números ímpares: "+contImpar);	

	}

}
