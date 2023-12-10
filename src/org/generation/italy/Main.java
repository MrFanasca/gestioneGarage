package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) /*throws Exception*/ {
		/* Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
			il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di capienza può ospitare 
			solo auto moto e furgoni partendo dalla classe base veicolo a motore V; la si estenda, realizzando anche le classi che 
			modellano le entità furgone (F) auto (A) e moto (M).
			Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la 
			riguardano.
			Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
			1] immissione di un nuovo veicolo
			2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
			3] stampa della situazione corrente dei posti nel garage veicolo:
			   -marca,anno,cilindrata;
			   -auto:porte, alimentazione (diesel/benzina)
			   -moto:tempi
			   -furgone:capacità */
		
		Scanner sc = new Scanner (System.in);
		Garage g = new Garage();
		
		String risposta, marca, alimentazione;
		int anno, cilindrata, porte, tempi, capacità, i=3, posizione;
		
		
		
			
			System.out.println("_*_*_Benvenuto nel garage_*_*_");
			
			do
			{
				System.out.println("\n\nCosa vorresti fare");
				System.out.println("1 - Registrare un nuovo veicolo");
				System.out.println("2 - Cancellare un veicolo dal registro");
				System.out.println("3 - Controllare la situazione corrente");
				risposta=sc.nextLine();
				switch (risposta)
				{
				case "1":	// immissione di un nuovo veicolo
					System.out.println("\nInserire la marca del veicolo");
					marca=sc.nextLine();
					System.out.println("Inserire l'anno di immatricolazione del veicolo");
					anno=Integer.parseInt(sc.nextLine());
					System.out.println("Inserire la cilindrata del veicolo");
					cilindrata=Integer.parseInt(sc.nextLine());
					System.out.println("Inserisci la tipologia del veicolo (auto/furgone/moto)");
					risposta=sc.nextLine();
					switch (risposta)
					{
					case "auto":	// registrazione auto
						System.out.println("Inserire il numero di porte dell'auto");
						porte=Integer.parseInt(sc.nextLine());
						System.out.println("Inserire il tipo di alimentazione dell'auto");
						alimentazione=sc.nextLine();
						if (!g.aggiungiAuto(i, marca, anno, cilindrata, porte, alimentazione))
							System.out.println("Il garage è pieno");
						break;
						
					case "furgone":	// registrazione furgone
						System.out.println("Inserire la capacità del vano del furgone in litri");
						capacità=Integer.parseInt(sc.nextLine());
						if (!g.aggiungiFurgone(i, marca, anno, cilindrata, capacità))
							System.out.println("Il garage è pieno");
						break;
						
					case "moto":	// registrazione moto
						System.out.println("Inserire il numero di tempi del motore della moto");
						tempi=Integer.parseInt(sc.nextLine());
						if (!g.aggiungiMoto(i, marca, anno, cilindrata, tempi))
							System.out.println("Il garage è pieno");
						break;
						
					default:
						System.out.println("Opzione non valida");
						break;
					}
					i++;
					break;
					
				case "2":	// estrazione dal garage del veicolo che occupa un determinato posto
					System.out.println("Inserisci la posizione del veicolo che vuoi togliere dal garage?");
					posizione=Integer.parseInt(sc.nextLine());
					if (g.estraiVeicolo(posizione))
						System.out.println("Operazione riuscita");
					else
						System.out.println("Operazione non riuscita");
					break;
					
				case "3":	// stampa della situazione corrente dei posti nel garage
					System.out.println(g.toString());
					break;
					
				default:
					System.out.println("Opzione non valida");
					break;
				}
				System.out.println("Desideri fare altro? (s/n)");
				risposta=sc.nextLine();
			}	while (risposta.equalsIgnoreCase("s"));
			
			System.out.println("Arrivederci");
		sc.close();
	}

}
