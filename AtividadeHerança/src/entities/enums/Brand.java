package entities.enums;

public enum Brand {

	FIAT("FIAT"),
	FORD("FORD"),
	HONDA("HONDA");
	
	private String value;
	
	private Brand(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
