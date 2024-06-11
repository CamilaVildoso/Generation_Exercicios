package Collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> biblioteca = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\nMenu:");
			System.out.println("\n************************************************:");
			System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("\n************************************************:");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine();
			
            switch(opcao) {
            
            case 1:
            	System.out.println("\nDigite o nome do livro: \n");
            	String nome = leia.nextLine();
            	biblioteca.add(nome);
            	
            	System.out.println("\nPilha: \n");
            	for (String livro : biblioteca) {
                    System.out.println(livro);
                }
            	System.out.println("\nLivro Adicionado!");
                break;
                
            case 2:
            	System.out.println("\nLista de Livros na Pilha: \n");
                for (String livro : biblioteca) {
                    System.out.println(livro);
                }
                
                break;
                
            case 3:
           	 if (biblioteca.isEmpty()) {
                    System.out.println("\nA Pilha está vazia!");
                } else {
                    String livroRetirado = biblioteca.pop();
                    
                    System.out.println("\nPilha: \n");
                    
                    for (String livro : biblioteca) {
                        System.out.println(livro);
                    }
                    System.out.println("\nUm Livro foi retirado da pilha!");
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
