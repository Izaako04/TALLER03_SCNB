package communications;


import payment.Pago;

public class SMS implements Notificable{

    @Override
    public void notificar(Pago pago) {
        // Enviar SMS
    }
    
}
