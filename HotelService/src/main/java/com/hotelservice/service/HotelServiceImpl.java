package com.hotelservice.service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.hotelservice.entity.Hotel;
import com.hotelservice.exception.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;
	
	
	
	@Override
	public Hotel createHotel(Hotel hotel) {

		 String hotelId = UUID.randomUUID().toString();
		 hotel.setId(hotelId);
		Hotel save = hotelRepo.save(hotel);
		
		return save;
	}

	@Override
	public Hotel getSingleHotel(String id) {
		
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel id is not present in Db"));
	}

	@Override
	public List<Hotel> getAllHotel() {

		return null;
	}

}
