package com.muhammetalikaya.example.dao;

import java.util.List;

import com.muhammetalikaya.example.model.Pharma;

public interface PharmaRepository {

	Pharma idIleBul(Long id);
	List<Pharma> yoneticiIdIleGetir(Long ownerId);
	void ekle(Pharma pharma);
	Pharma guncelle(Pharma pharma);
	void sil(Long id);
	void yoneticiIdIleSil(Long ownerId);
}
