package be.vdab.entities;

import be.vdab.presentation.PersoonEigenschap;

public class Persoon 
{
	private final int persoonNr;
	private final String voornaam;
	private final String familienaam;
	private final int aantalKinderen;
	
	public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) 
	{
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}

	public int getPersoonNr() {
		return persoonNr;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public int getAantalKinderen() {
		return aantalKinderen;
	}

	/*
	public String toonPersoon(boolean aantalKinderenTonen)
	{
		if (aantalKinderenTonen == true)
		{
		return "Persoon [persoonNr=" + persoonNr + ", voornaam=" + voornaam + ", familienaam=" + familienaam
				+ ", aantalKinderen=" + aantalKinderen + "]";
		}
		else
		{
			return "Persoon [persoonNr=" + persoonNr + ", voornaam=" + voornaam + ", familienaam=" + familienaam
					+ "]";
		}
	}
	*/
	
	public void toonPersoon(PersoonEigenschap[] eigenschappen)
	{
		System.out.println("\nPersoonNr : " + this.getPersoonNr());
		
		for(PersoonEigenschap eigenschap: eigenschappen)
			{
			
			switch (eigenschap)
			{
			case PERSOON_NR:
				System.out.print("\t" + this.getPersoonNr());
				break;
			case VOORNAAM:
				System.out.print("\t" + this.getVoornaam());
				break;
			case FAMILIENAAM:
				System.out.print("\t"  + this.getFamilienaam());
				break;
			case AANTAL_KINDEREN:
				System.out.print("\t" + this.getAantalKinderen());
				break;
			}
			}
		
	}
				
}
