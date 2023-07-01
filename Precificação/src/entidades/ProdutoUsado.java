package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	
	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
		super();
	}
	
	public ProdutoUsado(String nome, Double preco, LocalDate data) {
		super(nome,preco);
		this.dataFabricacao = data;
		
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String tagPreco() {
		return getNome() + " (Usado) $" 
				+ String.format("%.2f",getPreco())
				+ "(Fabricado: "
				+ dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
	
}
