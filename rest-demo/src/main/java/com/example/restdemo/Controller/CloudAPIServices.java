package com.example.restdemo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/cloudvendor")

public class CloudAPIServices {
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		return cloudVendor;
				//new CloudVendor("c1","sai","hyd","3243234");
	}
	
	@PostMapping 
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		
		return "Cloud Vendor Created successfuly";		
	}
	
	@PutMapping
	
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		
		return "cloud Vendor Updated SucessFully";
	}
	
	@DeleteMapping("{vendorId}")
	public String DeleteVendorDetails(String vendorId)
	{
		this.cloudVendor=null;
		return "CloudVendor deleted";
	}
	
	
	//maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.

}
