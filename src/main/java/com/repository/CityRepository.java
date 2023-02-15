package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.City;

@RepositoryRestResource(collectionResourceRel = "city",path = "city")
public interface CityRepository  extends JpaRepository<City, Integer>{

}
