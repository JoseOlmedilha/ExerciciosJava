package aplication;

import java.util.Scanner;

import entidades.Conta;
import excecao.MainExcecao;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Entre com os dados da conta");
			System.out.print("Número: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do títular: ");
			String nome = sc.nextLine();
			System.out.print("Saldo: ");
			Double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			Conta conta1 = new Conta(numero, nome, saldo, limiteSaque);
			
			System.out.print("Quanto deseja sacar: ");
			Double sacar = sc.nextDouble();
			
			conta1.sacar(sacar);
			
			System.out.println("O seu saldo é " + conta1.getSaldo());
		}
		catch(MainExcecao e){
			System.out.println("Houve um errro: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Houve um erro na hora da execução, favor verificar os dados digitados ");
		}
		
		catch(Exception e) {
			System.out.println("Houve um erro");	
		}
		
		sc.close();
	}

}
