package es.us.lsi.dad;

public class SensorDistancia {
	//DIST-IR
	private  Integer IdSensorDistancia;
	private  String status;
	private  Long timeStamp;
	private  double Centimetros;
	private  Integer idPlaca;
	
	


	public SensorDistancia(Integer idSensorDistancia, String status, Long timeStamp, double centimetros,
			Integer idPlaca) {
		super();
		this.IdSensorDistancia = idSensorDistancia;
		this.status = status;
		this.timeStamp = timeStamp;
		this.Centimetros = centimetros;
		this.idPlaca = idPlaca;
	}


	public Integer getIdSensorDistancia() {
		return IdSensorDistancia;
	}


	public void setIdSensorDistancia(Integer idSensorDistancia) {
		IdSensorDistancia = idSensorDistancia;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Long getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}


	public double getCentimetros() {
		return Centimetros;
	}


	public void setCentimetros(double centimetros) {
		Centimetros = centimetros;
	}


	public Integer getIdPlaca() {
		return idPlaca;
	}


	public void setIdPlaca(Integer idPlaca) {
		this.idPlaca = idPlaca;
	}
	
	
	
	
	
	


}
