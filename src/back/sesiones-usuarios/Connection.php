<?php
    $host="localhost";
    $user="root";
    $pass="";
    $bd="proxectodaw";

    $con = new mysqli($host, $user, $pass);
    if($con -> connect_errno){
        printf('A conexión non pudo ser establecida');
    }
    else{
        if(!$con -> select_db($bd)){
            printf('Base de datos non atopada');
        }
        else{
            printf('Conexión establecida con éxito');
        }
    }
?>