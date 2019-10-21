# Azurian BackEnd

Se procedio al desarrollo de este artefacto para su posterior consumo desde FrontEnd.

# Base de datos
Segun especificacion en pdf enviado via correo se debe proporcionar el script de creacion de base datos.

*El script de creacion de la base de datos se encuentra en /resources/database.sql. Solo genera la base de datos.

* Me tome la libertad de automatizar el proceso de creacion de la tabla necesaria para la ejecucion de este artefacto
con la herramienta Liquibase. Al levantar el artefacto este procedera a correr el test unitario disponible y hara la creacion
de la tabla en la base de datos que ya debe estar creada.

## Comenzando 🚀

_Para la clonacion de este repositorio es necesario ejecutar el siguiente comando:_

```
git clone https://github.com/jjsimancas/azurian-tech-test.git
```

### Pre-requisitos 📋

* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - version 1.8.0_221
* [maven](https://maven.apache.org/) - version 3.6.0
* [MySQL](https://www.mysql.com/)- version 8.0.18


### Instalación 🔧
_EL MOTOR DE BASE DE DATOS DEBE ESTAR CORRIENDO CON LA BASE DE DATOS CREADA. LA GENERACION DE TABLAS SERA AUTOMATICA_

_Ejecutar el comando en la raiz del proyecto para el empaquetado del mismo._

```
mvn package
```

## Deployment 📦

_Ejecutar el comando para la ejecucion del artefacto._

```
java -jar target/cl-azurian-test-app-0.0.1-SNAPSHOT.jar
```

## Variables de entorno
Este artefacto esta configurado para el uso de variables de entorno en caso de querer dockerizarlo.
Por el momento estas se encuentran seteadas en el application.properties con los valores que buscara.

_Las variables de entorno son:_
* BD_HOST
* BD_PORT
* BD_NAME
* BD_USERNAME
* BD_PASSWORD
  

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Spring Boot](https://spring.io) - 2.2.0.RELEASE
* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - version 1.8.0_221
* [maven](https://maven.apache.org/) - 3.6.0
* [MySQL](https://www.mysql.com/) - 8.0.18


## Autor ✒️

_Aplicativo para optar a cargo de desarrollador para la empresa Azurian_

* **Juan Simancas** - *Desarrollador FullStack* - [jjsimancas](https://github.com/jjsimancas)

