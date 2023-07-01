package entidades;

public class PessoaJuridica extends Pessoa {

	private Integer empregados;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double renda, Integer emp) {
		super(nome, renda);
		this.empregados = emp;
	}
	
	
	public Integer getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Integer empregados) {
		this.empregados = empregados;
	}

	@Override
	public Double imposto() {
		if(empregados <= 10) {
			return super.getRendaAnual() * 0.16;
		}
		else {
			return super.getRendaAnual() * 0.14;
		}
	}
	
	
	
}
