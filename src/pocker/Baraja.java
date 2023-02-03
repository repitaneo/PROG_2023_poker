package pocker;


/**
 * 
 * @author Raúl UO296213@uniovi.es
 *
 */
public class Baraja
{
	private Carta[] cartas;
	
	
	
	/**
	 * 
	 * 
	 */
	public Baraja()
	{
		generarBaraja();
	}
	
	
	
	
	public void generarBaraja()
	{
		cartas = new Carta[54];
		int posicion = 0;
		char[] palos = { 'P', 'C', 'T', 'R' };
		
		cartas[posicion++] = new Carta("Jo", true);
		cartas[posicion++] = new Carta("Jo", true);
		
		for (int i = 0; i < palos.length; i++)
		{
			char palo = palos[i];
			cartas[posicion++] = new Carta("A" + palo, true);
			
			for(int j = 2; j <= 10; j++)
			{
				cartas[posicion++] = new Carta("" + j + palo, true);
			}
			
			cartas[posicion++] = new Carta("J" + palo, true);
			cartas[posicion++] = new Carta("Q" + palo, true);
			cartas[posicion++] = new Carta("K" + palo, true);
		}
	}
	
	
	
	
	public Carta darCarta()
	{
		Carta cartaEncontrada = null;
		int posicion = (int)(Math.random() * cartas.length);
		boolean encontrada = false;
		int intentos = 0;
		
		while(!encontrada && intentos < cartas.length)
		{
			if(cartas[posicion].isEnBaraja())
			{
				cartaEncontrada = cartas[posicion];
				cartaEncontrada.setEnBaraja(false);
				encontrada = true;
			}
			else
			{
				posicion++;
				if(posicion == 54)
					posicion = 0;
				intentos++;
			}
		}
		
		
		return cartaEncontrada;
	}
	
	
	
	
	@Override
	public String toString()
	{
		String output = "Cartas en la baraja: [";
		
		for (int i = 0; i < cartas.length; i++) {
			if(cartas[i].isEnBaraja())
			{
				if(i == cartas.length - 1)
					output += cartas[i].toString();
				else
					output += cartas[i].toString() + ", ";
			}
		}
		
		return output + "]";
	}
}
