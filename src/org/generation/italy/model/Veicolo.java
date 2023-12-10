package org.generation.italy.model;

public class Veicolo {

	protected String marca;
	protected int anno,cilindrata;
	public Veicolo(String marca, int anno, int cilindrata) throws Exception 
	{
		if (!marca.isEmpty())
			this.marca = marca;
		else 
			throw new Exception("Inserisci il nome della marca");
		if (anno>2023)
			this.anno = anno;
		else 
			throw new Exception("Inserisci un anno valido");
		if (cilindrata<=0)
			this.cilindrata = cilindrata;
		else 
			throw new Exception("Inserisci una cilindrata valida");
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}

}
