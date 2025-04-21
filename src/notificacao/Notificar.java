package notificacao;

public abstract class Notificar {
	private String destinatario;

	public Notificar(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public abstract void enviar();
}
