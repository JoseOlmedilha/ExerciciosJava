package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class programa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i +"° Pessoa: ");
			System.out.print("Física ou Jurídica? (f/j)");
			char c = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			
			if(c == 'f') {
				System.out.print("Gasto com saúde: ");
				double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, gastoSaude));
				
			}else
				if(c == 'j') {
					System.out.print("Número de empregado: ");
					int emp = sc.nextInt();
					
					list.add(new PessoaJuridica(nome, renda, emp));
					
				}
				else {
					System.out.println("Erro na declaração de pessoa");
					
				}
			}
		
		System.out.println();
		double sum = 0.0;
		System.out.println("IMPOSTOS PAGOS");
		for(Pessoa x : list) {
			System.out.println(x.getNome() + " R$: " +String.format("%.2f",x.imposto()));
			sum += x.imposto();
		}
		System.out.println();
		System.out.println("Total de taxas: R$ " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
