
# CUARTO DIA - 📅FECHAS📅

---
## Un poco de contexto:
📅 Supongamos que tenemos dos fechas **Fecha 1: 04/04/2022** y **Fecha 2: 23/04/2022**, fechas de inicio y fin, respectivamente. Y quiero distribuir un numero n de horas en este rango de fechas.



Por ejemplo, quiero distribuir **120 horas**, en las fechas indicadas anteriormente, sin considerar los fines de semana, el programa me debería de mostrar: `08:00:00. `

---
## Que se debe presentar?

 - Programa una función que reciba fecha 1 y fecha 2 y el número n de horas total a distribuir, y nos retorne la cantidad de horas, minutos y segundos (de ser el caso) que tiene que dedicar diariamente una persona para lograr cumplir n horas en el rango de fechas comprendido entre Fecha 1 y Fecha 2, sin considerar los fines de semana.

---
## Como lo resolvi

Para la solucion de **Fechas** se manejo una aplicacion de **POO(Programacion orientada a objetos)** para lo cual se separo en dos clases las cuales son Fecha y Hora, mismas que serviran par dar formato del cual se solicito.

#### Un poco de contexto de los metodos programados


| Nombre | Retorno     | Explicacion                       |
| :-------- | :------- | :-------------------------------- |
| `transfFecha`      | `LocalDate ` | Este metodo como parametro recibe una fecha y se crea un objeto `localDate`, con la cual se accede a los parametros de la clase Fecha para crear este objeto que sera de una *gran ayuda para los siguientes metodos*. || :-------- | :------- | :-------------------------------- |
| `cantDias`      | `int ` | Este metodo toma dos fechas previamente transformadas a objetos `LocalDate`, con lo cual se crea un objeto de tipo `Duration`, la misma que permite acceder a la* cantidad de dias* entre las dos fechas y se retorna los dias|| :-------- | :------- | :-------------------------------- |
| `restarSD`      | `int ` |En este metodo se aplica los anteriores metodo par alo cual en este lo que se hace es *se recorre desde la fecha primera hasta la segunda* y con una variable temporal se añadira un dia, esto para poder recorrer todo los dias y mediante los metodo del objeto `LocalDate` se verifica si son **sabados y domingos**, de ser el caso se resta los dias. || :-------- | :------- | :-------------------------------- |
| `calcularTiempo`      | `String ` |En este metodo *se calcula las horas*, dividiendo el tiempo que designo el usuario para la **cantidad de dias** previamente restados los fines de semana, y se hace algunos calculos para no tener horas decimales, y darle el formato solicitado |

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
