package es.us.lsi.dad;

public class ActuadorLED {
	private int id;
	private int status;
	private long timestamp = System.currentTimeMillis();
	private double distancia;
	private int placaId;
	/**
	 * @param id
	 * @param status
	 * @param timestamp
	 * @param distancia
	 * @param placaId
	 */
	public ActuadorLED(int id, int status, long timestamp, double distancia, int placaId) {
		super();
		this.id = id;
		this.status = status;
		this.timestamp = timestamp;
		this.distancia = distancia;
		this.placaId = placaId;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the distancia
	 */
	public double getDistancia() {
		return distancia;
	}
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	/**
	 * @return the placaId
	 */
	public int getPlacaId() {
		return placaId;
	}
	/**
	 * @param placaId the placaId to set
	 */
	public void setPlacaId(int placaId) {
		this.placaId = placaId;
	}
	
	

}
