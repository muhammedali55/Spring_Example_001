package com.muhammetalikaya.example.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.muhammetalikaya.example.dao.OwnerRepository;
import com.muhammetalikaya.example.model.Owner;

@Repository("ownerrepository")
@Primary
public class OwnerRepositoryJpaImpl implements OwnerRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Owner> hepsiniBul() {
		return entityManager.createQuery("from Owner", Owner.class).getResultList();
	}

	@Override
	public Owner idIleBul(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> soyadIleGetir(String soyad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ekle(Owner owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Owner guncelle(Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sil(Long id) {
		// TODO Auto-generated method stub
		
	}

}
