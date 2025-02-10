//LUCAS DE MOURA FRANCISCO
//RU:3767463
package ProjetoCofrinho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao;   // variável usada para armazenar a opção selecionada pelo usuário no menu.
		Scanner teclado = new Scanner(System.in); // lê a entrada do teclado
		
		Estoque estoque = new Estoque(); // Cria e gerencia o estoque de moedas
		
		System.out.println("Menu");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("0-Encerrar");
		opcao = teclado.nextInt(); // Lê o número digitado pelo usuário e armazena na variável opcao.
		
		//Declarações das variáveis
		int tipoDinheiro;
		double valor;
		Moeda Dinheiro;
		while (opcao != 0) {
			
			switch(opcao) {  // Executa a operação escolhida pelo usuário
			
			case 1: // Adiciona valor,tipo de moeda e país.
			
				tipoDinheiro=0;
				while (tipoDinheiro<1 || tipoDinheiro>3) {
					
					System.out.println("1-Real");
					System.out.println("2-Dolár");
					System.out.println("3-Euro");
					tipoDinheiro = teclado.nextInt();
				    if (tipoDinheiro < 1 || tipoDinheiro > 3) {
				        System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
				    }
				    
				}
				System.out.println("Por favor, use a vírgula (,) como separador decimal.");
				System.out.println("Quanto deseja depositar?");
				valor = Validador.validarDouble(teclado); //Verifica se o valor digitado pelo usuário é um valor válido.
				Dinheiro=null; 
				
				if (tipoDinheiro==1) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					Dinheiro = new Real(valor, "Real", pais);
				}
				
				if (tipoDinheiro==2) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					
					double valorReal = valor * Conversor.TaxaDolar; // Usando a taxa de conversão do Dólar
					System.out.println("Valor do Dolár em Real: " + valorReal);
					Dinheiro = new Dolar(valor, "Dolar", pais);
				}
				if (tipoDinheiro==3) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					double valorReal = valor * Conversor.TaxaEuro; // Usando a taxa de conversão do Dólar
					System.out.println("Valor em Real: " + valorReal);
					Dinheiro = new Euro(valor, "Euro", pais);
				}
				estoque.adicionar(Dinheiro);
				break;
				
				
			case 2: // Remove o valor,tipo de moeda e país.
				
				tipoDinheiro=0;
				while (tipoDinheiro<1 || tipoDinheiro>3) {
					System.out.println("Por favor, use a vírgula (,) como separador decimal.");
					System.out.println("1-Real");
					System.out.println("2-Dolár");
					System.out.println("3-Euro");
					tipoDinheiro = teclado.nextInt();
				    if (tipoDinheiro < 1 || tipoDinheiro > 3) {
				        System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
				    }
				    
				}
				System.out.println("Quanto deseja remover?");
				valor = Validador.validarDouble(teclado);//Verifica se o valor digitado pelo usuário é um valor válido.
				Dinheiro=null; 
				
				if (tipoDinheiro==1) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					Dinheiro = new Real(valor, "Real", pais);
				}
				
				if (tipoDinheiro==2) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					
					double valorReal = valor * Conversor.TaxaDolar; // Usa a taxa de conversão do Dólar.
					System.out.println("Valor do Dolár em Real: " + valorReal);
					Dinheiro = new Dolar(valor, "Dolar", pais);
				}
				if (tipoDinheiro==3) {
					
					System.out.println("Informe o país da moeda:");
					teclado.nextLine();
					String pais = teclado.nextLine();
					double valorReal = valor * Conversor.TaxaEuro; // Usa a taxa de conversão do Euro.
					System.out.println("Valor em Real: " + valorReal);
					Dinheiro = new Euro(valor, "Euro", pais);
				}
				
				estoque.remover(Dinheiro);
				
				break;
				
				
			case 3: 
				estoque.listar(); // Opção para listar as moedas e valores no estoque.
				break;
			
			default:
				System.out.println("Opção Inválida");
			
			}
			
			// Exibe o menu novamente para o usuário escolher outra opção
			System.out.println("Menu");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("0-Encerrar");
			opcao = teclado.nextInt(); 
		}
		// Fechando o scanner
	    teclado.close();
		
	}

}
