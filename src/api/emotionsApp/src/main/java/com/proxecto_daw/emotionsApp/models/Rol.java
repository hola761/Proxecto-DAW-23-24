package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="rol")
public class Rol {

    @Id
    @Column(name="id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name="rol")
    private String rol;

    @OneToMany(mappedBy="rol")
    private List<Usuario> usuarios;

    public Rol() {
    }

    public Rol(Long idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

    public Rol(String rol) {
        this.rol = rol;
    }

    public Long getIdRol() {
        return this.idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "{" +
            " idRol='" + getIdRol() + "'" +
            ", rol='" + getRol() + "'" +
            "}";
    }

}
