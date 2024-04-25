package com.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.entity.Rating;
import com.ratingservice.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping("/craterating")
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {

		Rating createRating = ratingService.createRating(rating);

		return ResponseEntity.status(HttpStatus.CREATED).body(createRating);

	}
	
	
	@GetMapping("/getallrating")
	public ResponseEntity <List <Rating>> getAllRating()
	{
		
		List<Rating> allRating = ratingService.getAllRating();
		
		   return ResponseEntity.status(HttpStatus.OK).body(allRating);
		
	}
	
	
	@GetMapping("/finduserid/{rating}")
	public ResponseEntity <List<Rating>> findByUserId(@PathVariable String rating)
	{
		         List<Rating> ratingByUserId = ratingService.getRatingByUserId(rating);
		           
		           
				return ResponseEntity.status(HttpStatus.OK).body(ratingByUserId);
		
		
		
	}
	
	
	@GetMapping("/findhotleId/{hotle}")
	public ResponseEntity <List<Rating>> findByHotleId(@PathVariable String hotle)
	{
		         List<Rating> ratingByUserId = ratingService.getRatingByHotelId(hotle);
		           
		           
				return ResponseEntity.status(HttpStatus.OK).body(ratingByUserId);
		
		
		
	}
	
	
	
	

}
