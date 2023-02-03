package pocker;



public class Carta
{
	
	
	private String valor;
	private boolean enBaraja;
	
	public boolean isEnBaraja() {
		return enBaraja;
	}

	public void setEnBaraja(boolean enBaraja) {
		this.enBaraja = enBaraja;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Carta(String valor, boolean enBaraja)
	{
		this.valor = valor;
		this.enBaraja = enBaraja;
	}
	
	@Override
	public String toString()
	{
		return valor;
	}
}
