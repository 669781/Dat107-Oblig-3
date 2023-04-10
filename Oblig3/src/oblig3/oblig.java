package oblig3;


public class oblig {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
		
		private int ansattNr;
		private String brukernavn;
		private String fornavn;
		private String etternavn;
		private String ansattDato;
		private String stilling;
		private long mndLonn;
		
		
		public oblig (int nr, String brukernavn, String fornavn, String etternavn, String ansattDato, String stilling, long lønn){
			ansattNr = nr;
			this.brukernavn = brukernavn;
			this.fornavn = fornavn;
			this.ansattDato = ansattDato;
			this.stilling = stilling;
			mndLonn = lønn;
			
		}
		@Override
		
		
		public String toString() {
			return "Ansatt [ansattNr=" + ansattNr + ", brukernavn=" + brukernavn + ", fornavn=" + fornavn
					+ ", etternavn=" + etternavn + ", ansattDato=" + ansattDato + ", stilling=" + stilling
					+ ", mndLønn=" + mndLonn + "]";
		}
		private int getAnsattNr() {
			return ansattNr;
		}
		private void setAnsattNr(int ansattNr) {
			this.ansattNr = ansattNr;
		}
		private String getBrukernavn() {
			return brukernavn;
		}
		private void setBrukernavn(String brukernavn) {
			this.brukernavn = brukernavn;
		}
		private String getFornavn() {
			return fornavn;
		}
		private void setFornavn(String fornavn) {
			this.fornavn = fornavn;
		}
		private String getEtternavn() {
			return etternavn;
		}
		private void setEtternavn(String etternavn) {
			this.etternavn = etternavn;
		}
		private String getAnsattDato() {
			return ansattDato;
		}
		private void setAnsattDato(String ansattDato) {
			this.ansattDato = ansattDato;
		}
		private String getStilling() {
			return stilling;
		}
		private void setStilling(String stilling) {
			this.stilling = stilling;
		}
		private long getMndLønn() {
			return mndLonn;
		}
		private void setMndLønn(long mndLønn) {
			this.mndLonn = mndLønn;
		}
		
	
}
