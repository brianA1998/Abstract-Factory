package implementacion;

import interfaces.IserviceInternet;

public class ServicioInternetAsimetrico implements IserviceInternet {
	private String nombre;
	private String codigo;
	private int monto;

	public ServicioInternetAsimetrico() {
		this.nombre = "Gold";
		this.codigo = "BAS978";
		this.monto = 3000;
	}

	@Override
	public void crearServicioInternet() {
		System.out.println("Se creo un servicio de internet asimetrico");
	}

}
