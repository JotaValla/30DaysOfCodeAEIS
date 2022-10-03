
# QUINTO DIA - 💳TARJETA💳

---
## Un poco de contexto:

Para esto, vamos a hacer uso del algoritmo de módulo 10 o también conocido como Fórmula de Luhn. Este algoritmo se aplica para validar diversidad de números de verificación, **tarjetas de débito o crédito e incluso números IMEI.**


*Lo aplicaremos para validar un número de tarjeta de crédito:*


**4	5	3	9	3	1	9	5	0	3	4	3	6	4	6	7**


*El primer paso del algoritmo es duplicar cada segundo dígito empezando desde la derecha*


4	
3	
3	
9	
0	
4	
6	
6
	
8	
6	
6	
18	
0	
8	
12	
12	

Ahora, en este duplicado si el resultado es mayor que 9 le restamos 9




4	
3	
3	
9	
0	
4	
6	
6


8	
6	
6	
18	
0	
8	
12	
12	


8	
6	
6	
9	
0	
8	
3	
3	


Luego, concatenamos los dígitos que no utilizamos para el cálculo anterior.




**8	5	6	9	6	1	9	5	0	3	8	3	3	4	3	7**

Finalmente comprobaremos que la suma sea divisible para 10. Si esto ocurre, tenemos que indicarle al usuario que el número de tarjeta es válido o no 😎

---
## Que se debe presentar?

 - Programa una función o bloque de código que nos permita comprobar si un número de tarjeta es válido o no, esto aplicando el algoritmo anterior.

---
## Como lo resolvi

Para la solucion de **Validacion de tarjetas** primero se realizo trabajo con las posiciondes del array para poder acceder a los segundo valores de la derecha

#### Un poco de contexto de los metodos programados


| Nombre | Retorno     | Explicacion                       |
| :-------- | :------- | :-------------------------------- |
| `validarTarjeta`      | `boolean ` | En este metodo *se trabaja con el string* de la tarjeta insertada por el usuario y se ingresa digito por digito en un bucle **mediante manejo de strings**, luego de esto se recorre desde la derecha, pero accediendo a cada segundo digito para luego multiplicar y hacer la formula de luhn, finalmente se verifica *si la suma es divisible para 10* y **se retorna el valor de verdad**|| :-------- | :------- | :-------------------------------- |
---
## Autores

- [@Ritz_Jimmy](https://www.instagram.com/ritz_jimmy/?hl=es)
- Propuesto por [@aeis_epn](https://www.instagram.com/aeis_epn/?hl=es)


## Si tienes alguna duda me puedes encontrar en

[![](https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white)](https://web.telegram.org/k/#@JotastarValla)
[![](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](http://wa.me/5930992675567)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/jotavalla)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white
)](https://www.instagram.com/ritz_jimmy/?hl=es)
