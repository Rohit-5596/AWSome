package com.ta.backend.entity;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@SequenceGenerator(name = "seq_business", initialValue=12001)
@Table(name="businessuser_data")
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_business")
	@Column(name="employer_id",length = 5)
	private int employerId;
	
	@NotNull
	@Pattern(regexp="^[a-zA-Z]{1,50}")
	@Column(name="employer_name", length=50)
	private String employerName;
	
	@NotNull
	@Column(name="address", length=100)
	private String address;
	
	@NotNull
	@Column(name="city", length=10)
	private String city;
	
	@NotNull
	@Column(name="state", length=10)
	private String state;
	
	@NotNull
	@Column(name="pincode", length=6)
	private int pincode;
	
	@NotNull
	@Pattern(regexp="^[a-zA-Z ]{1,50}")
	@Column(name="contact_name", length=50)
	private String contactName;
	
	@NotNull
	@Column(name="ph_no", length=10)
	private long phNo;
	
	@NotNull
	@Column(name="business_type",length=2)
	private int businessType;
	
	@NotNull
	@Column(name="tan_no",length=10)
	private long tanNo;
	
	@NotNull
	@Column(name="regn_no",length=10)
	private long regnNo;
	
	@Column(name="creation_date", columnDefinition = "TIMESTAMP")
	@CreationTimestamp
	private Timestamp creationDate;
	
	@Column(name="last_modified_date", columnDefinition = "TIMESTAMP")
    @UpdateTimestamp
	private Timestamp lastModifiedDate;
	
	

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public int getBusinessType() {
		return businessType;
	}

	public void setBusinessType(int businessType) {
		this.businessType = businessType;
	}

	public long getTanNo() {
		return tanNo;
	}

	public void setTanNo(long tanNo) {
		this.tanNo = tanNo;
	}

	public long getRegnNo() {
		return regnNo;
	}

	public void setRegnNo(long regnNo) {
		this.regnNo = regnNo;
	}
	
	public Timestamp getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	
	public Timestamp getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	

	public Employer(int employerId, String employerName, String address, String city, String state, int pincode,
			String contactName, long phNo, int businessType, long tanNo, long regnNo, Timestamp lastModifiedDate) {
		super();
		this.employerId = employerId;
		this.employerName = employerName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.contactName = contactName;
		this.phNo = phNo;
		this.businessType = businessType;
		this.tanNo = tanNo;
		this.regnNo = regnNo;
		this.creationDate =  Timestamp.from(Instant.now());
		this.lastModifiedDate = lastModifiedDate;
	}

	public Employer() {
		super();
	}

	@Override
	public String toString() {
		return "BusinessUser [employerId=" + employerId + ", employerName=" + employerName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode
				+ ", contactName=" + contactName + ", phNo=" + phNo + ", businessType=" + businessType + ", tanNo="
				+ tanNo + ", regnNo=" + regnNo + ",creationDate=" + creationDate +" "
						+ ",creationDate=" + creationDate +"]";
	}
	
	
	

}
