package be.vdab.presentation;

import java.util.List;

import be.vdab.entities.Persoon;
import be.vdab.services.PersoonService;

public class PersoonViewer 
{

	/*
	
	private boolean aantalKinderenTonen;
	
	public PersoonViewer(boolean aantalKinderenTonen)
	{
		this.aantalKinderenTonen = aantalKinderenTonen;
	}
	
	
	public void afbeelden(List<Persoon> personen) 
		{
		personen.forEach(persoon -> System.out.println(persoon.toonPersoon(aantalKinderenTonen))); 
		
		}

	public boolean isAantalKinderenTonen() {
		return aantalKinderenTonen;
	}

	public void setAantalKinderenTonen(boolean aantalKinderenTonen) {
		this.aantalKinderenTonen = aantalKinderenTonen;
	}
	
	*/
	
	private PersoonEigenschap[] eigenschappen;
	private PersoonService service;
	
	public PersoonViewer(PersoonEigenschap[] eigenschappen, PersoonService service)
	{
		this.eigenschappen = eigenschappen;
		this.service = service;
	}

/*
	public PersoonViewer(PersoonEigenschap[] eigenschappen)
	{
		this.eigenschappen = eigenschappen;
	}
*/	
	
	public void afbeelden(List<Persoon> personen) 
		{
		// personen.forEach(persoon -> System.out.println(persoon.toonPersoon(eigenschappen))); 
		personen.forEach(persoon -> persoon.toonPersoon(this.eigenschappen)); 
		
		}

	public PersoonEigenschap[] getEigenschappen() {
		return eigenschappen;
	}

	public PersoonService getService() {
		return service;
	}
					
}

