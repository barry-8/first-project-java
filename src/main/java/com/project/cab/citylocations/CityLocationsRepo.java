package com.project.cab.citylocations;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityLocationsRepo extends CrudRepository<CityLocations, String>{

}
