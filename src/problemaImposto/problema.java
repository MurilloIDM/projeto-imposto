package problemaImposto;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Declaração e leitura de variáveis
		double rendaAnualSalario, rendaAnualServicos, rendaAnualCapital, gastosMedicos, gastosEducacionais;
		
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
		
		input.close();

	}

}
