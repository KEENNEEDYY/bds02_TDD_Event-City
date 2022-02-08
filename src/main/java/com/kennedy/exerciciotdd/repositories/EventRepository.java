package com.kennedy.exerciciotdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kennedy.exerciciotdd.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
