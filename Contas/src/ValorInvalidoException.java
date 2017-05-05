public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException(double valor){
		
		super("Ocorreu um erro com o valor enviado: " + valor);
		
	}
	
}