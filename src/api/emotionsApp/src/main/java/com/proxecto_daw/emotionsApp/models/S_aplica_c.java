package com.proxecto_daw.emotionsApp.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "s_aplica_c")
public class S_aplica_c {

    /*Esta columna falta el la tabla, yo no le añadí un id
     * ahora, hace falta. No se puede probar hasta que esté añadido
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*Relación tabla coche */
    @ManyToOne
    @JoinColumn(name = "id_coche")
    private Coche coche;

    /*Relación tabla usuario */
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    /*Relaciónm tabla rol */
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    /*Relación tabla servicio */
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicio;

    @Column(name = "fecha")
    private Date fecha;

    public S_aplica_c() {
    }

    public S_aplica_c(Long id, Coche coche, Usuario usuario, Rol rol, Servicio servicio, Date fecha) {
        this.id = id;
        this.coche = coche;
        this.usuario = usuario;
        this.rol = rol;
        this.servicio = servicio;
        this.fecha = fecha;
    }

    public S_aplica_c(Coche coche, Usuario usuario, Rol rol, Servicio servicio, Date fecha) {
        this.coche = coche;
        this.usuario = usuario;
        this.rol = rol;
        this.servicio = servicio;
        this.fecha = fecha;
    }

    public Coche getCoche() {
        return this.coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
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

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "{" +
            " coche='" + getCoche() + "'" +
            ", usuario='" + getUsuario() + "'" +
            ", rol='" + getRol() + "'" +
            ", servicio='" + getServicio() + "'" +
            ", fecha='" + getFecha() + "'" +
            "}";
    }

}
