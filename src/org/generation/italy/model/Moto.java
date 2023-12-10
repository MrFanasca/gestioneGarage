package org.generation.italy.model;

public class Moto extends Veicolo {

	private int tempi;

	public Moto(int posizione, String marca, int anno, int cilindrata, int tempi) //throws Exception
	{
		super(posizione, marca, anno, cilindrata);
		if (tempi==2 || tempi==4)
			this.tempi = tempi;
		/*else
			throw new Exception("Tempi non validi");*/
	}

	@Override
	public String toString() 
	{
		return "Moto [Posizione=" + posizione + ", marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata + ", tempi=" 
				+ tempi + "]";
	}
	
	
	
}
