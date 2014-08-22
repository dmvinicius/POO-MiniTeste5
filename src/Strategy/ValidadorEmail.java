package Strategy;

public class ValidadorEmail extends Validador {

	public ValidadorEmail(String texto) {
		super(texto);
		
	}

	@Override
	public void validarCampo(String texto) {
		if(texto.contains("@")){
			System.out.println("é um email");
		}else{
			System.out.println("não é um email");
		}
	}

	
}
