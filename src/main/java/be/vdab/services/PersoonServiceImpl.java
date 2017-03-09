package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.entities.Persoon;
import be.vdab.repositories.PersoonRepository;

//@Service
class PersoonServiceImpl implements PersoonService 
{

	private final PersoonRepository persoonRepository;
//	public PersoonServiceImpl(@Qualifier("TXT") PersoonRepository persoonRepository)
	PersoonServiceImpl(PersoonRepository persoonRepository)
	{
	this.persoonRepository = persoonRepository;
	}
	@Override
	public List<Persoon> findAll() throws IOException {
	return persoonRepository.findAll();
	}
	
}
