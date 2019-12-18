# Calculadora_Prueba4
prueba 4

He empezado montandome el proyecto en ghithub al cual subi la prueba y el projectApp java Calculadora con Egit eclipse.
El proyecto creado es en maven, el pom es construido con dependencias de spring framework a la version 5.2.2.
he empezado creando la estrutura del proyecto con Bean, Controller, Servicios y Main divididos en paquetes separados bajo el paquete com.apache.mavenCalculadora.
He utilizado el groupId segun convención maven com.apache.maven.
Siguientemente he construido el Bean con los valores que se necesitaban segun requerimento (2 variables para los valores que se prestan a las operaciones y una para identificar la operacion )
Implementado con getters y setters el bean.
He puesto los valores como interos inicialmente pero si se ruequiere mayor precisiñon seria util modificarlos a float con limite de valor flotante a .00.
El siguiente paso ha sido crear los servicios con anotaciones spring para construir las oeraciones de suma y subtracción como da requerimiento.
Siguientemente he construido el Controller.
Aqui he mapeado los servicios de add() y subtract() como servicios POST que devuelven un resultado en base a los valores de entrada.
He pasado a contruir el main de la calculadora.
Aqui he llamado el metodo SpringApplication.run() para correr la app rodeado de un try/catch para capturar exepciones si se incurre en errores al lanzar el proyecto. 
He añadido las librerias tracer al proyecto para insertar trazas 
He creado las clases de test con junit5 generandolas atraves los metodos y creando tests dinamicos.
Todos los cambios han sido divididos por rama segun el tipo de clase que estaba desarrollando utilizando la convencion de git para la separacion y la identificacion de los desarrollos.
