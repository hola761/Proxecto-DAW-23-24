package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proxecto_daw.emotionsApp.models.U_realiza_s;

@RepositoryRestResource(path = "usuarios-realizan-servicios")
public interface U_realiza_sRepository extends CrudRepository<U_realiza_s, Long>{

}
