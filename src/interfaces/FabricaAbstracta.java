package interfaces;

public abstract class FabricaAbstracta {
	public abstract IserviceInternet getInternet(String tipoInternet);

	public abstract IserviceTelefonia getTelefonia(String tipoTelefonia);
}
