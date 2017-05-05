public class Exercicio1 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		AtualizadorDeContas atualizador;
		
		//Teste do metodo reescrito toString
		Conta conta = new ContaCorrente();
		System.out.println(conta);
		
		double selic = 12.5;
		
		atualizador = new AtualizadorDeContas(selic);
			
		try {
			
			cc.deposita(-1000);
			
		} catch (ValorInvalidoException e){
			
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
					
		cp.deposita(1000);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

		atualizador.processa(cc);
		atualizador.processa(cp);
		
		System.out.println("O saldo total de todas as contas é: " + atualizador.getSaldoTotal());

	}

}
