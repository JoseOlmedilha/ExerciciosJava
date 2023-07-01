package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedidos;
import entidades.Produto;
import entidades.ProdutosPedidos;
import entidades.Enum.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente: ");
		System.out.println();
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Digite o E-mail: ");
		String email = sc.nextLine();
		System.out.println("Digite a data de aniversario: ");
		LocalDate aniversario = LocalDate.parse(sc.nextLine(), fmt1);
		
		Cliente c1 = new Cliente(nome, email, aniversario);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.nextLine());
		
		
		Pedidos pedido = new Pedidos(LocalDateTime.now(), status, c1);
		
		
		System.out.print("Quantos itens vão ser pedidos: ");
		int n = sc.nextInt();

		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com o " + i +"° item: ");
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			Double pracoProduto = sc.nextDouble();
			
			Produto produto1 = new Produto(nomeProduto, pracoProduto);
			
			System.out.print("Digite a quantidade: ");
			int qntd = sc.nextInt();
			
			ProdutosPedidos pedido1 = new ProdutosPedidos(qntd, pracoProduto, produto1);
			
			pedido.addPedido(pedido1);
			}
		
		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);
		
		
		
		
		sc.close();
	}

}
