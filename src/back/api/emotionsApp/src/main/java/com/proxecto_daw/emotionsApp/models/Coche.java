package com.proxecto_daw.emotionsApp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="coche")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coche")
    private Long idCoche;

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

    
}
