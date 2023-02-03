package pocker;

public class Start
{

	public static void main(String[] args)
	{
		Baraja baraja = new Baraja();
		System.out.println(baraja);
		
		Carta carta = null;
		
		for(int i = 0; i <= 54; i++)
		{
			carta = baraja.darCarta();
			System.out.println(carta);
			System.out.println(baraja);
		}
	}

}
