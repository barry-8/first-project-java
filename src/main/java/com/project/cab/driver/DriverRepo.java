package com.project.cab.driver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends CrudRepository<Driver, String> {

}