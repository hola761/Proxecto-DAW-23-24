package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proxecto_daw.emotionsApp.models.S_aplica_c;

@RepositoryRestResource(path = "servicios-aplicados-coche")
public interface S_aplica_cRepository extends CrudRepository<S_aplica_c, Long>{

}
