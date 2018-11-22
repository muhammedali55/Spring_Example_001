package com.muhammetalikaya.example.model;

import java.util.Date;

public class Pharma {

	private Long id;
	private String ilacAdi;
	private Date uretimTarihi;
	
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
