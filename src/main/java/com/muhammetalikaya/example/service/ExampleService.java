package com.muhammetalikaya.example.service;

import java.util.List;

import com.muhammetalikaya.example.exceptions.OwnerNotFoundException;
import com.muhammetalikaya.example.model.Owner;

public interface ExampleService {

	List<Owner> tumYoneticileriBul();
	List<Owner> tumYoneticileriBul(String soyad);
	Owner yoneticiBul(Long id) throws OwnerNotFoundException;
	void yoneticiEkle(Owner owner);
	void yoneticiGuncelle(Owner owner);
	void yoneticiSil(Long id);
}
