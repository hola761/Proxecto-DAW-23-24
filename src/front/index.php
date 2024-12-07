<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styles-corregido.css">
    <script src="https://kit.fontawesome.com/1baaddf7ae.js" crossorigin="anonymous"></script>
    <title>Emotions</title>
</head>
<body>
  <header id="menu-header"> 
    <a class="logo">
      <img src="assets/img/logo-emotions.jpg" alt="">
    </a>
    <p id="icono-menu"> <input type="checkbox" id="check">
      <label for="check" id="icono-burguer">
        <i class="fas fa-bars"></i>
      </label>
    </p>
    <button onclick="window.inicio.showModal();">Iniciar Sesión</button></li>
  </header>
<main>
       
          <?php 
              if (isset($_REQUEST['error'])) {
              ?>
              <p id="error">
           <?php echo $_REQUEST['error'];?>
              </p>
          <?php
                    }
          ?>
  <dialog id="inicio">
  <h2>Inicio de sesión</h2>
    <a href="" onclick="window.modal.close();" id="close"><i class="fas fa-window-close"></i></a>
     <form action="../back/sesiones-usuarios/InicioSesion.php" method="POST" id="sesion" >
        <p class="campo">
          <label for="usuario">Usuario </label>
          <input type="text" name="usuario" id="usuario">
        </p>
        <p class="campo">
          <label for="pass">Contraseña </label>
          <input type="password" name="pass" id="pass">
        </p>
        <p><input clas="boton" type="submit" name="entrar" id="entrar" value="Entrar" class="boton" ></p>
         </fieldset>
      </form>
  </dialog>
    <!-- En esta parte pon un poco de información de la empresa: como servicios que ofrece quienes son,.--->
  </main>
  <footer>
    <address id="derecha">
      <p>Av. Rosalía de Castro, 51</p>
      <p>15960 Ribeira. A Coruña</p>
      <p>Teléfono: 675 984 01</p>
      <p>Email: correo@emotions.com</p>
    </address>
    <p id="centro">Emotions.SL.</p>

    <ul id="redes">
      <li><a href="tel:+675 984 018"><i class="fas fa-phone"></i></i></a></li>
      <li><a href="mailto:correo@emotions.com"><i class="fas fa-envelope"></i></a></li>
      <li><a href="" aria-label="Enlace a la página de facebook"><i class="fa fa-facebook"></i></a></li>
    </ul>
  </footer>
</body>

</html>
