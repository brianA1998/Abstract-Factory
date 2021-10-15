package implementacion;

import interfaces.IserviceInternet;

public class ServicioInternetVacio implements IserviceInternet {

	@Override
	public void crearServicioInternet() {
		System.out.println("NO SE ESPECIFICO NINGUN SERVICIO DE INTERNET");
	}

}
