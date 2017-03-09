package be.vdab.presentation;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ImportResource;

import be.vdab.services.PersoonService;

//@ImportResource("classpath:presentation.xml")
public class PresentationConfig 
{
	@Bean
	PersoonViewer persoonViewer(PersoonService persoonService) 
	{
	return new PersoonViewer(new PersoonEigenschap[]
	{
	PersoonEigenschap.VOORNAAM, PersoonEigenschap.FAMILIENAAM,
	PersoonEigenschap.AANTAL_KINDEREN }, persoonService);
	}
}
