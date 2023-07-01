package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Empregado;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos empregados deseja registrar: ");
		int registrar = sc.nextInt();
		
	
		for (int i = 0; i < registrar ; i++) {
			System.out.println();
			System.out.println("Empregado #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			
			while(hasId(list, id)){
				System.out.println("Já existe esse id");
				System.out.print("Digite outro id: ");	
				id = sc.nextInt();
				}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			
			Empregado emp1 = new Empregado(id, nome , salario);
				
			list.add(emp1);
			
			}
		
			System.out.print("Entre com o Id do funcionário que deseja aumentar: ");
			int salarioid = sc.nextInt();
			Integer posId = posicaoId(list , salarioid);
			if(posId == null) {
				System.out.println("Esse id não existe");
			}else {
				System.out.print("Qual a porcentagem para aumentar: ");
				double porcen = sc.nextDouble();
			
				list.get(posId).aumentarSalario(porcen);
			}
		
		
		
			for (Empregado x :list ) {
				System.out.println(x);
			}
		
			sc.close();

		}
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	
	public static Integer posicaoId(List<Empregado> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
				
			}	
		}
		return null;
	}
}
