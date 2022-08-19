package com.epos.adtech.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EPos_AD_Stores {
	  @Id
	  private String store_id;
	  
	  private String store_description;
	 
	public EPos_AD_Stores() {}
	

}
