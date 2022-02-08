package com.kennedy.exerciciotdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kennedy.exerciciotdd.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
