package notificacao;

public class Main {
	public static void main(String[] args) {

		Notificar notificar = new Email("Ricardo28@gmail.com");
		notificar.enviar();

		Notificar notificar2 = new Sms("+55 11 947973045");
		notificar2.enviar();

		Notificar notificar3 = new PushNotification("Ricardo2803");
		notificar3.enviar();



	}
	}

