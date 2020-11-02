# Investigacion sobre java (Lenguaje de programacion)

## introduccion a java

Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, a menos que tengan Java instalado y cada día se crean más. Java es rápido, seguro y fiable. Desde portátiles hasta centros de datos, desde consolas para juegos hasta computadoras avanzadas, desde teléfonos móviles hasta Internet, Java está en todas partes, si es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de 2012, uno de los lenguajes de programación más populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos diez millones de usuarios reportados.
El lenguaje de programación Java fue desarrollado originalmente por James Gosling, de Sun Microsystems (constituida en 1983 y posteriormente adquirida el 27 de enero de 2010 por la compañía Oracle),4 y publicado en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems. Su sintaxis deriva en gran medida de C y C++, pero tiene menos utilidades de bajo nivel que cualquiera de ellos. Las aplicaciones de Java son compiladas a bytecode (clase Java), que puede ejecutarse en cualquier máquina virtual Java (JVM) sin importar la arquitectura de la computadora subyacente.

## Historia

Java se creó como una herramienta de programación para ser usada en un proyecto de set-top-box en una pequeña operación denominada the Green Project en Sun Microsystems en 1991. El equipo (Green Team), compuesto por trece personas y dirigido por James Gosling, trabajó durante 18 meses en Sand Hill Road, en Menlo Park, para desarrollarlo.
El lenguaje se denominó inicialmente Oak (por un roble que había fuera de la oficina de Gosling), luego pasó a llamarse Green tras descubrir que Oak era ya una marca comercial registrada para adaptadores de tarjetas gráficas, y finalmente se le renombró Java.
Es frecuentada por algunos de los miembros del equipo. Pero no está claro si es un acrónimo o no, aunque algunas fuentes señalan que podría tratarse de las iniciales de sus diseñadores: James Gosling, Arthur Van Hoff y Andy Bechtolsheim. Otros abogan por el siguiente acrónimo, Just Another Vague Acronym ("sólo otro acrónimo ambiguo más"). La hipótesis que más fuerza tiene es la de que Java debe su nombre a un tipo de café disponible en la cafetería cercana; de ahí que el icono de Java sea una taza de café caliente. Un pequeño signo que da fuerza a esta teoría es que los cuatro primeros bytes (el número mágico) de los archivos.class que genera el compilador, son en hexadecimal, 0xCAFEBABE. A pesar de todas estas teorías, el nombre fue sacado al parecer de una lista aleatoria de palabras.5

## FILOSOFIA DE JAVA
El lenguaje Java se creó con cinco objetivos principales:
1.	Debería usar el paradigma de la programación orientada a objetos.
2.	Debería permitir la ejecución de un mismo programa en múltiples sistemas operativos.
3.	Debería incluir por defecto soporte para trabajo en red.
4.	Debería diseñarse para ejecutar código en sistemas remotos de forma segura.
5.	Debería ser fácil de usar y tomar lo mejor de otros lenguajes orientados a objetos, como C++.
Para conseguir la ejecución de código remoto y el soporte de red, los programadores de Java a veces recurren a extensiones como CORBA (Common Object Request Broker Architecture), Internet Communications Engine u OSGi, respectivamente.

# Caracteristicas de java

Los creadores iniciales de java "sun" describieron su lenguaje de programacion como:
* Simple
* Orientado a Objetos
* Tipado estáticamente
* Distribuido
* Interpretado
* Robusto
* Seguro
* de Arquitectura Neutral
* Multihilo
* con Recolector de basura (Garbage Collector)
* Portable
* de Alto Rendimiento: sobre todo con la aparición de hardware especializado y mejor software
* Dinámico

Java es una tecnología que no sólo se reduce al lenguaje sino que además provee de una máquina virtual Java que permite ejecutar código compilado Java, sea cual sea la plataforma que exista por debajo; plataforma tanto hardware, como software (el sistema operativo que soporte ese hardware). El apoyo a esta tecnología viene dado por la gran cantidad de fabricantes que apoyan esta especificación de máquina virtual.
Aprender el lenguaje de programación Java requiere tiempo y esfuerzo, pero en este curso trataremos de sentar las bases para el conocimiento general del lenguaje. El lenguaje se inspira en otros lenguajes:

* sentencias comunes de C y C++ (sintaxis parecida a dichos lenguajes)
* concurrencia parecida a la de Mesa (un lenguaje de investigación de Xerox)
* interrupciones parecidas a las de Modula-3
* tratamiento de enlace dinámico de código nuevo parecido al de Lisp
* definiciones de interfaces parecidas a las de Objective C
* gestión de almacenamiento automático parecida a la de 

# La máquina virtual Java.
Para establecer Java como parte integral de la red, el compilador Java compila su código a un fichero objeto de formato independiente de la arquitectura de la máquina en que se ejecutará. Cualquier máquina que tenga el sistema de ejecución (runtime) puede ejecutar ese código objeto, sin importar en modo alguno la máquina en que ha sido generado.
El código fuente Java se "compila" a un código de bytes de alto nivel independiente de la máquina. Este código (bytecode) está diseñado para ejecutarse en una máquina hipotética que es implementada por un sistema runtime, que sí es dependiente de la máquina. Por lo tanto, lo que verdaderamente es dependiente del sistema es la Máquina Virtual Java (JVM) y las librerías fundamentales, que también nos permitirían acceder directamente al hardware de la máquina. El compilador Java genera bytecode que serán ejecutables dondequiera que exista una JVM.  