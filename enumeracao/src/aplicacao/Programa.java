package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Empregado;
import entidades.HoraContrato;
import entidadesEnum.NivelEmpregado;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome:");
		String nomeEmpregado = sc.nextLine();
		System.out.print("Nivel do empregado: ");
		String nivelEmpregado = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBaseEmp = sc.nextDouble();
		
		Empregado empregado = new Empregado(nomeEmpregado,NivelEmpregado.valueOf(nivelEmpregado) , salarioBaseEmp, new Departamento(nomeDepartamento));
		
		
		System.out.print("Quantos contratos tem esse empregado: ");
		int qntdContEmpre = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i <= qntdContEmpre; i++) {
			System.out.println("Entre com os dados do "+ i +"° contrato");
			System.out.print("Data (DD/MM/YYYY):");
			String N = sc.next();
			LocalDate diaContrato = LocalDate.parse(N,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int duracaoCont = sc.nextInt();
			
			HoraContrato contrato1 = new HoraContrato(diaContrato, valorHora, duracaoCont);
			
			empregado.adicionarContrato(contrato1);
			
			}
		
		System.out.println();
		
		System.out.println("Entre com mês e ano para calcular o salário (MM/YYYY): ");
		String mesEano = sc.next();
		
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		
		System.out.println("Name: " + empregado.getNome());
		System.out.println("Department " + empregado.getDepartamento().getNomeDepartamento());
		System.out.println("O empregado ganho em "+ mesEano + " : " + String.format("%.2f", empregado.valorMes(ano, mes)));
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
