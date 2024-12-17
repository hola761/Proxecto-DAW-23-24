package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Rol {

    @Id
    @Column(name="id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="rol")
    private String rol;

    /*Relación con la tabla usuario */
    @OneToMany(mappedBy="rol")
    private List<Usuario> usuarios;

    /*Relación con la tabla s_aplica_c */
    @OneToMany(mappedBy = "rol")
    private List<S_aplica_c> serviciosAplicadosCoche;

    /*Relación tabla u_realiza_s */
    @OneToMany(mappedBy = "rol")
    private List<U_realiza_s> usuariosRealizanServicios;

    public Rol() {
    }

    public Rol(Long Id, String rol, List<Usuario> usuarios, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.Id = Id;
        this.rol = rol;
        this.usuarios = usuarios;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    public Rol(String rol, List<Usuario> usuarios, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.rol = rol;
        this.usuarios = usuarios;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    public Rol(Long Id, String rol) {
        this.Id = Id;
        this.rol = rol;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<S_aplica_c> getServiciosAplicadosCoche() {
        return this.serviciosAplicadosCoche;
    }

    public void setServiciosAplicadosCoche(List<S_aplica_c> serviciosAplicadosCoche) {
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
    }

    public List<U_realiza_s> getUsuariosRealizanServicios() {
        return this.usuariosRealizanServicios;
    }

    public void setUsuariosRealizanServicios(List<U_realiza_s> usuariosRealizanServicios) {
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", rol='" + getRol() + "'" +
            ", usuarios='" + getUsuarios() + "'" +
            ", serviciosAplicadosCoche='" + getServiciosAplicadosCoche() + "'" +
            ", usuariosRealizanServicios='" + getUsuariosRealizanServicios() + "'" +
            "}";
    }
}
