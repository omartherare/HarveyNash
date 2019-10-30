package Auto;

public class Waterton {
		
		private double capaciteit, inhoud;
		
		public Waterton(double capaciteit) {
			this.capaciteit=capaciteit;
			inhoud=0;
		}
		
		public Waterton(double capaciteit, double inhoud) {
			this.capaciteit=capaciteit;
			this.inhoud=inhoud;
		}

		public double getCapaciteit() {
			return capaciteit;
		}

		public void setCapaciteit(double capaciteit) {
			this.capaciteit = capaciteit;
		}

		public double getInhoud() {
			return inhoud;
		}

		public void setInhoud(double inhoud) {
			this.inhoud = inhoud;
		}
		
		public boolean opvangenWater() {
			if(inhoud>=capaciteit) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public double aftappenWater(double hoeveelheid) {
			if(inhoud>=hoeveelheid) {
				inhoud-=hoeveelheid;
				return inhoud;
			}
			else {
				return 0;
			}
		}

		@Override
		public String toString() {
			return "Waterton [capaciteit=" + capaciteit + ", inhoud=" + inhoud + "]";
		}
		
		
	

}
