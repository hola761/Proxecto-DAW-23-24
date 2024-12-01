package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @Column(name = "id_servicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    /*Relación con la tabla s_aplica_c */
    @OneToMany(mappedBy = "usuario")
    private List<S_aplica_c> serviciosAplicadosCoche;

    /*Relación tabla u_realiza_s */
    @OneToMany(mappedBy = "servicio")
    private List<U_realiza_s> usuariosRealizanServicios;

    public Servicio() {
    }

    public Servicio(Long id, String nombre, double precio, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    public Servicio(String nombre, double precio, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.nombre = nombre;
        this.precio = precio;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", serviciosAplicadosCoche='" + getServiciosAplicadosCoche() + "'" +
            ", usuariosRealizanServicios='" + getUsuariosRealizanServicios() + "'" +
            "}";
    }
}
