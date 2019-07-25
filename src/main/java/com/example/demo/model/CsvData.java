package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class CsvData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}


	public CsvData(Long id, String signUpDate, String first, String last, String email, String latitude,
			String longitude, String ip) {
		super();
		this.id = id;
		SignUpDate = signUpDate;
		this.first = first;
		this.last = last;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.ip = ip;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "SignUpDate", nullable = true)
    private String SignUpDate;
	
	@Column(name = "First", nullable = true)
    private String first;
	
	@Column(name = "Last", nullable = true)
    private String last;
	
	@Column(name = "Email", nullable = true)
    private String email;
    
	@Column(name = "Latitude", nullable = true)
    private String latitude;
	
	@Column(name = "Longitude", nullable = true)
    private String longitude;
	
	@Column(name = "Ip", nullable = true)
    private String ip;
	
	@Override
    public String toString() {
        return "Data [date=" + SignUpDate + ", price=" + first + ", author=" + last
                + "]";
    }

	
	public String getSignUpDate() {
		return SignUpDate;
	}

	public void setSignUpDate(String signUpDate) {
		SignUpDate = signUpDate;
	}

	public String getFirst() {
		return first;
	}

	public CsvData(String signUpDate, String first, String last, String email, String latitude, String longitude,
			String ip) {
		
		SignUpDate = signUpDate;
		this.first = first;
		this.last = last;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.ip = ip;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
