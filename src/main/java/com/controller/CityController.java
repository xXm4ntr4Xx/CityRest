package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.City;
import com.repository.CityRepository;

@RestController //
public class CityController {
	@Autowired
	CityRepository cityrepo;

	@GetMapping(path = "cities") // show list of city Api
	public List<City> showCity() {
		return cityrepo.findAll();
	}

	@GetMapping("cities/{id}")
	public Optional<City> showCities(@PathVariable Integer id) {
		return cityrepo.findById(id);
	}

	@PostMapping(path = "cities", consumes = "application/json", produces = "application/json")
	public City saveCity(@RequestBody City city) {
		System.out.println(city);
		return cityrepo.save(city);
	}

	@DeleteMapping(path = "cities/{id}") // path variable->target url params
	public void deleteCity(@PathVariable Integer id) {
		cityrepo.deleteById(id);
		System.out.println("delete");
	}
}
