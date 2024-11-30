package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.proxecto_daw.emotionsApp.models.Rol;

@RepositoryRestResource(path="roles")
public interface RolRepository extends CrudRepository<Rol, Long>{

    // public abstract List<Rol> findByRolIgnoreCase(@RequestParam("rol") String rol);
}
