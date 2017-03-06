package be.vdab.presentation;

import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonViewer 
{

	private boolean aantalKinderenTonen;
	
	public void afbeelden(List<Persoon> personen) 
		{
		personen.forEach(persoon -> System.out.println(persoon.toString())); 
		
		}

	public boolean isAantalKinderenTonen() {
		return aantalKinderenTonen;
	}

	public void setAantalKinderenTonen(boolean aantalKinderenTonen) {
		this.aantalKinderenTonen = aantalKinderenTonen;
	}
			
}

