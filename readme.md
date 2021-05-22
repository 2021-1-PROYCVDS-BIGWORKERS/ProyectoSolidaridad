[![novenix](https://circleci.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/tree/master.svg?style=svg)](https://circleci.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/tree/master)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/de982a7ac3bf42d8a96239b0f318da50)](https://www.codacy.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad&amp;utm_campaign=Badge_Grade)

PROYECTO SOLIDARIDAD ESCUELA
======
## CICLOS DE VIDA Y DESARROLLO DE SOFTWARE ,2021-1.

### Integrantes
| NOMBRE                 | ROL         |    
| ---------------------          |:-------------:|
| *Oscar David Rodriguez*        | *Product Owner* | 
| *Daniel Alejando Mejia Rojas*  | *Scrum Master*      |
| *Lorenzo Jose Manuel Marquez*  | *Developer*      |
| *Nicolas Torres Paez*          | *Developer*      |
| *Maria Camila Fetecua Garcia*  | *Developer*    |
  

### Descripción del producto.
  
  + **_Descripción general_**
  
   **La Plataforma Solidaridad Escuela**, es una herramienta para generar un entorno de comunicación y ayuda dentro de la comunidad de la Escuela Colombiana de Ingeniería Julio Garavito. El sistema permite que los estudiantes puedan expresar las necesidades que puedan tener de algún elemento para poder desarrollar sus actividades de forma correcta, y que los demás miembros de la comunidad puedan facilitar estos elementos a quienes lo necesitan. De igual manera los miembros de la comunidad pueden ofrecer diferentes elementos que sean de interés para los estudiantes sin que exista alguna solicitud específica. Adicionalmente el sistema cuenta con diferentes funcionalidades de reportería y administración que permite llevar un control del funcionamiento de la plataforma y del alcance que se está logrando.

  
  + **_Manual de usuario_**
  Encontramos la pagina inicial,donde podemos acceder por medio de un  usuario y contraseña.
  

  
  La aplicacion maneja 2 tipos de roles para el inicio de sesion, administrador y usuarios.
  
  
  Los servicios del admisitrador son:
  
   + Crear, actualizar, eliminar Categoria.
   + Reporte de Ofetas.
   + Reporte de Necesidades.
   + Reporte de respuestas.
   + Reporte de Categorias mas solicitadas u ofrecidas.
    
    
   Los servicios del usuario son:
   + Registrar Necesidad.
   + Registrar Oferta.
   + Registrar Respuestas.
   + Actualizar estado Necesidad. 
   + Actualizar estado Oferta.
   + Gestionar las categorias no validas. 

Al ingresar a la pagina principla encontramos las pruebas como muestra la siguiente imagen 
![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/WhatsApp%20Image%202021-05-22%20at%208.14.50%20AM.jpeg)

Encontramos el menu en la parte superior para cada uno de los procesos de nuestra aplicacion

![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(17).png)


Para Categoria tenemos tres procesos , registrar , actualizar y eliminar 

![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(21).png)

  + Para registrar una categoria necesitamos ingresar el nombre y la descripcion 

![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(18).png)

  
  + Para actualizar la categoria necesitamos el nombre de la anterior categoria en nombre , la descripcion y el estado de esta nueva
  
  ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(19).png)

  
  
  + Para eliminar la categoria necesitamos el nombre de la categoria a eliminar y su id , el cual podemos encontrar en la parte de arriba  

![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(20).png)
    
   
   + Para el reporte de ofertas tenemos dos opciones un XLS PDF 
   
   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(26).png)
    
   + Para el reporte de Necesidades.
   
   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(26).png)
    
    
    
   + Para registrar una necesidad necesitamos ingresar el nombre y la descripcion
   
   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(22).png)
   
   + Para registrar una Oferta ingresar el nombre y la descripcion 
   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(24).png)
   
   + Para registrar Respuestas ingresar el nombre , comentarios , id de la necesidad a la que le damos respuesta, id de la oferta relacionada y el nickname 
   https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(28).png
   
   + Para actualizar estado Necesidad necesitamos nombre y nuevo estado

   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(23).png)
   
   + Para actualizar estado Oferta nombre y nuevo estado
   
   ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/master/Imagenes/MicrosoftTeams-image%20(25).png)
   
 

  
  
  
  
### Arquitectura y Diseño detallado:
  
  + **_Modelo E-R._**
    ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/ER%20diagram.jpeg)
  
  + **_Diagrama de clases_**
    ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/DiagramadeClases.PNG)
  
  + **_Descripción de la arquitectura  y del Stack de tecnologías utilizado_**

 [![novenix](https://circleci.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/tree/master.svg?style=svg)](https://circleci.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/tree/master)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/de982a7ac3bf42d8a96239b0f318da50)](https://www.codacy.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad&amp;utm_campaign=Badge_Grade)
  
  + **_Enlace a la aplicación en Heroku_** 
  
  [Heroku](https://proyecto-big-workers-cvds-2021.herokuapp.com/)
 
   
  
### Descripción del proceso:
  + **_Integrantes_**
  
  | NOMBRE                   | GIT                                              |    
  | ---------------------          |:------------------------------------------:|
  | *Daniel Alejando Mejia Rojas*  | *[Desarik98](https://github.com/Desarik98)*|
  | *Lorenzo Jose Manuel Marquez*  | *[DrLolo03](https://github.com/DrLolo03)*|
  | *Nicolas Torres Paez*          | *[novenix](https://github.com/novenix)*|
  | *Maria Camila Fetecua Garcia*  | *[camilaFetecua](https://github.com/camilaFetecua)*|
  
  + **_Metodología_**
  
      En la primera reunion que realizamos planeamos cada uno de los sprints y                discutimos la importancia y el orden de cada una de las tareas para el buen              desarrollo del proyecto. Lo cual nos llevo a determinar el siguiente orden:
     
     * Sprint 1
        - Iniciar Sesión
        - Crear Categoría
        - Actualizar Categoría
        - Registrar Necesidad
        - Registrar Oferta
        - Registrar Respuestas
        
     * Sprint 2
        - Actualizar estado Necesidad
        - Actualizar estado Oferta
        - Reporte de Ofertas
        - Reporte de necesidades
        - Eliminar Categoría

     * Sprint 3
        - Reporte de Respuestas
        - Reporte de Categorías más solicitadas/ofrecidas
        - Gestión de categorías no valida
       
  + **_Enlace a Taiga_**
  
  
   Con el siguiente enlace se puede entrar a Taiga [TAIGA](https://tree.taiga.io/project/desarik-solidaridad-escuela/backlog)

  
  + **_Release-burndown chart **
  
  | SPRINT     |  SPRINT-BURNDOWN CHART  | 
  | ---------- || ------------------------:| 
  | SPRINT  1  |![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/sprint1.png)| 
  | SPRINT  2  |![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/sprint2.png) | 
  | SPRINT  3  |![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/sprint3.png) | 


  
  + **_Reporte de pruebas y de cubrimiento de las mismas_** 
      ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/pruebastotal.png)

      **Prueba Categoria**

       ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/categoria.png)

      **Prueba Necesidad**
    
       ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/pruebas3.png)

      **Prueba Oferta**
    
       ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/pruebas4.png)
    **Prueba Respuesta**
    
       ![alt text](https://github.com/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/blob/categoria-Invalida/Imagenes/pruebas5.png)


  
  + **_Reporte de análisis estático de código_**
  [![Codacy Badge](https://app.codacy.com/project/badge/Grade/de982a7ac3bf42d8a96239b0f318da50)](https://www.codacy.com/gh/2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=2021-1-PROYCVDS-BIGWORKERS/ProyectoSolidaridad&amp;utm_campaign=Badge_Grade)
  
