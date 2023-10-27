package payment;

import communications.Session;

public class PagoPaypal extends Pago implements PaymentMethod{
    
    public PagoPaypal(Session s){
        super.session = s;
    }
    
    @Override
    public void realizarCobro(double monto) {
        // cargar el monto de compra al método de pago, usando la sesión, 
        // sin necesidad de conocer un estado loggedIn
    }
    
}
