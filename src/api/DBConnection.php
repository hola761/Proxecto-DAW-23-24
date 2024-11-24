<?php
#Es más seguro usar sentencias preparadas para la api
    class Database{
        private $host = 'localhost:3306';
        private $user = 'root';
        private $password = '';
        private $database = 'proxectodaw';

        public function getConnection(){
            try{
                $conectionDB = mysqli_connect($this->$host, $this->$user, $this->$password);
                mysqli_select_db($conectionDB, $this->$database);
                return $conectionDB;
            }catch(Exception $e){
                echo "Error en la conexión ".$e;
            }
        }
    }
?>