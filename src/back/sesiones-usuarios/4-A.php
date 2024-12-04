<?php
    $conexionBD = new mysqli('localhost', 'root', '');
    if($conexionBD -> connect_errno)
        printf("Fallo al conectar con la BD ",
    $conexionBD -> connect_error);
    else{
        if(!$conexionBD -> select_db('receitas'))
            printf("Fallo al elegir la BD ", $conexionBD -> errno);
        else{
            printf("Conexión establecida con éxito<br/><br/>");
            if(!$conexionBD -> close())
                printf("Fallo al cerrar la conexión ",
            $conexionBD -> error);
            else
                printf("Conexión cerrada con éxito");
        }
    }
?>
<!-- Funciona bien, usar como base para sintaxis en modo objetos -->