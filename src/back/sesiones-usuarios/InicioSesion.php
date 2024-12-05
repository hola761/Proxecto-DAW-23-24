<?php 
    session_start();
    include('Connection.php');

    function validate($data){
        $data = trim(stripslashes(htmlspecialchars($data)));
        return $data;
    }

    if(isset($_REQUEST['usuario']) && isset($_REQUEST['pass'])){

        $usuario = validate($_REQUEST['usuario']);
        $pass = validate($_REQUEST['pass']);

        #Si el campo nombre usuario está vacío:
        if(empty($usuario)){
            header('Location: ../../front/index.php?error=Se requiere el usuario para iniciar sesión');
        }
        #Si el campo contraseña esá vacío:
        elseif (empty($pass)) {
            header('Location: ../../front/index.php?error=Se requiere la contraseña para iniciar sesión');
        }
        #Si han sido cubiertos los 2 campos se comprueba que existen los datos que ha
        #introducido el usuario en el formulario en la base de datos:
        else{
            #Vale, parece que está mal porque el 'AND' no está de color azul pero parece que ha dejado de dar fallo el sql y llega al printf(), con lo cual, tiene que ser un bug o algo, si no reconociera algo, seguiría dando fallo en el sql..
            $sql = 'SELECT id_usuario, n_usuario, c_usuario FROM usuario WHERE n_usuario = "'.$usuario.'" AND c_usuario = "'.$pass.'"';

            $result = mysqli_query($con, $sql);
            #printf('Hast aquí llegamos');
            
            #Si del select sale un resultado:
            if(mysqli_num_rows($result) == 1){
                $row = mysqli_fetch_assoc($result);
                #Si ambos datos introducidos existen en la base de datos guardamos
                #las variables de la sesión que nos interesa y, con un header
                #vamos a la página de inicio:
                if($row['n_usuario'] == $usuario && $row['c_usuario'] == $pass){
                    $_SESSION['n_usuario'] = $row['n_usuario'];
                    $_SESSION['c_usuario'] = $row['c_usuario'];
                    $_SESSION['id_usuario'] = $row['id_usuario'];
                    header('Location: ../../front/inicio.html');
                }
                #Si alguno de los campos no coincide con los datos en la base de datos
                #Volvemos a la página index.php(donde estamos ya) mandando
                #un error para poder mostrarlo al usuario
                else{
                    header('Location: ../../front/index.php?error=Los datos introducidos no son correctos');
                }
            }
            #Si del select no sale ningún resultado;ninguno de los datos introducidos
            #existe en la base de datos. Volvemos a la página en la que estamos(index.php)
            #mandando un error para poder mostrarlo después al usuario.
            else{
                header('Location: ../../front/index.php?error=Los datos introducidos no son correctos');
            }
        }
    }
    else{
        header('Location: ../../front/index.php');
    }
?>