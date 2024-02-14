# ConsultorPia Front Preparació Taller

Hola Developers, seguint aquesta guia us podreu muntar la part backend del taller.

## Instal·lar IntelliJ Community Edition

[Link](https://www.jetbrains.com/idea/download/?section=windows)

La primera opció que surt és la de pago, si feu scroll cap abaix us sortirà la community (gratuïta)

## Preparar el projecte

- 1- Feu Fork del projecte (amb això us creeu una copia del projecte al vostre compte que podreu editar i utilitzat amb git).
- 2- Cloneu aquest repositori en la carpeta del vostre operatiu que vulgueu, però que quedi clar que es el back.
- 3- Obriu amb el IntelliJ la carpeta
- 4- Obriu la terminal de dins el projecte i executeu `mvn clean install -U`

## Arrancar el projecte

- 1- A la toolbar superior dreta, a l'esquerra de la fletxa d'arrancar projecte, fer click en el desplegable i després fer click a 'Edit Configurations'
- 2- Fer click al '+' per afegir una configuració del tipus Application
- 3- A la secció de Main class fer click al botó de browse de la dreta
- 4- Seleccionar la classe ConsultorPiaApplication
- 5- Fer click a OK i arrancar amb la fletxa verda el projecte
- 6- En algun moment us sortirà un pop up o pestanya abaix a la dreta. Feu click a Enable Processing.