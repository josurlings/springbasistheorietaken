package be.vdab.entities;

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

	@Override
	public String toString() {
		return "Persoon [persoonNr=" + persoonNr + ", voornaam=" + voornaam + ", familienaam=" + familienaam
				+ ", aantalKinderen=" + aantalKinderen + "]";
	}
	
		
}
