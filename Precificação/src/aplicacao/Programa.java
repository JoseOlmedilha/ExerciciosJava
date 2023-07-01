package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Produto> list = new ArrayList<>();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Entre com a quantidade de produto: ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n ; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Produto " + i +":");
			System.out.print("O produto é novo, usado ou importado (n/u/i) :");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Digite o preço: ");
			double preco = sc.nextDouble();
			
			if( c == 'i') {
				System.out.print("Digite a taxa: ");
				double taxa = sc.nextInt();
				list.add(new ProdutoImportado(nome, preco,taxa));
			}
			else 
				if (c == 'u') {
					
					sc.nextLine();
					System.out.print("Digite a data");
					String data = sc.nextLine();
					LocalDate fabri = LocalDate.parse(data, fmt1);
					
					list.add(new ProdutoUsado(nome,preco ,fabri));
			}
			else {
				
				list.add(new Produto(nome , preco));
			}
			
		}
		
		System.out.println();
		System.out.println("PREÇOS");
		
		for(Produto x : list)
			System.out.println(x.tagPreco());
		
		
		
		
		
		
		sc.close();
	}

}
