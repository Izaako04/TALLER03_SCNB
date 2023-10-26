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

2. En la clase PagoPayPal se viola el principio de Liskov Substitution (LSP) ya que si no se tiene iniciada la sesión no se realiza 
   el cobro en el método realizarCobro() por lo que se modifica el comportamiento esperado de dicho método.
   Para solucionarlo se utilizó un constructor de PagoPayPal que reciba como parámetro una sesión por lo que al llamar al método 
   realizarCobro() ya se tendría iniciada la sesión.
