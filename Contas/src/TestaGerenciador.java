public class TestaGerenciador {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		ContaCorrente cc = new ContaCorrente();
		SeguroDeVida sv = new SeguroDeVida();
		
		gerenciador.adicionaTributavel(sv);
		
		System.out.println(gerenciador.getTotal());
		
		cc.deposita(1000.0);
		
		System.out.printf("O saldo é: %.2f\n ", cc.getSaldo());
		
		gerenciador.adicionaTributavel(cc);
		
		System.out.printf("O saldo total é: %.2f\n ", gerenciador.getTotal()); 
			
	}

}
