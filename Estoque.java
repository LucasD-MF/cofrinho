//LUCAS DE MOURA FRANCISCO
//RU:3767463
package ProjetoCofrinho;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();// Armazena as moedas do cofrinho;

    public void adicionar(Moeda m) { //Permite adicionar uma moeda ao cofrinho;
        listaMoeda.add(m);
        System.out.println("");
        System.out.println("Valor Adicionado!");
        System.out.println("");

    }
    
    public void remover(Moeda m) { //Permite remover uma moeda do cofrinho;
        listaMoeda.remove(m);
        System.out.println("");
        System.out.println("Valor removido!");
        System.out.println("");
    }
    	
    public void listar() { 
        // Variáveis para calcular o valor total no cofrinho;
        double valorTotalReal = 0.0;
        double valorTotalDolar = 0.0;
        double valorTotalEuro = 0.0;
        
        // Lista todas as moedas no cofrinho
        System.out.println("Lista de moedas no cofrinho:");
        for (Moeda m : listaMoeda) { 
            // Pega os resultados dos valores
            System.out.println("Moeda: " + m.getNome() + ", País: " + m.getPais());
            System.out.println("Valor: " + m.getValor());

            // Verifica se a moeda é Real, Dólar ou Euro e atualiza os totais correspondentes
            if (m instanceof Real) {
                valorTotalReal += m.getValor();
            } else if (m instanceof Dolar) {
                valorTotalDolar += m.getValor();
            } else if (m instanceof Euro) {
                valorTotalEuro += m.getValor();
            }
        }

        // Calcula o valor total convertendo os valores em Dólar e Euro para Reais
        double valorTotal = valorTotalReal + Conversor.converterDolarParaReal(valorTotalDolar) + Conversor.converterEuroParaReal(valorTotalEuro);
        
        // Exibe os resultados
        System.out.println("Valor total depositado em Dólar: " + valorTotalDolar);
        System.out.println("Valor total depositado em Euro: " + valorTotalEuro);
        System.out.println("Valor total depositado em Real: " + valorTotalReal);
        System.out.println("Valor total do cofrinho (com conversão para reais): " + valorTotal);
    }
    
}



