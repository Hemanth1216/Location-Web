package com.hemanth.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemanth.location.entities.Location;
import com.hemanth.location.repositories.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTcontroller {
	
	@Autowired
	LocationRepository locrepo;
	
	@GetMapping  //binds this method with HTTP GET method
	public List<Location> getAllLocations(){
		return locrepo.findAll();
		
	}

	@PostMapping //binds this method with HTTP POST method
	public Location createNewLocation(@RequestBody Location location) {
		//@Requestbody - serialize and deseralize json to java objects and viceversa
		return locrepo.save(location);
	}
	
	@PutMapping //binds this method with HTTP PUT method
	public Location updateLocation(@RequestBody Location location) {
		//@Requestbody - serialize and deseralize json to java objects and viceversa
		return locrepo.save(location);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locrepo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		return locrepo.findById(id).get();
	}
}
