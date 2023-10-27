# TALLER03_SCNB

Sección B)
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

Sección C)

a) Identificar las violaciones:
   1. En la clase Compra existen dos constructores sobrecargados, uno con el parámetro de un objeto tipo Pago y otro con el parámetro de tipo PagoPaypal. Esto lo hace vulnerable que al aparecer un nuevo tipo de pago que agregue otra sobrecarga del constructor, violentando el DIP. 
      - La solución que se podría aplicar sería el crear una interfaz de PaymentMethod, y que cada clase que herede de Pago pueda servir como parámetro del constructor de Compra.

   2. En la clase PagoPayPal se viola el principio de Liskov Substitution (LSP). Si no se tiene iniciada la sesión, no se realiza el cobro en el método realizarCobro().  Por lo tanto, se modifica el comportamiento esperado de dicho método.
      - Para solucionarlo se utilizó un constructor de PagoPayPal, que reciba como parámetro una sesión, por medio de un objeto tipo Session. Consiguiendo que al llamar al método realizarCobro() se tendría iniciada la sesión.
   3. En la clase Notificacion, se esta violando el principio de OCP, ya que esta clase debe ser abierta a modificaciones en caso de querer agregar más métodos de pago, se debe crear una nueva interfaz Notificable que sea implementable por cada clase hija de Pago y sea capaz de ajustarlo dependiendo de las características específicas de la clase. 
