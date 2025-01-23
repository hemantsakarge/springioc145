package com.cjc.main.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.crud.model.AkasaTravels;
import com.cjc.main.crud.repository.AkasaRepository;
import com.cjc.main.crud.service.AkasaService;

@Service
public class AkasaServiceImpl implements AkasaService
{

	@Autowired
	 private  AkasaRepository ar;
	
	@Override
	public void savedata(AkasaTravels a) {
		ar.save(a);
		
	}

	@Override
	public Iterable findAllBus() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

}
