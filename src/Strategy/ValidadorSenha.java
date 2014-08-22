package Strategy;

public class ValidadorSenha extends Validador{


	public ValidadorSenha(String texto){
	 super(texto);
		
	}

	


	@Override
	public void validarCampo(String texto) {
		if(texto.length()<5){
			System.out.println("a senha deve ter no m�nimo 5 digitos.");
		}else{
			System.out.println(" senha v�lida");
		}
		
	}
}
