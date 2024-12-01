package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proxecto_daw.emotionsApp.models.Servicio;

@RepositoryRestResource(path = "servicios")
public interface ServicioRepository extends CrudRepository<Servicio, Long>{

}
