package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proxecto_daw.emotionsApp.models.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    // public abstract List<Usuario> findByNombreIgnoreCase(@RequestParam("nombre") String nombre);
}
