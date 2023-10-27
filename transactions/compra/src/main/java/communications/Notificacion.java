package communications;


import payment.Pago;

public class Notificacion {
    private Notificable notification;
    
    public void notificar(Pago pago){
        notification.notificar(pago);
    }
}
