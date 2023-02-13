# Calculadora con JFlex y Cup
## Sintaxis
```java
{
    //Aquí comienzan las operaciones
    Calculate [4+5*8];
    Calculate [-(4+10/2)];
    //Comentario
    Calculate [8*9+2];
    Calculate [(5+4*3+4.3*2-4.6)/3];
}
```
## Resultado
```java
4 + 5 * 8 = 44.0
- (4 + 10 / 2) = -9.0
8 * 9 + 2 = 74.0
(5 + 4 * 3 + 4.3 * 2 - 4.6) / 3 = 7.0
```