package atividadeBigDecimal;

import java.util.Locale;
import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor da sua compra: ");
		double valorCompra = scanner.nextDouble(); 
		
		System.out.println("Informe o número de parcelas: ");
		Integer valorParcela = scanner.nextInt();
		
		Pagamento pagamento = new Pagamento(valorCompra, valorParcela);
		System.out.println(pagamento);

	}

}
