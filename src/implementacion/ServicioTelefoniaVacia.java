package implementacion;

import interfaces.IserviceTelefonia;

public class ServicioTelefoniaVacia implements IserviceTelefonia {

	@Override
	public void crearServicioTelefonia() {
		System.out.println("NO SE ESPECIFICO NINGUN TIPO DE TELEFONIA");

	}

}
