package be.vdab.services;

import java.util.List;

import be.vdab.entities.Persoon;
import be.vdab.repositories.PersoonRepository;

public class PersoonServiceImpl implements PersoonService 
{

	private PersoonRepository repository;
	
		
	public PersoonServiceImpl(PersoonRepository repository) 
	{
		this.repository = repository;
	}

	@Override
	public List<Persoon> findAll()
	{
		return repository.findAll();
	}

}
