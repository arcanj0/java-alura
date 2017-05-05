public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public double getTotal(){
		
		return this.total;
		
	}
	
	void adicionaTributavel(Tributavel t){
		
		System.out.println("Adicionando Tributável: " + t);
		
		this.total += t.calculaTributos();
		
	}

}
