package problemaImposto;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Declaração e leitura de variáveis
		double rendaAnualSalario, rendaAnualServicos, rendaAnualCapital, gastosMedicos, gastosEducacionais;
		double salarioMensal, impostoSalario, impostoServicos, impostoGanhos;
		
		impostoSalario = 0;
		
		System.out.print("Renda anual com salário: ");
		rendaAnualSalario = input.nextDouble();
		System.out.print("Renda anual com prestação de serviços: ");
		rendaAnualServicos = input.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaAnualCapital = input.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = input.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = input.nextDouble();
		
		//Consolidando rendas
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA:");
		System.out.println();
		
		salarioMensal = rendaAnualSalario / 12.0;
		
		if (salarioMensal < 3000.00) {
			impostoSalario = 0;
		} else if (salarioMensal >= 3000 && salarioMensal <= 5000) {
			impostoSalario = rendaAnualSalario * 0.10;
		} else {
			impostoSalario = rendaAnualSalario * 0.20;
		}
		
		impostoServicos = rendaAnualServicos * 0.15;
		impostoGanhos = rendaAnualCapital * 0.20;
		
		System.out.println("CONSOLIDANDO RENDA: ");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhos);
		
		input.close();

	}

}
