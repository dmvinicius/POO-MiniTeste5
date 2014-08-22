package Strategy;

public abstract class Validador {
	
	protected String texto;
	
	public Validador(String texto){
		this.texto=texto;
	}
	
	public abstract void validarCampo(String texto);

}