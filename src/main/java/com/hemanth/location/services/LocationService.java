package com.hemanth.location.services;

import java.util.List;

import com.hemanth.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> viewAllLocations();
}
