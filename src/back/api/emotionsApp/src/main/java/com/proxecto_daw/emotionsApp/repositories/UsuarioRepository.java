package com.proxecto_daw.emotionsApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import com.proxecto_daw.emotionsApp.models.Usuario;

@CrossOrigin(origins= "http://127.0.0.1:5500, http://localhost",
methods = {RequestMethod.GET},
maxAge = 3600)
// @CrossOrigin(origins= "http://127.0.0.1:5500",
// methods = {RequestMethod.GET},
// maxAge = 3600)
@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    // public abstract List<Usuario> findByNombreIgnoreCase(@RequestParam("nombre") String nombre);
}
