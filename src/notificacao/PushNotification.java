package notificacao;

public class PushNotification extends Notificar{
	public PushNotification(String destinatario) {
		super(destinatario);
	}
	public void enviar() {
		System.out.println("🔔Push Notification: Sua fatura foi gerada e enviada por Push Notification para o destinatario: " + getDestinatario());
	}
}
