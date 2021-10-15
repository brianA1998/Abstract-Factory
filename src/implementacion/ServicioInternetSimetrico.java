package implementacion;

import interfaces.IserviceInternet;

public class ServicioInternetSimetrico implements IserviceInternet {

	private String nombre;
	private String codigo;
	private int monto;

	public ServicioInternetSimetrico() {
		this.nombre = "Platinum";
		this.codigo = "AA123";
		this.monto = 1500;
	}

	@Override
	public void crearServicioInternet() {
		System.out.println("Se creo un servicio de internet simetrico");
	}

}
