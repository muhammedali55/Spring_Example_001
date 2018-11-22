package com.muhammetalikaya.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhammetalikaya.example.dao.OwnerRepository;
import com.muhammetalikaya.example.exceptions.OwnerNotFoundException;
import com.muhammetalikaya.example.model.Owner;

@Service
public class ExampleServicesImpl implements ExampleService {

	private OwnerRepository ownerRepository;
	
	@Autowired
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public List<Owner> tumYoneticileriBul() {
		return ownerRepository.hepsiniBul();
	}

	@Override
	public List<Owner> tumYoneticileriBul(String soyad) {
		return ownerRepository.soyadIleGetir(soyad);
	}

	@Override
	public Owner yoneticiBul(Long id) throws OwnerNotFoundException {
		Owner owner = ownerRepository.idIleBul(id);
		if(owner==null) throw new OwnerNotFoundException("Owner Bulunamadı id...: "+ id);
		return owner;		
	}

	@Override
	public void yoneticiEkle(Owner owner) {
		ownerRepository.ekle(owner);
	}

	@Override
	public void yoneticiGuncelle(Owner owner) {
		ownerRepository.guncelle(owner);
	}

	@Override
	public void yoneticiSil(Long id) {
		ownerRepository.sil(id);
	}

}
