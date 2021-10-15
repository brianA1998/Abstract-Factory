package main;

import interfaces.FabricaAbstracta;
import interfaces.IserviceInternet;
import interfaces.IserviceTelefonia;

public class Main {

	public static void main(String[] args) {

		FabricaAbstracta fabricaInternet = FabricaProductor.getFactory("INTERNET");
		IserviceInternet internetSimetrico = fabricaInternet.getInternet("SIMETRICO");
		internetSimetrico.crearServicioInternet();
		IserviceInternet internetAsimetrico = fabricaInternet.getInternet("ASIMETRICO");
		internetAsimetrico.crearServicioInternet();
		IserviceInternet internetVacio = fabricaInternet.getInternet("sdad");
		internetVacio.crearServicioInternet();

		FabricaAbstracta fabricaTelefonia = FabricaProductor.getFactory("TELEFONIA");
		IserviceTelefonia telefonia = fabricaTelefonia.getTelefonia("TELEFONIA IP");
		IserviceTelefonia telefoniaVacia = fabricaTelefonia.getTelefonia("SDAS");
		telefonia.crearServicioTelefonia();
		telefoniaVacia.crearServicioTelefonia();
	}

}
