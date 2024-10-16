# Requerimientos do sistema

- [Requerimientos do sistema](#requerimientos-do-sistema)
  - [1- Descrición Xeral](#1--descrición-xeral)
  - [2- Funcionalidades](#2--funcionalidades)
  - [3- Tipos de usuarios](#3--tipos-de-usuarios)
  - [4- Contorno operacional](#4--contorno-operacional)
  - [5- Normativa](#5--normativa)
  - [6- Melloras futuras](#6--melloras-futuras)

Este documento describe os requirimentos para "EmotionsApp" especificando qué funcionalidade ofrecerá e de que xeito.

## 1- Descrición Xeral

Pequena aplicación, que non software de xestión, para negocios con poucos clientes e sen a necesidade dun gran software para a súa xestión. Ofrece a posiblidade de, desde unha mesma aplicación, ter unha lista dos seus clientes e/ou servizos e ter unha parte conectada cunha aplicación móvil ofrecida ós seus clientes para que podan comprar e/ou pedir cita según precise o negocio que contrate os nosos servizos.

## 2- Funcionalidades

Esta aplicación ofrecerá a posiblidade de organizar os datos dos clientes e dos seus coches, visualizar un historial dos traballos realizados para cada cliente e conectar cunha aplicación para os clientes onde podan pedir cita e/ou comprar algún producto según necesidades do negocio en cuestión.

| Acción | Descrición  |
|--------|-------------|
|  Alta de clientes, coches e/ou servizos  |  Dar de alta os clientes, coches e/ou servizos na base de datos  |
|  Baixa de clientes, coches e/ou servizos  |  Dar de baixa ós clientes, coches e/ou servizos da base de datos  |
|  Modificación de clientes, coches e/ou servizos  |  Modificar os datos dos clientes, coches e/ou servizos na base de datos  |
|  Búsqueda de clientes, coches e/ou servizos  |  Mostrar, según un criterio de búsqueda, os clientes, coches e/ou servizos que coincidan  |
|  Presentación dos servizos ofrecidos  |  Mostrar os servizos ofrecidos (esta será a parte que poderán ver os clientes)  |
|  Presentación dos coches e/ou produtos á venta  |  Mostrar os produtos á venta (esta será a parte que poderán ver os clientes)  |
## 3- Tipos de usuarios

O proxecto terá dous tipos de usuarios:  
 - Usuario administrador: terá acceso a tódolos datos. A inserir, modificar e eliminar da base de datos o que precise.  
 - Usuario xenérico: terá acceso á búsqueda e visualización de datos pero non poderá nin inserir, nin modificar, nin eliminar.

## 4- Contorno operacional

Os negocios que requiran os nosos servizos simplemente precisarán dun ordenador, unha conexión a internet e, si así o contratan, os nosos servizos de servidor, para ter acceso cando desexen, tanto desde o negocio como desde outros dispositivos, á nosa aplicación.
## 5- Normativa

A normativa que nos afecta é a seguinte  
Por unha banda, de ámbito nacional:  
[Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y garantía de los derechos digitales (LOPDPGDD)](https://www.boe.es/buscar/act.php?id=BOE-A-2018-16673)  

Por outra banda, quizais nun futuro, de ámbito europeo:  
[General Data Protection Regulation (GDPR)](https://eur-lex.europa.eu/eli/reg/2016/679/oj)  

Na parte adicada ó cliente, no pé de páxina, haberá os enlaces pertinenetes, que son:  
 - Aviso legal.
 - Política de privacidade.
 - Política de cookies.  

## 6- Melloras futuras

A mellora futura principal será a de implementar por completo a parte adicada ós clientes, tanto na web como a aplicación para móbiles. Á parte de solucionar calquer error ou problema que poida xurdir á medida que se vai usando á aplicación.