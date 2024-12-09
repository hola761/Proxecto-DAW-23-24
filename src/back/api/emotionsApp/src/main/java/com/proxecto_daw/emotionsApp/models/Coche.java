package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="coches")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coche")
    private Long Id;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    /*Relación con la tabla usuario */
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    /*Esto viene de la relación con usuario, rol es una
     * fk en la tablausuario y se ve reflejado
     * también en esta tabla, en coche.
     */
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @OneToMany(mappedBy = "coche")
    private List<S_aplica_c> serviciosAplicadosCoche;
    /*Intento de la tabla relación entre servicio y coche */
    // @ManyToMany(mappedBy = "coches")
    // private List<Servicio> servicios;

    public Coche() {
    }

    public Coche(Long Id, String matricula, String marca, String modelo, Usuario usuario, Rol rol, List<S_aplica_c> serviciosAplicadosCoche) {
        this.Id = Id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.rol = rol;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
    }

    public Coche(String matricula, String marca, String modelo, Usuario usuario, Rol rol, List<S_aplica_c> serviciosAplicadosCoche) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.rol = rol;
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public List<S_aplica_c> getServiciosAplicadosCoche() {
        return this.serviciosAplicadosCoche;
    }

    public void setServiciosAplicadosCoche(List<S_aplica_c> serviciosAplicadosCoche) {
        this.serviciosAplicadosCoche = serviciosAplicadosCoche;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", usuario='" + getUsuario() + "'" +
            ", rol='" + getRol() + "'" +
            ", serviciosAplicadosCoche='" + getServiciosAplicadosCoche() + "'" +
            "}";
    }    
}
