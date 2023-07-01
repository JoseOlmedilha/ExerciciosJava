package entidades;

import java.util.ArrayList;
import java.util.List;

import entidadesEnum.NivelEmpregado;

public class Empregado {


	private String nome;
	private NivelEmpregado nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Empregado() {
		
	}

	public Empregado(String nome, NivelEmpregado nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelEmpregado getNivel() {
		return nivel;
	}

	public void setNivel(NivelEmpregado nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	
	public void adicionarContrato(HoraContrato contrato) {
		contratos.add(contrato);
		
	}
	
	public void removeContarto(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double valorMes(int ano, int mes) {
		double sum = salarioBase;
		for(HoraContrato c : contratos) {
			int c_ano = c.getData().getYear();
			int c_mes = c.getData().getMonthValue();
			
			if(ano == c_ano && mes == c_mes ) {
				sum += c.valorTotal();
			}		
		}
		return 	sum;
	}
	
	
}