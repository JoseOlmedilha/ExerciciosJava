package entidades;

import java.time.LocalDate;

public class HoraContrato {

	private LocalDate data;
	private Double valorHora;
	private Integer hora;
	
	public HoraContrato() {	
	}
	
public HoraContrato(LocalDate data, Double valorHora, Integer hora) {
		
		this.data = data;
		this.valorHora = valorHora;
		this.hora = hora;
	}

public LocalDate getData() {
	return data;
}

public void setData(LocalDate data) {
	this.data = data;
}

public Double getValorHora() {
	return valorHora;
}

public void setValorHora(Double valorHora) {
	this.valorHora = valorHora;
}

public Integer getHora() {
	return hora;
}

public void setHora(Integer hora) {
	this.hora = hora;
}

public double valorTotal() {
	return valorHora * hora;
}
	
	
}
