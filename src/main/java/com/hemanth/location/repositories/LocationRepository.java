package com.hemanth.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemanth.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
