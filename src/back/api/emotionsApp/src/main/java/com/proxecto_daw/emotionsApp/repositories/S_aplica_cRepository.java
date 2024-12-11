package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import com.proxecto_daw.emotionsApp.models.S_aplica_c;

@CrossOrigin(origins= "http://127.0.0.1:5500, http://localhost",
methods = {RequestMethod.GET, RequestMethod.POST},
maxAge = 3600)
@RepositoryRestResource(path = "servicios-aplicados-coche")
public interface S_aplica_cRepository extends CrudRepository<S_aplica_c, Long>{

}
