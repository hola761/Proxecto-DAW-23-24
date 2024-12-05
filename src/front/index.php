<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styles-index.css">
    <title>Iniciar sesión</title>
</head>

<body>
    <main>
        <form action="../back/sesiones-usuarios/InicioSesion.php" method="POST">
            <fieldset id="fondo">
                <h1 class="titulo">Datos acceso</h1>
                <?php 
                    if (isset($_REQUEST['error'])) {
                ?>
                    <p id="error">
                        <?php echo $_REQUEST['error'];?>
                    </p>
                <?php
                    }
                ?>
                <p class="controles">
                    <label for="usuario">Usuario </label>
                    <input type="text" name="usuario" id="usuario" />
                </p>
                <p class="controles">
                    <label for="pass">Contraseña </label>
                    <input type="password" name="pass" id="pass" />
                </p>
                <input clas="boton" type="submit" name="entrar" id="entrar" value="Entrar" />
            </fieldset>
        </form>
    </main>
</body>

</html>