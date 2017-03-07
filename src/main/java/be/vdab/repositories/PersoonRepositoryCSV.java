package be.vdab.repositories;

import java.io.File;
import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonRepositoryCSV implements PersoonRepository
{

	private File bestand;
	
		
	public PersoonRepositoryCSV(File bestand)
	{
		this.bestand = bestand;
	}


	@Override
	public List<Persoon> findAll() 
	{
		return null;
	}


	public File getBestand() {
		return bestand;
	}
		
}
