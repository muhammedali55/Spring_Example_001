package com.muhammetalikaya.example.dao.mem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.muhammetalikaya.example.dao.OwnerRepository;
import com.muhammetalikaya.example.model.Owner;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

	private Map<Long, Owner> ownersMap = new HashMap<>();
	
	public OwnerRepositoryImpl() {
	
		Owner owner;
		
		owner = new Owner();
		owner.setId(1L);
		owner.setAd("Muhammet Ali");
		owner.setSoyad("KAYA");
		ownersMap.put(owner.getId(), owner);
		owner = new Owner();
		owner.setId(2L);
		owner.setAd("Serkan ");
		owner.setSoyad("TURNA");
		ownersMap.put(owner.getId(), owner);
		owner = new Owner();
		owner.setId(3L);
		owner.setAd("Bahar");
		owner.setSoyad("VEKİLCİ");
		ownersMap.put(owner.getId(), owner);
		
		
	}
	
	@Override
	public List<Owner> hepsiniBul() {
		return new ArrayList<>(ownersMap.values());
	}

	@Override
	public Owner idIleBul(Long id) {
		return ownersMap.get(id);
	}

	@Override
	public List<Owner> soyadIleGetir(String soyad) {
		return ownersMap.values().stream().filter(x-> x.getSoyad().equals(soyad)).collect(Collectors.toList()); 	
	}

	@Override
	public void ekle(Owner owner) {
		owner.setId(new Date().getTime());
		ownersMap.put(owner.getId(), owner);
	}

	@Override
	public Owner guncelle(Owner owner) {
		ownersMap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void sil(Long id) {
		ownersMap.remove(id);
	}

}
