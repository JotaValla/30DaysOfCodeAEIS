
# SEXTO DIA - 🎰BINGO🎰

---
## Un poco de contexto:
El bingo es un **juego de azar** que consiste en un bombo con un número determinado de bolas numeradas en su interior. Los jugadores juegan con cartones con números aleatorios escritos en ellos, dentro del rango correspondiente. Un locutor va sacando bolas del bombo, anunciando los números en voz alta. Si un jugador tiene dicho número en su cartón lo tacha, y el juego continúa así hasta que alguien consigue marcar todos los números de su cartón, dependiendo de la modalidad.



Existen muchas variaciones de este juego, nos vamos a centrar en la versión americana o también conocida como Bingo 75. Para esto es necesario conocer cómo se distribuyen los números:


Una persona puede ganar al completar las siguientes formas:
- Diagonal
- Línea
- 4 esquinas
- Cartón completo

---
## Que se debe presentar?

 - Generar n tablar de bingo, debido a los n participantes que puedan existir
 - Programar un metodo que haga la persona que saca los numeros  aleatoriamente para el juego
 - El usuario siguiendo las reglas del juego debera decir "bingo" cuando haya completado las formas de ganar
---
## Como lo resolvi

Para poder manejar un tablero, se utilizo **listas dinamicas**, en este caso *ArrayList*, las cuales permitiran un mayor acceso a los elementos, al momento de agregarlos y buscarlos de ser el caso que coincidan con el numero cantado. 
#### Un poco de contexto de los metodos programados


| Nombre | Retorno     | Explicacion                       |
| :-------- | :------- | :-------------------------------- |
| `ilistas`      | `.... ` | Este metodo permite instanciar una **arraylist** previamente creadas, adicional se añade las iniciales del juego y luego se va añadiendo los valores con los cuales funciona el bingo dependiendo de su fila. || :-------- | :------- | :-------------------------------- |
| `stringTabla`      | `....` | Este metodo sirve para poder imprimir la tabla, lo que hace es darle un formato y obtener los valores para ubicarlos en su lugar|| :-------- | :------- | :-------------------------------- |
| `xcartilla`      | `ArrayList ` |En este metodo se recibe como parametro la **arraylist** a utilizar y el numero que se intercambiara por una X, esto pasara cuando se encuentre el numero que se haya cantado al usuario.|| :-------- | :------- | :-------------------------------- |
| `bolillas`      | `.... ` |En este metodo se recibe como parametros las listas, y las letras del juego se guardan para luego crera un numero random el cual se generara y dependiendo de la casilla que coincida se llamara al metodo anterior para cambiarlo por una X |

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
