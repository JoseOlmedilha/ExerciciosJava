package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaImposto;
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco , Double taxa) {
		super(nome,preco);
		this.taxaImposto = taxa;
	}

	public Double getTaxaImposto() {
		return taxaImposto;
	}

	public void setTaxaImposto(Double taxaImposto) {
		this.taxaImposto = taxaImposto;
	}
	
	public Double totalPrecoIm() {
		return getPreco() + taxaImposto;
	}
	
	@Override
	public String tagPreco() {
		return super.getNome() 
				+ "  $: " 
				+ String.format("%.2f",totalPrecoIm()) 
				+"(Taxa de Imposto: $" 
				+ String.format("%.2f", taxaImposto) 
				+ ")";
		
	}
}
