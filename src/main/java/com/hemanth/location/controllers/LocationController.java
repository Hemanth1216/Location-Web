package com.hemanth.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hemanth.location.entities.Location;
import com.hemanth.location.services.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;
	
	@RequestMapping("/show-create")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/save-loc")
	public String saveLoc(@ModelAttribute("location") Location location,ModelMap model){
		Location locationsaved = service.saveLocation(location);
		String msg = "Your location is saved at "+locationsaved.getId();
		model.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/display-locations")
	public String viewAllLocations(ModelMap model) {
		List<Location> locations = service.viewAllLocations();
		model.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/delete-location")
	public String deleteLocation(@RequestParam("id") int id)
	{
		Location location = service.getLocationById(id);
		service.deleteLocation(location);
		return "redirect:display-locations";
	}
	
	@RequestMapping("/show-update")
	public String showUpdateLocation(@RequestParam("id") int id,ModelMap model)
	{
		Location location = service.getLocationById(id);
		model.put("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("/update-loc")
	public String UpdateLocation(@ModelAttribute("location") Location location,ModelMap model)
	{
		service.updateLocation(location);
		model.put("msg","Your location is updated");
		return "updateLocation";
	}
	
}
