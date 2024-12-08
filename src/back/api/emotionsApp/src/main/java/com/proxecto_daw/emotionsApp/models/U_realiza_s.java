package com.proxecto_daw.emotionsApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "u_realiza_s")
public class U_realiza_s {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_u_realiza_s")
    private Long id;

    /*Relación tabla usuario */
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    /*Relación tabla rol */
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    /*Relación tabla servicio */
    @ManyToOne
    @JoinColumn(name ="id_servicio")
    private Servicio servicio;

    public U_realiza_s() {
    }

    public U_realiza_s(Long id, Usuario usuario, Rol rol, Servicio servicio) {
        this.id = id;
        this.usuario = usuario;
        this.rol = rol;
        this.servicio = servicio;
    }

    public U_realiza_s(Usuario usuario, Rol rol, Servicio servicio) {
        this.usuario = usuario;
        this.rol = rol;
        this.servicio = servicio;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Servicio getServicio() {
        return this.servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", usuario='" + getUsuario() + "'" +
            ", rol='" + getRol() + "'" +
            ", servicio='" + getServicio() + "'" +
            "}";
    }
}
