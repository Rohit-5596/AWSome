package com.ta.backend.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="labourer_data")
@SequenceGenerator(name = "seq_labourer", initialValue=10001)
public class Labourer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_labourer")
	@Column(name="lId",length = 5)
	private int lId;
	
	@Column(name="first_name", length=50)
	private String firstName;
	
	@Column(name="last_name", length=50)
	private String lastName;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="permanent_address", length=10)
	private String permanentAddress ;
	
	@Column(name="city", length=10)
	private String[] city;
	
	@Column(name="state", length=10)
	private String[] state;
	
	@Column(name="pincode", length=6)
	private int pincode;
	
	@Column(name="aadhar", length=12)
	private long aadhar;
	

	@Column(name="pan", length=10)
	private String pan;
	
	@Column(name="skill1", length=2)
	private int skill1;
	
	@Column(name="skill2", length=2)
	private int skill2;
	
	@Column(name="skill3", length=2)
	private int skill3;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="currently_employed")
	private boolean currentlyEmployed;

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	public String[] getState() {
		return state;
	}

	public void setState(String[] state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getSkill1() {
		return skill1;
	}

	public void setSkill1(int skill1) {
		this.skill1 = skill1;
	}

	public int getSkill2() {
		return skill2;
	}

	public void setSkill2(int skill2) {
		this.skill2 = skill2;
	}

	public int getSkill3() {
		return skill3;
	}

	public void setSkill3(int skill3) {
		this.skill3 = skill3;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isCurrentlyEmployed() {
		return currentlyEmployed;
	}

	public void setCurrentlyEmployed(boolean currentlyEmployed) {
		this.currentlyEmployed = currentlyEmployed;
	}

	public Labourer(int lId, String firstName, String lastName, Date dob, String permanentAddress, String[] city,
			String[] state, int pincode, long aadhar, String pan, int skill1, int skill2, int skill3, boolean status,
			boolean currentlyEmployed) {
		super();
		this.lId = lId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.permanentAddress = permanentAddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.aadhar = aadhar;
		this.pan = pan;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.status = status;
		this.currentlyEmployed = currentlyEmployed;
	}

	public Labourer() {
		super();
	}

	@Override
	public String toString() {
		return "GovtUser [lId=" + lId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", permanentAddress=" + permanentAddress + ", city=" + Arrays.toString(city) + ", state="
				+ Arrays.toString(state) + ", pincode=" + pincode + ", aadhar=" + aadhar + ", pan=" + pan + ", skill1="
				+ skill1 + ", skill2=" + skill2 + ", skill3=" + skill3 + ", status=" + status + ", currentlyEmployed="
				+ currentlyEmployed + "]";
	}
	
	

}
