package com.example.restdemo.model;

public class CloudVendor {
	
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhNum;
	
	public CloudVendor() {
		
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhNum) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhNum = vendorPhNum;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhNum() {
		return vendorPhNum;
	}

	public void setVendorPhNum(String vendorPhNum) {
		this.vendorPhNum = vendorPhNum;
	}
	
	
	
}
