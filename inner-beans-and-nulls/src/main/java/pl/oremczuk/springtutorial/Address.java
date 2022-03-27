package pl.oremczuk.springtutorial;

public class Address {

	private String locality;
	private String zipCode;
	private String streetName;
	private int streetNumber;
	
	public Address(String locality, String zipCode, String streetName, int streetNumber) {
		this.locality = locality;
		this.zipCode = zipCode;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
	}

	@Override
	public String toString() {
		return "Address [locality=" + locality + ", zipCode=" + zipCode + ", streetName=" + streetName
				+ ", streetNumber=" + streetNumber + "]";
	}
	
	
	
}
