Java admite un uso ampliado de la palabra clave import. Siguiendo a import la palabra clave static, se puede usar una declaración de import para importar los miembros estáticos de una clase o interfaz. Esto se llama Static Import. Al usar Static Import, es posible hacer referencia a miembros estáticos directamente por sus nombres, sin tener que calificarlos con el nombre de su clase. Esto simplifica y acorta la sintaxis requerida para usar un miembro estático.

Tabla de Contenido
1. Introducción a Static Import
2. Uso de Static Import
3. Ejemplo de ‘import static’
4. Puntos Finales
1. Introducción a Static Import
   En Java, el concepto de importación estática (Static Import) se introduce en la versión 1.5. Con la ayuda de la importación estática, podemos acceder a los miembros estáticos de una clase directamente sin nombre de clase o cualquier objeto. Por ejemplo: siempre usamos el método sqrt() de la clase Math, es decir Math.sqrt(), pero al usar la importación estática podemos acceder al método sqrt() directamente.

Según SUN microSystem, mejorará la legibilidad del código y mejorará la codificación. Pero según los expertos en programación, generará confusión y no será bueno para la programación. Si no hay ningún requisito específico, entonces no deberíamos usar static import.



import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
Después de estas declaraciones, ya no es necesario calificar sqrt() o pow() con su nombre de clase. Por lo tanto, la expresión se puede especificar más cómodamente, como se muestra aquí:

x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
Como puede ver, esta forma es considerablemente más corta y más fácil de leer.

Hay dos formas generales de la declaración import static.
El primero, que se usa en el ejemplo anterior, muestra un solo nombre. Su forma general se muestra aquí:
import static pkg.nombre-tipo.nombre-miembro-static;
Aquí, nombre-tipo es el nombre de una clase o interfaz que contiene el miembro estático deseado. Su nombre completo del paquete está especificado por pkg. El nombre del miembro se especifica mediante nombre-miembro-static.

La segunda forma de static import importa todos los miembros estáticos. Su forma general se muestra aquí:
import static pkg.nombre-tipo.*
Si va a utilizar muchos métodos estáticos o campos definidos por una clase, este forma le permite visualizarlos sin tener que especificarlos individualmente. Por lo tanto, el programa anterior podría haber utilizado esta única declaración de importación para poner a disposición tanto pow() como sqrt() (y todos los otros miembros estáticos de Math):

import static java.lang.Math.*;
4. Puntos Finales
   Por supuesto, la importación estática (static import) no está limitada solo a la clase de Math o solo a métodos. Por ejemplo, lo siguiente trae el campo estático System.out a la vista:

import static java.lang.System.out;
Después de esta declaración, puede enviar a la consola sin tener que calificar con System, como se muestra aquí:

out.println("Después de importar System.out, se puede utilizar directamente.");
Si importar System.out como se acaba de mostrar es una buena idea, está sujeto a debate. A pesar de que acorta la declaración, ya no está claro instantáneamente para cualquiera que lea el programa que la salida a la que se refiere es a System.out.

Por muy conveniente que sea static import, es importante no abusar de ella. Recuerde, una de las razones por las que Java organiza sus bibliotecas en paquetes es para evitar las colisiones de espacios de nombres. Cuando importa miembros estáticos, está trayendo a esos miembros al espacio de nombres global. Por lo tanto, está aumentando el potencial de conflictos de espacio de nombres y la ocultación involuntaria de otros nombres.

Si está usando un miembro estático una o dos veces en el programa, es mejor no importarlo. Además, algunos nombres estáticos, como System.out, son tan reconocibles que es posible que no desee importarlos. La importación estática está diseñada para aquellas situaciones en las que se utiliza un miembro estático repetidamente, como cuando se realizan una serie de cálculos matemáticos. En esencia, usted debe usar, pero no abusar, de esta característica.