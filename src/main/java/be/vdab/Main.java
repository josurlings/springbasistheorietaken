package be.vdab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.entities.Persoon;
import be.vdab.presentation.PersoonViewer;

public class Main 
{

	public static void main(String[] args) 
	{
		List<Persoon> personen = new ArrayList<>();
		
		personen.add(new Persoon(0, "jan", "peeters", 2));
		personen.add(new Persoon(1, "jef", "neven", 0));
		personen.add(new Persoon(2, "bart", "hermans", 3));
		personen.add(new Persoon(3, "annie", "gonzales", 1));
		
		try (ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("container.xml")) 
		{
			PersoonViewer persoonViewer = context.getBean(PersoonViewer.class);
			if (persoonViewer.isAantalKinderenTonen() == true)
			{
				context.getBean(PersoonViewer.class).afbeelden(personen);
			}
			else
			{	
				context.getBean(PersoonViewer.class).afbeelden(personen);
			}
		
		}
	}
	
}
