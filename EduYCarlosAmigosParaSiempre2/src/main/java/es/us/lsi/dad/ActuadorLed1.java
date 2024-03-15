package es.us.lsi.dad;

public class ActuadorLed1 {
	private Integer IdActuador1;
	private String Status;
	private Integer value;
	private Long timestamp;
	private Integer IdPlaca;
	
	
	public Integer getIdActuador1() {
		return IdActuador1;
	}
	public void setIdActuador1(Integer idActuador1) {
		IdActuador1 = idActuador1;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getIdPlaca() {
		return IdPlaca;
	}
	public void setIdPlaca(Integer idPlaca) {
		IdPlaca = idPlaca;
	}
	public ActuadorLed1(Integer idActuador1, String status, Integer value, Long timestamp, Integer idPlaca) {
		super();
		IdActuador1 = idActuador1;
		Status = status;
		this.value = value;
		this.timestamp = timestamp;
		IdPlaca = idPlaca;
	}

	
	
}
