package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.Auto;
import org.generation.italy.model.Furgone;
import org.generation.italy.model.Moto;
import org.generation.italy.model.Veicolo;

public class Garage {

	private ArrayList <Veicolo> veicoliPresenti = new ArrayList <>()
			{{
				add(new Auto(0, "Audi", 2005, 1600, 5,"diesel"));
				add(new Furgone(1, "Volswagen", 1994, 2000, 1800));
				add(new Moto(2, "Ducati", 2023, 1000, 4));
			}};

	// immissione di un nuovo veicolo
	public boolean aggiungiAuto (String marca, int anno, int cilindrata, int porte, String alimentazione) //throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<=15)
		{
			veicoliPresenti.add(new Auto(veicoliPresenti.size(), marca, anno, cilindrata, porte, alimentazione));
			esito=true;
		}
		return esito;	
	}
	
	public boolean aggiungiFurgone (String marca, int anno, int cilindrata, int capacità) //throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<=15)
		{
			veicoliPresenti.add(new Furgone(veicoliPresenti.size(), marca, anno, cilindrata, capacità));
			esito=true;
		}
		return esito;
	}
	
	public boolean aggiungiMoto (String marca, int anno, int cilindrata, int tempi) //throws Exception
	{
		boolean esito=false;
		if (veicoliPresenti.size()<=15)
		{
			veicoliPresenti.add(new Moto(veicoliPresenti.size(), marca, anno, cilindrata, tempi));
			esito=true;
		}
		return esito;
	}
	
	// estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
	public boolean estraiVeicolo (int posizione)
	{
		boolean esito=false;
		if (posizione>=0 && posizione<15)
		{
			System.out.println(posizione);
			veicoliPresenti.remove(posizione);
			esito=true;
		}
		return esito;
	}

	// stampa della situazione corrente dei posti nel garage veicolo
	@Override
	public String toString() {
		return "Garage [veicoliPresenti=" + veicoliPresenti + "]";
	}
	
	
}
