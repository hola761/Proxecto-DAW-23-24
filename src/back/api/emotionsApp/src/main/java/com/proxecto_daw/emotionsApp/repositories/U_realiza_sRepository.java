package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import com.proxecto_daw.emotionsApp.models.U_realiza_s;

@CrossOrigin(origins= "http://localhost:5500",
methods = {RequestMethod.GET},
maxAge = 3600)
@RepositoryRestResource(path = "usuarios-realizan-servicios")
public interface U_realiza_sRepository extends CrudRepository<U_realiza_s, Long>{

}
