package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cores = new ArrayList();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n---Digite 5 cores---");
		for (int i = 1; i <= 5; i++) { // for normal -> guardar
			System.out.print("Digite o cor " + i + " : ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: \n");
		for(String color : cores) {	// for each -> Imprima 
			System.out.println(color);
		}
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: \n");
		
		for (String color : cores) { // for each -> Imprima
			System.out.println(color);
		}
		
	}

}
