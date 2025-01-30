package no.hvl.dat102.filmarkiv.impl;

public class Film {
	private int filmnr; //mulig denne skal være int og ikke data
	private String filmskaper; //filmskaper
	private String tittel; //tittel på film
	private int utgivelse; // år for utgivelse
	private Sjanger sjanger; //sjekk om enum
	private String filmselskap; //filmselskap
	
	
	
	public Film() {
		this(0, "", "", 0, Sjanger.ACTION, "");
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int utgivelse, Sjanger sjanger, String filmselskap ) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.utgivelse = utgivelse;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}
	
	public int getFilmnr() {
		return filmnr;
	}
	public void setFilmnr(int nr) {
		filmnr = nr;
	}
	
	public String getFilmskaper() {
		return filmskaper;
	}
	public void setFilmskaper(String film) {
		filmskaper = film;
	}
	
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String ttl) {
		tittel = ttl;
	}
	public int getUtgivelse() {
		return utgivelse;
	}
	public void setUtgivelse(int utgivelse) {
		this.utgivelse = utgivelse;
	}
	public Sjanger getSjanger() {
		return sjanger;
	}
	public void setSjanger(Sjanger sjnager) {
		this.sjanger = sjanger;
	}
	public String getFilmselskap() {
		return filmselskap;
	}
	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) 
			return true;
		if (o == null || getClass() != o.getClass()) 
			return false;
		Film film = (Film) o;
		return filmnr == film.filmnr;
	}
	@Override
	public int hashCode() {
		return objects.hash(filmnr);
	}
	
	
	
}
