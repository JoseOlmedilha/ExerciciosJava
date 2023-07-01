package entidades;

public class Produto {
	
	private String nomeProduto;
	private Double precoProduto;
	
	public Produto() {
		
	}
	
	public Produto(String _nomeProduto, Double _precoProduto) {
		this.nomeProduto = _nomeProduto;
		this.precoProduto = _precoProduto;
		
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
