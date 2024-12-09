package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name="usuarios")
public class Usuario {

    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @Column(name="dni")
    private String dni;

    @Column(name="nombre")
    private String nombre;

    @Column(name="telefono")
    private String telefono;

    @Column(name="direccion")
    private String direccion;

    @Column(name="email")
    private String email;

    @Column(name="n_usuario")
    private String nUsuario;

    @Column(name="c_usuario")
    private String cUsuario;

    /*Relación con la tabla rol */
    @ManyToOne
    @JoinColumn(name="id_rol")
    private Rol rol;

    /*Relación con la tabla coche */
    @OneToMany(mappedBy = "usuario")
    private List<Coche> coches;

    /*Relación con la tabla s_aplica_c */
    @OneToMany(mappedBy = "usuario")
    private List<S_aplica_c> serviciosAplicadosCoche;

    /*Relación tabla u_realiza_s */
    @OneToMany(mappedBy = "usuario")
    private List<U_realiza_s> usuariosRealizanServicios;

    public Usuario() {
    }

    public Usuario(Long Id, String dni, String nombre, String telefono, String direccion, String email, String nUsuario, String cUsuario, Rol rol, List<Coche> coches, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.Id = Id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nUsuario = nUsuario;
        this.cUsuario = cUsuario;
        this.rol = rol;
        this.coches = coches;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }
    
    public Usuario(String dni, String nombre, String telefono, String direccion, String email, String nUsuario, String cUsuario, Rol rol, List<Coche> coches, List<S_aplica_c> serviciosAplicadosCoche, List<U_realiza_s> usuariosRealizanServicios) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nUsuario = nUsuario;
        this.cUsuario = cUsuario;
        this.rol = rol;
        this.coches = coches;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
        this.usuariosRealizanServicios = usuariosRealizanServicios;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    
    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNUsuario() {
        return this.nUsuario;
    }

    public void setNUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getCUsuario() {
        return this.cUsuario;
    }

    public void setCUsuario(String cUsuario) {
        this.cUsuario = cUsuario;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Coche> getCoches() {
        return this.coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
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
            ", dni='" + getDni() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", email='" + getEmail() + "'" +
            ", nUsuario='" + getNUsuario() + "'" +
            ", cUsuario='" + getCUsuario() + "'" +
            ", rol='" + getRol() + "'" +
            ", coches='" + getCoches() + "'" +
            ", serviciosAplicadosCoche='" + getServiciosAplicadosCoche() + "'" +
            ", usuariosRealizanServicios='" + getUsuariosRealizanServicios() + "'" +
            "}";
    }
}