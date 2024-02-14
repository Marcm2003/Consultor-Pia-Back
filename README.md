# ConsultorPia Front Preparació Taller

Hola Developers, seguint aquesta guia us podreu muntar la part backend del taller.

## Instal·lar IntelliJ Community Edition

[Link](https://www.jetbrains.com/idea/download/?section=windows)

La primera opció que surt és la de pago, si feu scroll cap abaix us sortirà la community (gratuïta)

## Preparar el projecte

- 1- Cloneu aquest repositori en la carpeta del vostre operatiu que volgueu, però que quedi clar que es el back.
- 2- Obriu amb el IntelliJ la carpeta
- 3- Obriu la terminal de dins el projecte i executeu `mvn clean install -U`
- 4- En algun moment us sortira un pop up o pestanya abaix a la dreta. Feu click a Enable Processing.
- 5- En el cas d'haver tancat la pestanya repetir aquests ultims 4 passos

## Arrancar el projecte

- 1- A la toolbar superior dreta, al l'esquerra de la fetxa d'arrancar projecte fer click a 'Edit Configurations'
- 2- Fer click al '+' per afegir una configuració
- 3- A la secció de Main class fer click al botó de browse de la dreta
- 4- Seleccionar la classe ConsultorPiaApplication
- 5- Fer click a OK i arrancar amb la fletxa verda el projecte