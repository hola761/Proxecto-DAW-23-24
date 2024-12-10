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

> *EXPLICACIÓN*: Este documento será a "*páxina de aterrizaxe*" do teu proxecto. Será ou primeiro que vexan vos que se interesen por el. Cúida a sua redacción con todo ou mimo. Elimina posteriormente todas as lineas "EXPLICACIÓN*" cando creas finalizada a súa redacción.
> Podes acompañar á redacción deste ficheiro con imaxes ou gifs, pero non abuses deles.

## Taboleiro do proyecto

> *EXPLICACIÓN:* neste punto indica se o proyecto está en fase de desenrolo ou finalizado.

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

> *EXPLICACIÓN*: Realiza unha breve descrición de quen es (perfil profesional), os teus puntos fortes, ou tecnoloxías que máis dominas... a motivación do proxecto, tendo sobre todo en conta un nicho de mercado sen explotar.. *Non máis de 200 palabras**. Indica a forma fiable de contactar contigo durante o proceso de creación do proxecto.  
> 
O meu nome é Sandra e son alumna de Desenrolo de Aplicacións Web.  

 *REVISAR ESTE PÁRRAFO*  
Son unha persoa que disfruta de aprender cousas novas e que veu a posibilidade de cambiar de sector despois de algúns anos de traballar en hostelería e fábrica. Aínda que os inicios foron complicados ó descoñecer por completo o máis básico deste sector, a medida que fun aprendendo disfruto mais e atrévome mais a probar e aprender cousas novas.  
 *REVISAR HASTA AQUÍ*  

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

> EXPLICACIÓN*: Ligazóns externas e descipciones destas ligazóns que creas conveniente indicar aquí. Xeralmente xa van estar integrados coa túa documentación, pero se requires realizar unha listaxe deles, leste é o lugar.
