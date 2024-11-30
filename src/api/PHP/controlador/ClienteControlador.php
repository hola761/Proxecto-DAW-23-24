<?php
    require_once(__DIR__."DBConnection.php");

    #sin probar nada!!!
    class ClienteControlador{

        #Función para crear cliente
        public static function crearCliente($dni, $nombre, $telefono, 
            $email, $nUsuario, $cUsuario){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('INSERT INTO cliente VALUES(:dni, :nombre, :telefono,
                $email, $nUsuario, $cUsuario)');
            $stmt->bindParam(':dni', $dni);
            $stmt->bindParam(':nombre', $nombre);
            $stmt->bindParam(':telefono', $telefono);
            $stmt->bindParam(':email', $email);
            $stmt->bindParam(':nUsuario', $nUsuario);
            $stmt->bindParam(':cUsuario', $cUsuario);

            if($stmt->execute()){
                print('Cliente creado correctamente');
            }
            else{
                print('Ha ocurrido un error. El cliente no ha podido crearse.');
            }
            $stmt->close();
        }

        #Función para eliminar cliente
        public static function eliminarCliente($dni){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('DELETE FROM cliente WHERE dni = :dni');
            $stmt->bindParam(':dni', $dni);

            if($stmt->execute()){
                header('Cliente eliminado correctamente');
            }
            else{
                header('Ha ocurrido un error. El cliente no ha podido ser eliminado.');
            }
            $stmt->close();
        }

        #Función para listar clientes
        public static function listarClientes(){
            $db  = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente');

            if($stmt->execute()){
                #probar si funciona así en cuanto consiga averiguar
                #cómo ejecutar php
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #Esto habría que quitarlo porque, o devuelve algo o hace el header.
                #Las 2 cosas creo recordar que no le gustan nada. Y, si no me equivoco,
                #se decanta por el header.
                //header('Clientes mostrados');
            }
            else{
                header('Ha ocurrido un error. Los clientes no han podido ser mostrados.');
            }
            $stmt->close();
        }

        #Función para mostrar cliente por dni
        public static function getClienteById($dni){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE dni = :dni');

            $stmt->bindParam(':dni', $dni);

            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #header('Cliente mostrado');
            }
            else{
                header('Ha ocurrido un error. El cliente con dni '.$dni.' no ha podido mostrarse.');
            }
            $stmt->close();
        }

        #Función para mostrar cliente/s por nombre
        public static function getClienteByNombre($nombre){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE nombre = :nombre');

            $stmt->bindParam(':nombre', $nombre);
            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #Aquí hay que barajar la posibilidad que se pueden mostrar varios
                #y no solo uno. Aunque no debería, puede pasar
                #header('Cliente/s mostrado/s');
            }
            else{
                header('Ha ocurrido un error. El/Los cliente/s no ha/n podido ser mostrado/s');
            }
            $stmt->close();
        }

        #Función para mostrar cliente/s por teléfono
        public static function getClienteByTelefono($telefono){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE telefono = :telefono');

            $stmt->bindParam(':telefono', $telefono);
            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #Aquí hay que barajar la posibilidad que se pueden mostrar varios
                #y no solo uno. Si dan un teléfono fijo y tenemos clientes que viven 
                #en la misma casa, pueden salir varios
                #header('Cliente/s mostrado/s');
            }
            else{
                header('Ha ocurrido un error. El/Los cliente/s no ha/n podido ser mostrado/s');
            }
            $stmt->close();
        }

        #Función para mostrar cliente/s por dirección
        public static function getClienteByDireccion($direccion){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE direccion = :direccion');

            $stmt->bindParam(':direccion', $direccion);
            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #Aquí hay que barajar la posibilidad que se pueden mostrar varios
                #y no solo uno. Si tenemos varios clientes que viven en la misma casa.
                #header('Cliente/s mostrado/s');
            }
            else{
                header('Ha ocurrido un error. El/Los cliente/s no ha/n podido ser mostrado/s');
            }
            $stmt->close();
        }

        #Función para mostrar cliente/s por email
        public static function getClienteByEmail($email){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE email = :email');

            $stmt->bindParam(':email', $email);
            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #Aquí hay que barajar la posibilidad que se pueden mostrar varios
                #y no solo uno. Aunque no debería
                #header('Cliente/s mostrado/s');
            }
            else{
                header('Ha ocurrido un error. El/Los cliente/s no ha/n podido ser mostrado/s');
            }
            $stmt->close();
        }

        #Función para mostrar cliente por nombre de usuario
        public static function getClienteByUsuario($nUsuario){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('SELECT * FROM cliente WHERE nUsario = :nUsuario');

            $stmt->bindParam(':nUsuario', $nUsuario);
            if($stmt->execute()){
                $result = $stmt->get_result();
                $data = mysqli_fetch_all($result, MYSQLI_ASSOC);
                return json_enconde($data);
                #header('Cliente mostrado');
            }
            else{
                header('Ha ocurrido un error. El cliente no ha podido ser mostrado');
            }
            $stmt->close();
        }

        #Función para actualizar cliente
        public static function actualizarCliente($dni, $nombre, $telefono, $email, $nUsuario, $cUsuario){
            $db = new DBConnection();
            $con = $db->getConnection();
            $stmt = $con->prepare('UPDATE cliente SET nombre = :nombre, telefono = :telefono, email = :email
                nUsuario = :nUsuario, cUsuario = :cUsuario WHERE dni = :dni');
            $stmt->bindParam(':nombre', $nombre);
            $stmt->bindParam(':telefono', $telefono);
            $stmt->bindParam(':email', $email);
            $stmt->bindParam(':nUsuario', $nUsuario);
            $stmt->bindParam(':cUsuario', $cUsuario);
            $stmt->bindParam(':dni', $dni);

            if($stmt->execute()){
                header('Cliente actualizado correctamente');
            }
            else{
                header('Ha ocurrido un error. El cliente no ha podido ser actualizado');
            }
            $stmt->close();
        }
    }
?>