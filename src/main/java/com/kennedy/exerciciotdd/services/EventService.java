package com.kennedy.exerciciotdd.services;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kennedy.exerciciotdd.dto.EventDTO;
import com.kennedy.exerciciotdd.entities.City;
import com.kennedy.exerciciotdd.entities.Event;
import com.kennedy.exerciciotdd.repositories.EventRepository;
import com.kennedy.exerciciotdd.services.exceptions.ResourceNotFoundException;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repository;
	
	@Transactional
	public EventDTO update(Long id, EventDTO dto) {
		try {
			Event entity = repository.getById(id);
			entity.setCity(new City(dto.getCityId(), null, null));
			entity.setDate(dto.getDate());
			entity.setName(dto.getName());
			entity.setUrl(dto.getUrl());
			repository.save(entity);
			return new EventDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found "+ id);
		}
	}

}
