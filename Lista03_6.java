package ExerciciosForWhile;

import java.util.Scanner;

public class Lista03_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma=0, contNum=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			if(num%3 == 0 && num != 0) {
				suma += num;  //suma = suma + num
				contNum ++;
			}
	
		}while(num != 0);
		
		media = (float) suma/contNum;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: "+media);
	}

}
