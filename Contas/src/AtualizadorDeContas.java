class AtualizadorDeContas{
	
	private double saldoTotal = 0.0;
	private double selic;
	
	public AtualizadorDeContas(double novaSelic){
		
		this.selic = novaSelic;
		
	}
	
	public double getSaldoTotal() {
		
		return saldoTotal;
		
	}
	
	public double getSelic() {
		
		return selic;
		
	}
	
	public void setSelic(double selic) {
		
		this.selic = selic;
		
	}	
	
	public void processa(Conta conta){
		
		System.out.println("O saldo atual da conta é: " + conta.getSaldo() );
		
		conta.atualiza(this.selic);
		
		System.out.println("O saldo da conta depois de atualizado é: " + conta.getSaldo());
		System.out.println("==============================");
		
		this.saldoTotal += conta.getSaldo();
		
	}
	
}