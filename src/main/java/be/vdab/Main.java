package be.vdab;

import java.io.IOException;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.presentation.PersoonViewer;
import be.vdab.presentation.PresentationConfig;
import be.vdab.repositories.RepositoriesConfig;
import be.vdab.services.ServicesConfig;

public class Main 
{

	public static void main(String[] args) throws BeansException, IOException 
	{
	
		/*
		List<Persoon> personen = new ArrayList<>();
		
		personen.add(new Persoon(0, "jan", "peeters", 2));
		personen.add(new Persoon(1, "jef", "neven", 0));
		personen.add(new Persoon(2, "bart", "hermans", 3));
		personen.add(new Persoon(3, "annie", "gonzales", 1));
	
		try (ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("container.xml")) 
		{
	//		PersoonViewer persoonViewer = context.getBean(PersoonViewer.class);
	//		persoonViewer.afbeelden(personen);
		*/
		try (AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(RepositoriesConfig.class,
				ServicesConfig.class, PresentationConfig.class))
		{
			context.getBean(PersoonViewer.class).afbeelden(); 
		}
	}
	
}
