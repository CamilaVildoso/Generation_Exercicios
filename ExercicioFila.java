package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> clientes = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\nMenu:");
			System.out.println("\n************************************************:");
			System.out.println("1 - Adicionar Cliente na fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("\n************************************************:");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch(opcao) {
            
            case 1:
            	System.out.println("\nDigite o nome do cliente: \n");
            	String nomeCliente = leia.nextLine();
            	clientes.add(nomeCliente);
            	
            	System.out.println("\nFila: \n");
            	for (String cliente : clientes) {
                    System.out.println(cliente);
                }
            	System.out.println("\nCliente Adicionado!");
                break;
             
            case 2:
            	System.out.println("\nLista de Clientes na fila: \n");
                for (String cliente : clientes) {
                    System.out.println(cliente);
                }
                
                break;
            case 3:
            	 if (clientes.isEmpty()) {
                     System.out.println("\nA Fila está vazia!");
                 } else {
                     String clienteRetirado = clientes.poll();
                     System.out.println("\nFila: \n");
                     for (String cliente : clientes) {
                         System.out.println(cliente);
                     }
                     
                     System.out.println("\nO Cliente foi Chamado!");
                 }
            	 
                 break;
            
            case 0:
            	System.out.println("Programa Finalizado!");
                break;
                
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
            
            }
		}while(opcao != 0);

	}

}
