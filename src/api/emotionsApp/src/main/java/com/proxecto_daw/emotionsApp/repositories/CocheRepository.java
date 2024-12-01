package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proxecto_daw.emotionsApp.models.Coche;

@RepositoryRestResource(path = "coches")
public interface CocheRepository extends CrudRepository<Coche, Long>{

}
