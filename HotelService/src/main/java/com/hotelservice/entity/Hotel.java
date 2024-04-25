package com.hotelservice.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel {

	   @Id
	    private String id;
	    private String hotleName;
	    private String location;
	    private String about;
	    
	    
	    	
	 
	
	
	
	
	
}
