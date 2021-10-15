package main;

import implementacion.ServicioInternetAsimetrico;
import implementacion.ServicioInternetSimetrico;
import implementacion.ServicioInternetVacio;
import interfaces.FabricaAbstracta;
import interfaces.IserviceInternet;
import interfaces.IserviceTelefonia;

public class FabricaServicioInternet extends FabricaAbstracta {

	@Override
	public IserviceInternet getInternet(String tipoInternet) {
		if (tipoInternet == null) {
			return new ServicioInternetVacio();

		}
		if (tipoInternet.equalsIgnoreCase("SIMETRICO")) {
			return new ServicioInternetSimetrico();
		} else if (tipoInternet.equalsIgnoreCase("ASIMETRICO")) {
			return new ServicioInternetAsimetrico();
		}

		return new ServicioInternetVacio();

	}

	@Override
	public IserviceTelefonia getTelefonia(String tipoTelefonia) {
		// TODO Auto-generated method stub
		return null;
	}

}
