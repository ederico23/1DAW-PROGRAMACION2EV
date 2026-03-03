package olimpiadas;

public class Medallero implements Comparable{
	
	private Integer oro = 0;
	private Integer plata = 0;
	private Integer bronce = 0;
	private String pais;
	
	/**
	 * @param pais
	 */
	public Medallero(String pais) {
		super();
		this.pais = pais;
	}

	/**
	 * @return the oro
	 */
	public int getOro() {
		return oro;
	}

	/**
	 * @return the plata
	 */
	public int getPlata() {
		return plata;
	}

	/**
	 * @return the bronce
	 */
	public int getBronce() {
		return bronce;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	
	public void addOro() {
		oro++;
	}
	
	public void addPlata() {
		plata++;
	}
	
	public void addBronce() {
		bronce++;
	}

	@Override
	public int compareTo(Object o) {
		Medallero m = (Medallero) o;
		
		if (oro!=getOro()) {
			return oro.compareTo(m.getOro());
		} else if (plata!=getPlata()) {
			return plata.compareTo(m.getPlata());
		} else if (bronce!=getBronce()) {
			return bronce.compareTo(m.getBronce());
		} 		
		
		return 0;
	}
	
	
	
	
}
