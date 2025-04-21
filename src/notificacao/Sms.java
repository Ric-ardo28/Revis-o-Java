package notificacao;

public class Sms extends Notificar{
	public Sms(String destinatario) {
		super(destinatario);
	}

	public void enviar() {
		System.out.println("📱SMS: Sua fatura foi gerada e enviada por SMS para o destinatario: " + getDestinatario());
	}
}


