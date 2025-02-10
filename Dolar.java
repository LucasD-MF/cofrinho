//LUCAS DE MOURA FRANCISCO
//RU:3767463
package ProjetoCofrinho;

public class Dolar extends Moeda {//Atributos referentes ao nome e país de origem da moeda Dolar;
    private String nome;
    private String pais;

    public Dolar(double valor, String nome, String pais) { //Construtor do Dolar;
        super(valor);
        this.nome = nome;
        this.pais = pais;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getPais() {
        return pais;
    }
    
    @Override
    public String toString() {
        return String.format("Moeda: %s, País: %s", nome, pais);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}
    
    
    
}