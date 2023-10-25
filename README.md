# TALLER03_SCNB

a) Identifique los principios SOLID que se están violando:
  - Single Responsability.
  - Liskov Principle.
  - Open-Closed Principle.

b) Para cada principio violado, argumente su respuesta.

1. El primer principo en ser vulnerado es el Single Responsability dado que La clase ShoppingCart,
   se pueden observar dos funciones demás; Esta clase no tiene un sólo trabajo y por lo tanto está abarcando demás.

3. La clase DigitalProduct no toma en cuenta el principo de Liskov dado que la clase derivada no puede regresar a su clase base,
   puesto que las diferencias existentes en el código generan resultados diferentes al instanciar metodos similares.

5. La clase IvaCalculator infringe el principo de Open-Closed debido a la lógica del código, deberiamos estar modificando dicho codigo,
   en vez de estar extendiendo el código.
