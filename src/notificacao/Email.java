package notificacao;

public class Email extends Notificar{

	public Email(String destinatario) {
		super(destinatario);

	}
	public void enviar() {
		System.out.println("✉️E-mail: Sua fatura foi gerada e enviada por E-mail!para o destinatario: " + getDestinatario());
	}
}
