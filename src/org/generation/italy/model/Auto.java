package org.generation.italy.model;

public class Auto extends Veicolo {
	
	private int porte;
	private String alimentazione;
	
	public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) throws Exception 
	{
		super(marca, anno, cilindrata);
		if (porte<=5 || porte>=3)
			this.porte = porte;
		else 
			throw new Exception("Porte non valide");
		if (alimentazione.equals("disiel")||alimentazione.equals("benzina"))
			this.alimentazione = alimentazione;
		else 
			throw new Exception("Alimentazione non valida");
	}
	
	@Override
	public String toString() 
	{	
		return "Auto [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",porte=" + porte + ",alimentazione=" + alimentazione + "]";
	}
}
