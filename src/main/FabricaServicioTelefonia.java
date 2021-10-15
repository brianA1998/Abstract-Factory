package main;

import implementacion.ServicioTelefoniaIP;
import implementacion.ServicioTelefoniaVacia;
import interfaces.FabricaAbstracta;
import interfaces.IserviceInternet;
import interfaces.IserviceTelefonia;

public class FabricaServicioTelefonia extends FabricaAbstracta {

	@Override
	public IserviceInternet getInternet(String tipoInternet) {

		return null;
	}

	@Override
	public IserviceTelefonia getTelefonia(String tipoTelefonia) {
		if (tipoTelefonia == null) {
			return new ServicioTelefoniaVacia();
		}
		if (tipoTelefonia.equalsIgnoreCase("TELEFONIA IP")) {
			return new ServicioTelefoniaIP();
		}

		return new ServicioTelefoniaVacia();
	}

}
