abstract class Conta{
	
	protected double saldo;
	private int numero;
	
	public double getSaldo(){
		
		return this.saldo;
		
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		
		if (valor < 0){
		
			throw new ValorInvalidoException(valor);
			
		} else {
			
			this.saldo += valor;
			
		}
		
	}
	
	public void saca(double valor){
		
		this.saldo -= valor;
		
	}
	
	public abstract void atualiza(double taxa);
	
	public String toString(){
	
		return "Este objeto tem saldo: " + this.saldo;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	

	
}