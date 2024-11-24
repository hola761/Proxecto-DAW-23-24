<?php
    class Cliente{
        private $dni;
        private $nombre;
        private $telefono;
        private $email;
        private $nUsuario;
        private $cUsuario;

        function __construct($dni, $nombre, $telefono, $email, $nUsuario, $cUsuario){
            $this->$dni = $dni;
            $this->$nombre = $nombre;
            $this->$telefono = $telefono;
            $this->$email = $email;
            $this->nUsuario = $nUsuario;
            $this->cUsuario = $cUsuario;
        }
    }
?>