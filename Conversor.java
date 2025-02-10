package ProjetoCofrinho;

public class Conversor {

	public static final double TaxaDolar = 5.0; //Define a taxa do valor do Dolar em 5 reais.
	public static final double TaxaEuro = 6.0;  //Define a taxa do valor do Euro em 6 reais.

		//Cálculo para reais
    public static double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * TaxaDolar;
    }

    public static double converterEuroParaReal(double valorEmEuro) {
        return valorEmEuro * TaxaEuro;
    }
}
