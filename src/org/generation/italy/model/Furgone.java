package org.generation.italy.model;

public class Furgone extends Veicolo {
	
	private int capacità;

	public Furgone(String marca, int anno, int cilindrata, int capacità) throws Exception
	{
		super(marca, anno, cilindrata);
		if (capacità>0)
			this.capacità=capacità;
		else 
			throw new Exception("Capacità non valida");
	}

	@Override
	public String toString() 
	{
		return "Furgone [marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata
				+ ", capacità=" + capacità + "]";
	}

	
}
