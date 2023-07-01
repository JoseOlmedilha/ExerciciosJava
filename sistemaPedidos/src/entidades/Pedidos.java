package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entidades.Enum.StatusPedido;

public class Pedidos {
	
	
	private LocalDateTime momento;
	private StatusPedido status;
	private Cliente cliente;
	
	private List<ProdutosPedidos> itemPedido = new ArrayList<>();
	
	public Pedidos() {
		
	}
	
	public Pedidos(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public void addPedido(ProdutosPedidos p) {
		itemPedido.add(p);
	}
	
	public void removePedido(ProdutosPedidos p ) {
		itemPedido.remove(p);
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ProdutosPedidos> getPedido() {
		return itemPedido;
	}
	
	public double total() {
		double sum = 0;
		for(ProdutosPedidos p : itemPedido) {
			sum += p.subTotal();	
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedidos: \n");
		for(ProdutosPedidos i : itemPedido) {
			sb.append(i + "\n");
		}
		sb.append("Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}

}
