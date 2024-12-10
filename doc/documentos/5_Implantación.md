# FASE DE IMPLANTACIÓN

- [FASE DE IMPLANTACIÓN](#fase-de-implantación)
  - [1- Manual técnico](#1--manual-técnico)
    - [1.1- Instalación](#11--instalación)
    - [1.2- Administración do sistema](#12--administración-do-sistema)
  - [2- Manual de usuario](#2--manual-de-usuario)
  - [3- Melloras futuras](#3--melloras-futuras)

## 1- Manual técnico

### 1.1- Instalación

Indicacións e pasos a seguir para o despregue do proxecto nunha máquina virtual:
  - Instalar Java.
  - Instalar Xampp.
  - Importar no phpmyadmin o script de creación da BD: [script](/doc/script_bd/script_creacion_BD.sql)
  - Instalar Visual Studio Code xunto coas extensións necesarias para as linguaxes: Php, Java, Html, Css e JavaScript.
  - Co entorno xa preprado será necesario copiar dentro da carpeta htdocs a carpeta src: [Carpeta co código do proxecto](src)
  - Engadir un enlace ó arquivo index.php/html do proxecto, no archivo index.php/html. O cal ven por defecto dentro da carpeta htdocs
  - Abrir o manager do xampp e executar o phpmyadmin e o apache
  - Abrir a carpeta htdocs no visual studio e exuctar a clase main da api
  - Accedendo a localhost no navegador teremos un enlace no que, premendo, poderemos acceder á páxina de inicio de sesión do proxecto.
  - Datos necesarios para iniciar sesión:
    - usuario: pacouser
    - contraseña: abc123.

### 1.2- Administración do sistema

En relación coa administración do sistema será necesario levar a cabo as seguintes tarefas:

 - Copia de seguridade do sistema.
 - Copia de seguridade da base de datos.
 - Xestión de incidencias que poidan xurdir co emprego da aplicación. Tanto de sistema, como intentos de acceso non autorizados á BD como fallos no software non atopados nas probas relativas feitas antes da entrega da mesma.

## 2- Manual de usuario

Esta aplicación é moi sinxela de usar e non require de manual, nin de formación, salvo unha pequena explicación o día da súa implantación na empresa. E algunha mais no caso de engadirse mais funcións pero serían igual de sinxelas de empregar.

## 3- Melloras futuras

 - Implementación da aplicación adicada ós clientes.  
 - Implementación do calendario de citas, tanto para a empresa como para os clientes.  
 - Implementación da parte de compras de produtos, tanto para a empresa; para que poidan engadir con sinxeleza e rapidez os produtos, como para os clientes; para que poidan ver nos seus dispositivos os produtos ofrecidos pola empresa dispoñibles para a súa compra.

