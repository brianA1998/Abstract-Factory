package implementacion;

import interfaces.IserviceTelefonia;

public class ServicioTelefoniaIP implements IserviceTelefonia {

	private int minutosPorLlamada;
	private String modelo;
	private int anchoBanda;

	public ServicioTelefoniaIP() {
		this.minutosPorLlamada = 60;
		this.modelo = "Arvis";
		this.anchoBanda = 30;
	}

	@Override
	public void crearServicioTelefonia() {
		System.out.println("Se creo un servicio de telefonia IP");
	}

}
