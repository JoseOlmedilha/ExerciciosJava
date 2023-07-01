package entidades;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
			if(super.getRendaAnual() < 20000) {
				 return (super.getRendaAnual() * 0.15) - (gastoSaude * 0.5);
			}
			else {
				return (super.getRendaAnual() * 0.25) - (gastoSaude * 0.5);
			}
	
	}

	
}
