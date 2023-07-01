package modelo.entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaQaurto {
	
	private Integer numeroQuarto; 
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
	
	public ReservaQaurto(Integer numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
		this.numeroQuarto = numeroQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}


	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}


	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}


	public LocalDate getDataEntrada() {
		return dataEntrada;
	}


	public LocalDate getDataSaida() {
		return dataSaida;
	}


	public long duracao() {
		Duration t1 = Duration.between(dataSaida.atStartOfDay(), dataEntrada.atStartOfDay());
		return t1.toDays();
	}
	
	public void attDatas(LocalDate entrada, LocalDate saida) {
		this.dataEntrada = entrada;
		this.dataSaida = saida;
		
	}
	
	@Override
	public String toString() {
		return "Qaurto: " + numeroQuarto + ", entrada : " 
				+ dataEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ ", saida: " + dataSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ duracao() + "noites.";
				
	}
	
	
	
	
	
}
