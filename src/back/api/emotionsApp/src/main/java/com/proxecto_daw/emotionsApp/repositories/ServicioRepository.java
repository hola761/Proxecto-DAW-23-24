package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import com.proxecto_daw.emotionsApp.models.Servicio;

@CrossOrigin(origins= "http://127.0.0.1:5500, http://localhost",
methods = {RequestMethod.GET, RequestMethod.POST},
maxAge = 3600)
@RepositoryRestResource(path = "servicios")
public interface ServicioRepository extends CrudRepository<Servicio, Long>{

}
