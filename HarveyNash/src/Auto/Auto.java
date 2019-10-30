package Auto;

public class Auto {
	
	private double kilometerteller, inhoudTank, verbruik;
	
	public Auto() {
		kilometerteller=0;
		inhoudTank=0;
		verbruik=4;
	}

	public Auto(double kilomterteller, double inhoudTank, double verbruik) {
		this.kilometerteller=kilomterteller;
		this.inhoudTank=inhoudTank;
		this.verbruik=verbruik;
	}

	public double getKilometerteller() {
		return kilometerteller;
	}

	public void setKilometerteller(double kilometerteller) {
		this.kilometerteller = kilometerteller;
	}

	public double getInhoudTank() {
		return inhoudTank;
	}

	public void setInhoudTank(double inhoudTank) {
		this.inhoudTank = inhoudTank;
	}

	public double getVerbruik() {
		return verbruik;
	}

	public void setVerbruik(double verbruik) {
		this.verbruik = verbruik;
	}
	
	public void vulTank(double capaciteit) {			//niet elk auto heeft dezelfde capaciteit
		inhoudTank=capaciteit;  //moet altijd gevuld zijn tot ze vol is=capaciteit
	}
	
	public double aantalKilometerRijden(double kilometers) {
		kilometers=Math.abs(kilometers); //absolute waarden zodat de kilometers niet naar - kunnen gaan
		double nodigeInhoud=kilometers*verbruik/100;
		
		if(inhoudTank >= nodigeInhoud) {
			kilometerteller += kilometers;
			inhoudTank-=nodigeInhoud;
			return kilometers;
		}
		else {
			double range=inhoudTank/verbruik * 100;  //in km
			kilometerteller+=range;
			inhoudTank=0;
	
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Auto [kilometerteller=" + kilometerteller + ", inhoudTank=" + inhoudTank + ", verbruik=" + verbruik
				+ "]";
	}
}
