package com.ratingservice.service;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ratingservice.entity.Rating;
import com.ratingservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
	
@Autowired
RatingRepository ratingRepository;

	
	

	@Override
	public Rating createRating(Rating rating) {
		
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		 Rating save = ratingRepository.save(rating);
		
		return save;
	}




	@Override
	public List<Rating> getAllRating() {
	       
		
		return ratingRepository.findAll();
	}




	@Override
	public List<Rating> getRatingByUserId(String id) {
		
		return ratingRepository.findByUserId(id);
	}


	@Override
	public List<Rating> getRatingByHotelId(String id) {
		
		return ratingRepository.findByHotelId(id);
	}



}
