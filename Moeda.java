//LUCAS DE MOURA FRANCISCO
//RU:3767463
package ProjetoCofrinho;

public abstract class Moeda { //Guarda o valor na memória
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;	 //Recebe um valor como entrada e atribui esse valor à moeda.

    }

    public double getValor() { //Obtém o valor atual da moeda
        return valor;
    }

    // Método abstrato para obter o nome da moeda
    public abstract String getNome();

    // Método abstrato para obter o país da moeda
    public abstract String getPais();

    
    //Compara os valores selecionados para fazer a remoção corretamente, feito utilizando o genarate equals.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
    
    
    
}