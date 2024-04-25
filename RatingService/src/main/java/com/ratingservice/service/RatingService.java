package com.ratingservice.service;

import java.util.List;

import com.ratingservice.entity.Rating;

public interface RatingService {
	
	 public Rating createRating(Rating rating);
	 
	 public List<Rating> getAllRating();
	 
	 List<Rating> getRatingByUserId(String userId);
	 
	 
	 List<Rating> getRatingByHotelId(String hotelId);
	
	
	

}
