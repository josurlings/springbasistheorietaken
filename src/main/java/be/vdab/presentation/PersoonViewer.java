package be.vdab.presentation;

import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonViewer 
{

	
	public void afbeelden(List<Persoon> personen) 
		{
		personen.forEach(persoon -> System.out.println(persoon.toString())); 
		{
		}
		}
}

