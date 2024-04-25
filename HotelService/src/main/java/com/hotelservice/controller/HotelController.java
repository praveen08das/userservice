package com.hotelservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.entity.Hotel;
import com.hotelservice.service.HotelService;


@RestController
@RequestMapping("/hotel")
public class HotelController {
	
@Autowired
HotelService hotelService;

@PostMapping("/hotelcreate")
public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel)
{
	
	Hotel createHotel = hotelService.createHotel(hotel);
	
	
	return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);

}

@GetMapping("/getbyid/{id}")
public ResponseEntity<Hotel> getHotelId(@PathVariable String id)
{
	Hotel singleHotel = hotelService.getSingleHotel(id);
	
	return ResponseEntity.status(HttpStatus.OK).body(singleHotel);

 
	
}

	
	
	
}
