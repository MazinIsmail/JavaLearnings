package com.oops.inheritance;

public class Address {

	private int streetNumber;
	private String streeName;
	private String postalCode;
	private String stateOrProvince;
	private String country;

	public Address() {
		super();
	}

	public Address(int streetNumber, String streeName, String postalCode, String stateOrProvince, String country) {
		super();
		this.streetNumber = streetNumber;
		this.streeName = streeName;
		this.postalCode = postalCode;
		this.stateOrProvince = stateOrProvince;
		this.country = country;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreeName() {
		return streeName;
	}

	public void setStreeName(String streeName) {
		this.streeName = streeName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streeName=" + streeName + ", postalCode=" + postalCode
				+ ", stateOrProvince=" + stateOrProvince + ", country=" + country + "]";
	}

}
