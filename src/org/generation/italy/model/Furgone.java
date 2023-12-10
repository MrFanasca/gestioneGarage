package org.generation.italy.model;

public class Furgone extends Veicolo {
	
	private int capacità;

	public Furgone(int posizione, String marca, int anno, int cilindrata, int capacità) //throws Exception
	{
		super(posizione, marca, anno, cilindrata);
		if (capacità>0)
			this.capacità=capacità;
		/*else 
			throw new Exception("Capacità non valida");*/
	}

	@Override
	public String toString() 
	{
		return "Furgone [Posizione=" + posizione + ", marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata
				+ ", capacità=" + capacità + "]";
	}

	
}
