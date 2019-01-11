package com.muhammetalikaya.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="t_pharma")
@Entity
public class Pharma {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pharmaASQ")
	@SequenceGenerator(name="pharmaASQ",sequenceName="pharma_sqeunce_P")
	private Long id;
	private String ilacAdi;
	private Date uretimTarihi;
	
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIlacAdi() {
		return ilacAdi;
	}

	public void setIlacAdi(String ilacAdi) {
		this.ilacAdi = ilacAdi;
	}

	public Date getUretimTarihi() {
		return uretimTarihi;
	}

	public void setUretimTarihi(Date uretimTarihi) {
		this.uretimTarihi = uretimTarihi;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "pharma [id=" + id + ", ilacAdi=" + ilacAdi + ", uretimTarihi=" + uretimTarihi + ", owner=" + owner
				+ "]";
	}
	
	
}
