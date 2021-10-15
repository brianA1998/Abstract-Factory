package main;

import interfaces.FabricaAbstracta;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(String tipoFabrica) {
		if (tipoFabrica.equalsIgnoreCase("INTERNET")) {
			return new FabricaServicioInternet();
		} else if (tipoFabrica.equalsIgnoreCase("TELEFONIA")) {
			return new FabricaServicioTelefonia();
		}
		return null;
	}

}
