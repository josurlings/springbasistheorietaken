package be.vdab.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import be.vdab.repositories.PersoonRepository;

@Configuration
@ComponentScan
public class ServicesConfig 
{
	@Bean
	PersoonService persoonService(
	@Qualifier("TXT") PersoonRepository persoonRepository) {
	return new PersoonServiceImpl(persoonRepository);
	}
}
