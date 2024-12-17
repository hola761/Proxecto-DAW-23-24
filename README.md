# Proxecto fin de ciclo

- [Proxecto fin de ciclo](#proxecto-fin-de-ciclo)
  - [Taboleiro do proyecto](#taboleiro-do-proyecto)
  - [Descrición](#descrición)
  - [Instalación / Posta en marcha](#instalación--posta-en-marcha)
  - [Uso](#uso)
  - [Sobre o autor](#sobre-o-autor)
  - [Licenza](#licenza)
  - [Índice](#índice)
  - [Guía de contribución](#guía-de-contribución)
  - [Links](#links)

## Taboleiro do proyecto

Proxecto en fase de desenrolo.

## Descrición

Aplicación web de axuda na xestión de negocios pequenos. Os usuarios poderán acceder ós datos dos seus clientes, engadir mais, eliminalos, modificar os existentes, facer búsquedas, pedir citas ou consultar as citas do día e descargar facturas dos traballos realizados.

- Tecnoloxías ou linguaxes empregados para a realización do front-end: HTML, CSS e JavaScript.  
- Tecnoloxías ou linguaxes empregados para a realización do back-end:  
-SQL para a creación e engadido de datos.  
-PHP para configurar o inicio de sesión dos usuarios.  
-Java xunto co framework Spring para a creación da api para o acceso á base de datos 
-Xampp co phpmyadmin como servidor de base de datos  

## Instalación / Posta en marcha

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

## Uso

Cun menú intuitivo e fácil de usar, poderase acceder a listas de clientes, servizos e coches e facer unha rápida búsqueda para acceder ós detalles de cada un.
Ca mesma facilidade poderase engadir, actualizar e eliminar o que se desexe.  

## Sobre o autor

O meu nome é Sandra e son alumna de Desenvolvemento de Aplicacións Web.  

Comencei hai uns anos neste mundo da informática sen saber nada. Polo tanto, ainda non me considero "boa" en nada, nin sinto que domine ninguha tecnoloxía. Aínda me queda moito por aprender pero, penso que vou por bo camiño.  

Este proxecto xurdeu como idea ó ver a necesidade dunha aplicación propia nun negocio da zona do sector de limpeza de automóbiles e pequenos traballos de chapa, pintura e mecánica.  

Os meus datos de contacto: sandrasm.job5@gmail.com

## Licenza

[Lincenza](LICENSE.md)

## Índice

> *EXPLICACIÓN*: Simplemente indexa ordenadamente todo o tey proxecto.

1. [Anteproyecto](doc/documentos/1_Anteproxecto.md)
2. [Análise](doc/documentos/2_Analise.md)
3. [Deseño](doc/documentos/3_Deseño.md)
4. [Codificación e probas](doc/documentos/4_Codificacion_e_probas.md)
5. [Implantación](doc/documentos/5_Implantación.md)
6. [Referencias](doc/documentos/6_Referencias.md)
7. [Incidencias](doc/documentos/7_Incidencias.md)

## Guía de contribución

Cómo contribuir a este proxecto: 
 - Engadindo funcionalidades como:
   - O calendario de citas
   - A posibiidade de descargar as facturas dos traballos realizados
 - Corrixindo e optimizando o código tanto do front como do back
 - Integrando Sass no front

## Links
