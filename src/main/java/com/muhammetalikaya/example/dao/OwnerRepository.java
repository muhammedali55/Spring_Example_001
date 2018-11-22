package com.muhammetalikaya.example.dao;

import java.util.List;

import com.muhammetalikaya.example.model.Owner;

public interface OwnerRepository {

	List<Owner> hepsiniBul();
	Owner idIleBul(Long id);
	List<Owner> soyadIleGetir(String soyad);
	void ekle(Owner owner);
	Owner guncelle(Owner owner);
	void sil(Long id);
		
	
	
}
