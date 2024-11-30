package com.proxecto_daw.emotionsApp.models;

import jakarta.persistence.*;

@Entity
@Table (name="usuario")
public class Usuario {

    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne
    @JoinColumn(name="id_rol")
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Long id, String dni, String nombre, String telefono, String direccion, String email, String nUsuario, String cUsuario, Rol rol) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nUsuario = nUsuario;
        this.cUsuario = cUsuario;
        this.rol = rol;
    }

    public Usuario(String dni, String nombre, String telefono, String direccion, String email, String nUsuario, String cUsuario, Rol rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nUsuario = nUsuario;
        this.cUsuario = cUsuario;
        this.rol = rol;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", dni='" + getDni() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", email='" + getEmail() + "'" +
            ", nUsuario='" + getNUsuario() + "'" +
            ", cUsuario='" + getCUsuario() + "'" +
            ", rol='" + getRol() + "'" +
            "}";
    }
}
