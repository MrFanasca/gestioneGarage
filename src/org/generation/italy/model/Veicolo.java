package org.generation.italy.model;

public class Veicolo {

	protected String marca;
	protected int anno,cilindrata;
	public Veicolo(String marca, int anno, int cilindrata) {
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}

}
