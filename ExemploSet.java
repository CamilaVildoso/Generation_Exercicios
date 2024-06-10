package Collections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ExemploSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> valores = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n-----Digite 10 números-----\n");
		
		for(int i=1; i < 11; i++) {
			System.out.println("\nNúmero "+i+" : ");
			int valor = leia.nextInt();
			valores.add(valor);
        }
		
		System.out.println("\nListar datos do Set: \n");
	
	    Iterator<Integer> iterator = valores.iterator();
	    
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
