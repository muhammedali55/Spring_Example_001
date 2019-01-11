package com.muhammetalikaya.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="t_owner")
@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pharmaSQ")
	@SequenceGenerator(name="pharmaSQ",sequenceName="pharma_sqeunce")
	private Long id;
	private String ad;
	private String soyad;
	
	@OneToMany(mappedBy="owner")
	private Set<Pharma> pharmas = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Set<Pharma> getPharmas() {
		return pharmas;
	}

	public void setPharmas(Set<Pharma> pharmas) {
		this.pharmas = pharmas;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	
	
	
}
