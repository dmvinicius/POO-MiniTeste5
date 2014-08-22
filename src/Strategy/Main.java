package Strategy;

public class Main {

	public static void main(String[] args) {
		String texto="texto@.com";
		String senha="kjs";
		Validador v= new ValidadorEmail(texto);
		Validador x= new ValidadorSenha(senha);
		v.validarCampo(texto);
		x.validarCampo(senha);
	}

}
