package com.epos.adtech.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EPOS_AD_Promotions {
	  @Id
	  private String promo_id;
	  
	  private String promo_description;
	  
	public EPOS_AD_Promotions() {}

	public String getPromo_id() {
		return promo_id;
	}

	public void setPromo_id(String promo_id) {
		this.promo_id = promo_id;
	}

	public String getPromo_description() {
		return promo_description;
	}

	public void setPromo_description(String promo_description) {
		this.promo_description = promo_description;
	}
	
	
}
