package com.epos.adtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.epos.adtech.data.EPOS_AD_Promotions;
import com.epos.adtech.data.PromotionRepository;
import com.epos.adtech.data.EPos_AD_Stores;
import com.epos.adtech.data.StoreRepository;

@RestController
public class AdController {
	
	@Autowired
	private StoreRepository storerepository;
	
	@Autowired
	private PromotionRepository promoRepository;
	
	//This endpoint gives a list of all stores
	@GetMapping("/stores")
	  public List <EPos_AD_Stores> getStores() {
	    return storerepository.findAll();
	  }
	
	//This endpoint gives a list of all promotions available
	@GetMapping("/promotions")
	  public List<EPOS_AD_Promotions> getPromotions() {
	    return promoRepository.findAll();
	  }
	
	@GetMapping("/welcome/{name}")
	  public String welcomeMessage(@PathVariable String name) {
	    return "Hello There! Welcome to this place Mr. "+name;
	  }
	
}
