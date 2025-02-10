//LUCAS DE MOURA FRANCISCO
//RU:3767463
package ProjetoCofrinho;

import java.util.Scanner;
//Classe para verificar se o valor digitado pelo usuário no console é válido
public class Validador {
    public static double validarDouble(Scanner teclado) {
        boolean valorValido = false; //Quando o resultado = true, significa que o valor digitado pelo usuário é considerado válido;
        double valor = 0; //Pega o valor digitado pelo usuário;
        while (!valorValido) { // Enquanto o valor digitado pelo usuário não for válido continua o loop;
            System.out.println("Digite um valor:");
            if (teclado.hasNextDouble()) {
                valor = teclado.nextDouble(); //Verifica se o valor digitado é um Double;
                valorValido = true;
            } else {
                System.out.println("Por favor, digite um valor válido.");
                teclado.next();
            }
        }
        return valor;
    }
}

