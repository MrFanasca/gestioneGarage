package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.Auto;
import org.generation.italy.model.Furgone;
import org.generation.italy.model.Moto;
import org.generation.italy.model.Veicolo;

public class Garage {

	private ArrayList <Veicolo> veicoliPresenti = new ArrayList <>();
	int[] numeri=new int[10];
	// immissione di un nuovo veicolo
	public boolean aggiungiAuto (String marca, int anno, int cilindrata, int porte, String alimentazione) throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<15)
		{
			veicoliPresenti.add(new Auto(marca, anno, cilindrata, porte, alimentazione));
			esito=true;
		}
		return esito;	
	}
	
	public boolean aggiungiFurgone (String marca, int anno, int cilindrata, int capacità) throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<15)
		{
			veicoliPresenti.add(new Furgone(marca, anno, cilindrata, capacità));
			esito=true;
		}
		return esito;
	}
	
	public boolean aggiungiMoto (String marca, int anno, int cilindrata, int tempi) throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<15)
		{
			veicoliPresenti.add(new Moto(marca, anno, cilindrata, tempi));
			esito=true;
		}
		return esito;
	}
	
	// estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
	
	
	// stampa della situazione corrente dei posti nel garage veicolo
}
