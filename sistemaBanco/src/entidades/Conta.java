package entidades;

import excecao.MainExcecao;

public class Conta {
	
	private Integer numero;
	private String nomeTitular;
	private Double saldo;
	private Double limiteSaque;
	
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String _nomeTitular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.nomeTitular = _nomeTitular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	
	
	public Integer getNumero() {
		return numero;
	}

	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	
	public String getNomeTitular() {
		return nomeTitular;
	}

	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
	public Double getSaldo() {
		return saldo;
	}

	
	public Double getLimiteSaque() {
		return limiteSaque;
	}

	
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	
	public void deposito(Double depositar) {
		saldo += depositar;
	}
	
	
	public void sacar(Double sacar) throws MainExcecao{
		if(sacar > limiteSaque) {
			throw new MainExcecao("O valor do saque excede o limite ");
		}
		if(sacar > saldo) {
			throw new MainExcecao("O saldo para saque é indisponivel");
		}
		saldo -= sacar;
		
	}
	
	
	
	
	
	
}
