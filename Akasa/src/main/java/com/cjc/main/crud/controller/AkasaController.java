package com.cjc.main.crud.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.crud.model.AkasaTravels;
import com.cjc.main.crud.service.AkasaService;

@RestController
public class AkasaController {

	@Autowired
	private AkasaService as;
	
	
	@PostMapping("/savepaasengerdetailsakasa")
	public String savePasengerDetails(@RequestBody AkasaTravels a)
	{
		
		as.savedata(a);
		return "save";
	}
	@GetMapping("/findallakasa")
	public Iterable findAkasaBus()
	{
		
		Iterable itr=as.findAllBus();
		
		return itr;
		
	}
	
	@GetMapping("/findallakasabussortingprice")
	public List<AkasaTravels> allBus()
	{
		
		
		List<AkasaTravels> list=(List<AkasaTravels>) as.findAllBus();
		
		for (AkasaTravels pb : list) {
			Comparator<AkasaTravels>cr=(o1, o2) ->(int)(o1.getBusPrice()-o2.getBusPrice()); 
			list.sort(cr);
			return list;
		}
		
		return list;
		
		
		
	}
	
	
	
	
	
	
}
